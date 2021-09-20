import { Router } from '@angular/router';
import { CursoService } from 'src/app/services/curso.service';
import { FormGroup, FormControl } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Curso } from 'src/app/models/curso';

@Component({
  selector: 'app-curso-cadastro',
  templateUrl: './curso-cadastro.component.html',
  styleUrls: ['./curso-cadastro.component.scss']
})
export class CursoCadastroComponent implements OnInit {

  cursoform: FormGroup;


  constructor(private service:CursoService, private route: Router) { }

  ngOnInit(): void {
    this.creatform(new Curso());
  }

  creatform(curso:Curso){
    this.cursoform=new FormGroup({
      id: new FormControl(curso.id),
      nome_curso:new FormControl(curso.nome_curso),
      descricao_curso:new FormControl(curso.descricao_curso),
      carga_horaria:new FormControl(curso.carga_horaria),
    })
  }

  confirm(){

    let curso =  new Curso();
    this.cursoform.controls['id'].value ? curso.id = this.cursoform.controls['id'].value : null;
    curso.nome_curso = this.cursoform.controls['nome_curso'].value;
    curso.descricao_curso = this.cursoform.controls['descricao_curso'].value;
    curso.carga_horaria = this.cursoform.controls['carga_horaria'].value;
    console.log(curso);
    this.service.postCurso(curso).subscribe((data:any)=>{
      alert("Curso cadastrado com sucesso");
      this.route.navigate(['/coordenador'])
    }, (error:any)=>{console.log(error)});

  }

}
