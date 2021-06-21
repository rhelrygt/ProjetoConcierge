import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { CadastrarUsuarioComponent } from './cadastrar-usuario/cadastrar-usuario.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {CalendarModule} from 'primeng/calendar';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatRadioModule} from '@angular/material/radio';
import {MatSelectModule} from '@angular/material/select';
import { HttpClientModule } from '@angular/common/http';
import { UpdateUsuarioComponent } from './update-usuario/update-usuario.component';
import {MatDialogModule} from '@angular/material/dialog';

import {MatSnackBarModule} from '@angular/material/snack-bar';
import { CpfToltipComponent } from './components/validacao/cpf-toltip/cpf-toltip.component';
import { UsuarioComponent } from './components/cadastros/usuario/usuario.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { LoginComponent } from './components/login/login.component';
import { AlunoComponent } from './components/cadastros/aluno/aluno.component';
import { ProfessorComponent } from './components/cadastros/professor/professor.component';
import { AdminComponent } from './components/cadastros/admin/admin.component';
import { CoordenadorComponent } from './components/cadastros/coordenador/coordenador.component';
import { CursoComponent } from './components/cadastros/curso/curso.component';
import { TurmaComponent } from './components/cadastros/turma/turma.component';
import { HomeComponent } from './components/home/home.component';






@NgModule({
  declarations: [
    AppComponent,
    DataBindingComponent,
    CadastrarUsuarioComponent,
      UpdateUsuarioComponent,
      LoginComponent,
      CpfToltipComponent,
      UsuarioComponent,
      HomepageComponent,
      AlunoComponent,
      ProfessorComponent,
      AdminComponent,
      CoordenadorComponent,
      CursoComponent,
      TurmaComponent,
      HomeComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatFormFieldModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    CalendarModule,
    MatCheckboxModule,
    MatRadioModule,
    ReactiveFormsModule,
    MatSelectModule,
    HttpClientModule,
    MatDialogModule,
    MatSnackBarModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
