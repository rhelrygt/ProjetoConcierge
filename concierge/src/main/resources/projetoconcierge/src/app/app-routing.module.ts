import { ProfessorListarComponent } from './screen/professor-listar/professor-listar.component';
import { ProfessorHomeComponent } from './screen/professor-home/professor-home.component';
import { AlunoPerfilComponent } from './screen/aluno-perfil/aluno-perfil.component';
import { AlunoHomeComponent } from './screen/aluno-home/aluno-home.component';
import { SobreComponent } from './screen/sobre/sobre.component';
import { ContatoComponent } from './screen/contato/contato.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './screen/home/home.component';
import { CursosComponent } from './screen/cursos/cursos.component';
import { TurmasComponent } from './screen/turmas/turmas.component';
import { LoginComponent } from './screen/login/login.component';
import { HistoricoTurmaComponent } from './screen/historico-turma/historico-turma.component';
import { CoordenadorHomeComponent } from './screen/coordenador-home/coordenador-home.component';
import { CoordenadorCadastroComponent } from './screen/coordenador-cadastro/coordenador-cadastro.component';
import { CursoCadastroComponent } from './screen/curso-cadastro/curso-cadastro.component';
import { TurmaCadastroComponent } from './screen/turma-cadastro/turma-cadastro.component';


const routes: Routes = [
  {path:"", component: HomeComponent},
  {path:"cursos", component: CursosComponent},
  {path:"cursos/cadastro", component: CursoCadastroComponent},
  {path:"turmas", component: TurmasComponent},
  {path:"turmas/cadastro", component: TurmaCadastroComponent},
  {path:"turmas/historico", component: HistoricoTurmaComponent},
  {path:"contato", component: ContatoComponent},
  {path:"sobre", component: SobreComponent},
  {path:"login", component: LoginComponent},
  {path:"aluno", component: AlunoHomeComponent},
  {path:"aluno/perfil", component: AlunoPerfilComponent},
  {path:"coordenador", component: CoordenadorHomeComponent},
  {path:"coordenador/cadastro", component: CoordenadorCadastroComponent},
  {path:"professor", component: ProfessorHomeComponent},
  {path:"professor/listar", component: ProfessorListarComponent}
  //{path: '', redirectTo: 'home', pathMatch: 'prefix' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
