import { FormGroup, FormControl } from '@angular/forms';
import { ProfessorService } from 'src/app/services/professor.service';
import { Component, OnInit } from '@angular/core';
import { Turma } from 'src/app/models/turma';
import { TurmaService } from 'src/app/services/turma.service';
import { CursoService } from 'src/app/services/curso.service';

@Component({
  selector: 'app-turma-cadastro',
  templateUrl: './turma-cadastro.component.html',
  styleUrls: ['./turma-cadastro.component.scss']
})
export class TurmaCadastroComponent implements OnInit {
  professorArray: Array<any> = [];
  cursoArray: Array<any> = [];
  turmaForm: FormGroup;

  constructor(private professorService: ProfessorService, private service: TurmaService, private cursoService: CursoService) { }

  ngOnInit(): void {
    this.getListProfessor();
    this.getListCursos();
    this.creatform(new Turma());
  }

  getListProfessor() {
    this.professorService.getAll().toPromise().then(data => {
      this.professorArray = data;
      this.professorArray = (this.professorArray.map(function (user) {
        return { id: user[0], nome: user[1] }
      }))
    })
  }

  getListCursos() {
    this.cursoService.getCursoList().toPromise().then(data => {
      this.cursoArray = data;
      this.cursoArray = (this.cursoArray.map(function (curso) {
        return { id: curso.id, nome: curso.nome_curso }
      }))
    })
  }

  creatform(turma: Turma) {
    this.turmaForm = new FormGroup({
      id: new FormControl(turma.id),
      curso: new FormControl(turma.id_curso),
      professor: new FormControl(turma.id_professor),
      dataInicio: new FormControl(turma.data_inicio),
      dataFim: new FormControl(turma.data_fim),
      horaInicio: new FormControl(turma.horario_inicio),
      horaFim: new FormControl(turma.horario_final),
      local: new FormControl(turma.local_turma),
      periodo: new FormControl(turma.periodo_inscricao),
      quantidade: new FormControl(turma.qtdMax_alunos),
    })
  }

  confirm() {

    let turma = new Turma();
    this.turmaForm.controls['id'].value ? turma.id = this.turmaForm.controls['id'].value : null;

    turma.id_curso = this.turmaForm.controls['curso'].value;
    turma.id_professor = this.turmaForm.controls['professor'].value;
    turma.data_inicio = this.turmaForm.controls['dataInicio'].value;
    turma.data_fim = this.turmaForm.controls['dataFim'].value;
    turma.horario_inicio = this.turmaForm.controls['horaInicio'].value;
    turma.horario_final = this.turmaForm.controls['horaFim'].value;
    turma.local_turma = this.turmaForm.controls['local'].value;
    turma.periodo_inscricao = this.turmaForm.controls['periodo'].value;
    turma.qtdMax_alunos = this.turmaForm.controls['quantidade'].value;
    console.log(turma);


    this.service.postTurma(turma).subscribe((data: any) => {
    }, (error: any) => { console.log(error) });

  }

}
