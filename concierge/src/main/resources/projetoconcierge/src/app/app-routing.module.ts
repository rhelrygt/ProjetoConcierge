import { LoginComponent } from './login/login.component';
import { HomeComponent } from './components/home/home.component';
import { UpdateUsuarioComponent } from './update-usuario/update-usuario.component';
import { CadastrarUsuarioComponent } from './cadastrar-usuario/cadastrar-usuario.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DataBindingComponent } from './data-binding/data-binding.component';

const routes: Routes = [
  {path:"primeiro", component: DataBindingComponent},
  {path:"cadastrar-usuario", component: CadastrarUsuarioComponent},
  {path:"update-usuario", component: UpdateUsuarioComponent},
  {path:"home", component: HomeComponent},
  {path:"login", component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
