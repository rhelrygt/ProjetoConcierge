import { TurmaComponent } from './components/cadastros/turma/turma.component';
import { ProfessorComponent } from './components/cadastros/professor/professor.component';
import { AlunoComponent } from './components/cadastros/aluno/aluno.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { LoginComponent } from './components/login/login.component';
import { UpdateUsuarioComponent } from './update-usuario/update-usuario.component';
import { CadastrarUsuarioComponent } from './cadastrar-usuario/cadastrar-usuario.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { UsuarioComponent } from './components/cadastros/usuario/usuario.component';
import { AdminComponent } from './components/cadastros/admin/admin.component';
import { CursoComponent } from './components/cadastros/curso/curso.component';

const routes: Routes = [
  {path:"primeiro", component: DataBindingComponent},
  {path:"cadastrar-usuario", component: UsuarioComponent},
  {path:"update-usuario", component: UpdateUsuarioComponent},
  {path:"login", component: LoginComponent},
  {path:"aluno", component: LoginComponent},
  {path:"cadastrar/aluno", component: AlunoComponent},
  {path:"", component: HomepageComponent},
  {path:"admin/cadastrar/usuario", component: AdminComponent},
  {path:"admin/cadastrar/curso", component: CursoComponent},
  {path:"admin/cadastrar/turma", component: TurmaComponent},



  //{path: '', redirectTo: 'home', pathMatch: 'prefix' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
