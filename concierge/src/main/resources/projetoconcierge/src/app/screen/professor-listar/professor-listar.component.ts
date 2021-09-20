import { HistoricoService } from './../../services/historico.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-professor-listar',
  templateUrl: './professor-listar.component.html',
  styleUrls: ['./professor-listar.component.scss']
})
export class ProfessorListarComponent implements OnInit {
  turma:any = {id:null}
  turmasArray: Array<any> = [];

  constructor(private service: HistoricoService) { }

  ngOnInit(): void {
    this.turma.id = localStorage.getItem("turmaId");
    this.getTurmas();

  }

  getTurmas() {
    this.service.getHistoricoByTurma(parseInt(this.turma.id)).toPromise().then(data => {
      this.turmasArray = data;
      this.turmasArray = this.turmasArray.map(function (turma) {
        return {
          id: turma[0],
          nome: turma[1],
          nota1: turma[2],
          nota2: turma[3],
        }
      })
    })
  }

}
