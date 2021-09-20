import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { TurmaService } from 'src/app/services/turma.service';

@Component({
  selector: 'app-aluno-home',
  templateUrl: './aluno-home.component.html',
  styleUrls: ['./aluno-home.component.scss']
})
export class AlunoHomeComponent implements OnInit {

  turmasArray: Array<any> = [];
  Aluno:any = {nome:"", id:null}

  constructor(private router:Router, private turmaService:TurmaService) { }

  ngOnInit(): void {
    this.Aluno.nome = localStorage.getItem('nome');
    this.Aluno.id = localStorage.getItem('id');
    this.getTurmas();
  }

  goToInformacoes(){
    this.router.navigate(["turmas/historico"]);
  }

  getTurmas() {
    this.turmaService.getTurmaListByAluno(parseInt(this.Aluno.id)+1).toPromise().then(data => {
      this.turmasArray = data;
      this.turmasArray = this.turmasArray.map(function (turma) { 
        return {id:turma[0], 
          data_inicio:turma[1], 
          data_final:turma[2],
          horario_inicio:turma[3],
          horario_final: turma[4],
          qtdmax: turma[5],
          local:turma[6],
          nome:turma[7]
        }
      })
    })
  }

}
