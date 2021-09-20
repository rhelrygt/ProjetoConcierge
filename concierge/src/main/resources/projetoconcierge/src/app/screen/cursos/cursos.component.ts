import { Curso } from 'src/app/models/curso';
import { CursoService } from 'src/app/services/curso.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.scss']
})
export class CursosComponent implements OnInit {

  ArrayCursos:Array<Curso> = [];

  constructor(private router: Router, private service: CursoService) { }

  ngOnInit(): void {
    this.getCursos();
  }

  goToTurmas() {
    this.router.navigate(['/turmas'])
  }

  getCursos() {
    this.service.getCursoList().toPromise().then(data => { this.ArrayCursos = data;});
  }

}
