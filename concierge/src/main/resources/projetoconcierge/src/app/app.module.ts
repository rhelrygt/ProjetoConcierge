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
import { FormsModule } from '@angular/forms';

import {MatSnackBarModule} from '@angular/material/snack-bar';
import { CpfToltipComponent } from './components/validacao/cpf-toltip/cpf-toltip.component';
import { UsuarioComponent } from './components/cadastros/usuario/usuario.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { AlunoComponent } from './components/cadastros/aluno/aluno.component';
import { ProfessorComponent } from './components/cadastros/professor/professor.component';
import { AdminComponent } from './components/cadastros/admin/admin.component';
import { CoordenadorComponent } from './components/cadastros/coordenador/coordenador.component';
import { CursoComponent } from './components/cadastros/curso/curso.component';
import { TurmaComponent } from './components/cadastros/turma/turma.component';
import { TitulosComponent } from './components/Items/titulos/titulos.component';
import { HomeComponent } from './screen/home/home.component';
import { CursosComponent } from './screen/cursos/cursos.component';
import { TurmasComponent } from './screen/turmas/turmas.component';
import { ContatoComponent } from './screen/contato/contato.component';
import { SobreComponent } from './screen/sobre/sobre.component';
import { LoginComponent } from './screen/login/login.component';
import { AlunoHomeComponent } from './screen/aluno-home/aluno-home.component';
import { HistoricoTurmaComponent } from './screen/historico-turma/historico-turma.component';
import { AlunoPerfilComponent } from './screen/aluno-perfil/aluno-perfil.component';
import { CoordenadorHomeComponent } from './screen/coordenador-home/coordenador-home.component';
import { CoordenadorCadastroComponent } from './screen/coordenador-cadastro/coordenador-cadastro.component';
import { CursoCadastroComponent } from './screen/curso-cadastro/curso-cadastro.component';
import { TurmaCadastroComponent } from './screen/turma-cadastro/turma-cadastro.component';
import { ProfessorHomeComponent } from './screen/professor-home/professor-home.component';
import { ProfessorListarComponent } from './screen/professor-listar/professor-listar.component';






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
      HomeComponent,
      TitulosComponent,
      CursosComponent,
      TurmasComponent,
      ContatoComponent,
      SobreComponent,
      AlunoHomeComponent,
      HistoricoTurmaComponent,
      AlunoPerfilComponent,
      CoordenadorHomeComponent,
      CoordenadorCadastroComponent,
      CursoCadastroComponent,
      TurmaCadastroComponent,
      ProfessorHomeComponent,
      ProfessorListarComponent
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
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
