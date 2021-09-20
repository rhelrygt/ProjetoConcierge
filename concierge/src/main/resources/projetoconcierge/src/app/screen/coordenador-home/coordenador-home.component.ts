import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-coordenador-home',
  templateUrl: './coordenador-home.component.html',
  styleUrls: ['./coordenador-home.component.scss']
})
export class CoordenadorHomeComponent implements OnInit {

  coordenador:any = {nome:""}

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.coordenador.nome = localStorage.getItem('nome')
  }

  goToCadastro(){
    this.router.navigate(['/coordenador/cadastro']);
  }

  goToCadastroCurso(){
    this.router.navigate(['cursos/cadastro'])
  }

  goToCadastroTurma(){
    this.router.navigate(['turmas/cadastro'])
  }

}
