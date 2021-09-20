import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TurmaService } from 'src/app/services/turma.service';

@Component({
  selector: 'app-professor-home',
  templateUrl: './professor-home.component.html',
  styleUrls: ['./professor-home.component.scss']
})
export class ProfessorHomeComponent implements OnInit {
  turmasArray: Array<any> = [];
  professor:any = {nome:"", id:null}

  constructor(private turmaService:TurmaService, private route:Router) { }

  ngOnInit(): void {
    this.professor.nome = localStorage.getItem('nome');
    this.professor.id = localStorage.getItem('id') ;
    this.getTurmas();
    
  }

  getTurmas() {
    this.turmaService.getTurmaListByProfessor(parseInt(this.professor.id)).toPromise().then(data => {
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

  mais(id:string){
    localStorage.setItem("turmaId",id);
    this.route.navigate(['/professor/listar'])
  }

}
