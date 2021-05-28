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
import { LoginComponent } from './login/login.component';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { CpfToltipComponent } from './components/validacao/cpf-toltip/cpf-toltip.component';






@NgModule({
  declarations: [
    AppComponent,
    DataBindingComponent,
    CadastrarUsuarioComponent,
      UpdateUsuarioComponent,
      LoginComponent,
      CpfToltipComponent
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
    MatSnackBarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
