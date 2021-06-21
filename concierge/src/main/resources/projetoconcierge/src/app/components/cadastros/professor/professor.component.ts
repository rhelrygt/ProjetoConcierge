import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { cpf } from 'cpf-cnpj-validator';
import { Professor } from './../../../models/professor';
import { FormGroup, FormControl } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { CpfToltipComponent } from '../../validacao/cpf-toltip/cpf-toltip.component';
import { ProfessorService } from 'src/app/services/professor.service';
import { DialogElementsComponent } from '../../dialog-elements/dialog-elements.component';

@Component({
  selector: 'app-professor',
  templateUrl: './professor.component.html',
  styleUrls: ['./professor.component.scss']
})
export class ProfessorComponent implements OnInit {

  userform: FormGroup;

  constructor(private service: ProfessorService, public dialog: MatDialog, private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
    this.creatform(new Professor());
  }

  creatform(professor:Professor){
    this.userform=new FormGroup({
      nome:new FormControl(professor.nome),
      cpf:new FormControl(professor.cpf),
      senha:new FormControl(professor.senha),
      curso_superior: new FormControl(professor.curso_superior),
      especialidade: new FormControl(professor.especialidade)
    })
  }

  confirm(){
    if (cpf.isValid(this.userform.controls['cpf'].value.toString())){
      let user = new Professor()
      user.cpf = this.userform.controls['cpf'].value;
      user.curso_superior = this.userform.controls['curso_superior'].value;
      user.especialidade = this.userform.controls['especialidade'].value;
      user.nome = this.userform.controls['nome'].value;
      user.senha = this.userform.controls['senha'].value;
      this.service.postusuario(user).subscribe((data: any) => {
        this.openDialog();
      }, (error: any) => { console.log(error) });
    }else{
      this.openSnackBar();
    }
  }

  openDialog() {
    this.dialog.open(DialogElementsComponent);
  }

  openSnackBar() {
    this._snackBar.openFromComponent(CpfToltipComponent, { duration: 2000 });
  }

}
