import { MatSnackBar } from '@angular/material/snack-bar';
import { MatDialog } from '@angular/material/dialog';
import { Coordenador } from './../../../models/coordenador';
import { FormGroup, FormControl } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { CoordenadorService } from 'src/app/services/coordenador.service';
import { cpf } from 'cpf-cnpj-validator';
import { DialogElementsComponent } from '../../dialog-elements/dialog-elements.component';
import { CpfToltipComponent } from '../../validacao/cpf-toltip/cpf-toltip.component';

@Component({
  selector: 'app-coordenador',
  templateUrl: './coordenador.component.html',
  styleUrls: ['./coordenador.component.scss']
})
export class CoordenadorComponent implements OnInit {

  coordenadorform: FormGroup;

  constructor(private service: CoordenadorService, public dialog: MatDialog, private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
    this.creatform(new Coordenador());
  }

  creatform(coordenador: Coordenador) {
    this.coordenadorform = new FormGroup({
      nome: new FormControl(coordenador.nome),
      cpf: new FormControl(coordenador.cpf),
      senha: new FormControl(coordenador.senha),
      secretaria: new FormControl(coordenador.secretaria),
    })
  }

  confirm() {
    if (cpf.isValid(this.coordenadorform.controls['cpf'].value.toString())) {
      console.log("passou");
      let coordenador = new Coordenador();
      coordenador.cpf = this.coordenadorform.controls['cpf'].value;
      coordenador.nome = this.coordenadorform.controls['nome'].value;
      coordenador.secretaria = this.coordenadorform.controls['secretaria'].value;
      coordenador.senha = this.coordenadorform.controls['senha'].value;
      this.service.postusuario(coordenador).subscribe((data: any) => {
        this.openDialog();
      },(error: any) => { console.log(error) });
    } else { 
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
