import { HistoricoService } from './../../services/historico.service';
import { Router } from '@angular/router';
import { turmaCard } from './../../models/turmaCard';
import { Component, OnInit } from '@angular/core';
import { TurmaService } from 'src/app/services/turma.service';
import { Alert } from 'selenium-webdriver';
import { Historico } from 'src/app/models/historico';

@Component({
  selector: 'app-turmas',
  templateUrl: './turmas.component.html',
  styleUrls: ['./turmas.component.scss']
})
export class TurmasComponent implements OnInit {

  turmasArray: Array<any> = [];

  constructor(private service: TurmaService, private router: Router, private historicoService: HistoricoService) { }

  ngOnInit(): void {
    this.getTurmas();
  }

  getTurmas() {
    this.service.getTurmaList().toPromise().then(data => {
      this.turmasArray = data;
      this.turmasArray = this.turmasArray.map(function (turma) {
        return {
          id: turma[0],
          data_inicio: turma[1],
          data_final: turma[2],
          horario_inicio: turma[3],
          horario_final: turma[4],
          qtdmax: turma[5],
          local: turma[6],
          nome: turma[7]
        }
      })
    })
  }

  inscreva(idTurma: number) {
    let idUser: any
    idUser = localStorage.getItem('id');
    let papelUser = localStorage.getItem('papel');
    let historico: Historico = new Historico();
    historico.id_aluno = parseInt(idUser) + 1;
    historico.id_turma = idTurma;
    if (idUser) {
      if (papelUser == 'aluno') {
        this.historicoService.postHistorico(historico).subscribe((data =>{
          alert("Inscrição realizada com sucesso!")
          this.router.navigate(['/aluno'])
        }));
      } else {
        alert("Professores/Coordenadores não podem se inscrever")
      }
    } else {
      this.router.navigate(['/login'])
    }
  }

}
