import { MatSnackBar } from '@angular/material/snack-bar';
import { DialogElementsComponent } from './../../dialog-elements/dialog-elements.component';
import { Aluno } from './../../../models/aluno';
import { MatDialog } from '@angular/material/dialog';
import { FormGroup, FormControl } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { AlunoService } from 'src/app/services/aluno.service';
import { cpf } from 'cpf-cnpj-validator';
import { CpfToltipComponent } from '../../validacao/cpf-toltip/cpf-toltip.component';

@Component({
  selector: 'app-aluno',
  templateUrl: './aluno.component.html',
  styleUrls: ['./aluno.component.scss']
})
export class AlunoComponent implements OnInit {
  checked = false;
  indeterminate = false;
  labelPosition: 'before' | 'after' = 'after';
  disabled = false;
  date2: Date = new Date;
  es: any;
  userform: FormGroup;
  toppingList: any[] = [{ label: 'Matutino', value: 'M' }, { label: 'Vespertino', value: 'V' }, { label: 'Noturno', value: 'N' }];


  constructor(private service: AlunoService, public dialog: MatDialog, private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
    this.creatform(new Aluno());
  }

  creatform(usuario: Aluno) {
    this.userform = new FormGroup({
      nome: new FormControl(usuario.nome),
      telefone: new FormControl(usuario.telefone),
      cpf: new FormControl(usuario.cpf),
      senha: new FormControl(usuario.senha),
      num_rg: new FormControl(usuario.num_rg),
      orgao_expedidor: new FormControl(usuario.orgao_expedidor),
      data_nascimento: new FormControl(usuario.data_nascimento),
      sexo: new FormControl(usuario.sexo),
      rua: new FormControl(usuario.rua),
      bairro: new FormControl(usuario.bairro),
      complemento: new FormControl(usuario.complemento),
      cidade: new FormControl(usuario.cidade),
      naturalidade: new FormControl(usuario.naturalidade),
      nome_pai: new FormControl(usuario.nome_pai),
      nome_mae: new FormControl(usuario.nome_mae),
      estado_civil: new FormControl(usuario.estado_civil),
      ocupacao: new FormControl(usuario.ocupacao),
      renda: new FormControl(usuario.renda),
      tipo_residencia: new FormControl(usuario.tipo_residencia),
      escolaridade: new FormControl(usuario.escolaridade),
      pcdef: new FormControl(usuario.pcdef),
      disp_horario: new FormControl(usuario.disp_horario)
    })

  }

  openSnackBar() {
    this._snackBar.openFromComponent(CpfToltipComponent, { duration: 2000 });
  }

  confirm() {

    if (cpf.isValid(this.userform.controls['cpf'].value.toString())) {
      let usuario1 = new Aluno();
      usuario1.nome = this.userform.controls['nome'].value;
      usuario1.telefone = this.userform.controls['telefone'].value;
      usuario1.cpf = this.userform.controls['cpf'].value;
      usuario1.senha = this.userform.controls['senha'].value;
      usuario1.num_rg = this.userform.controls['num_rg'].value;
      usuario1.orgao_expedidor = this.userform.controls['orgao_expedidor'].value;
      usuario1.data_nascimento = this.userform.controls['data_nascimento'].value;
      usuario1.sexo = this.userform.controls['sexo'].value;
      usuario1.rua = this.userform.controls['rua'].value;
      usuario1.bairro = this.userform.controls['bairro'].value;
      usuario1.complemento = this.userform.controls['complemento'].value;
      usuario1.cidade = this.userform.controls['cidade'].value;
      usuario1.naturalidade = this.userform.controls['naturalidade'].value;
      usuario1.nome_pai = this.userform.controls['nome_pai'].value;
      usuario1.nome_mae = this.userform.controls['nome_mae'].value;
      usuario1.estado_civil = this.userform.controls['estado_civil'].value;
      usuario1.ocupacao = this.userform.controls['ocupacao'].value;
      usuario1.renda = this.userform.controls['renda'].value;
      usuario1.tipo_residencia = this.userform.controls['tipo_residencia'].value;
      usuario1.escolaridade = this.userform.controls['escolaridade'].value;
      usuario1.pcdef = this.userform.controls['pcdef'].value;
      usuario1.disp_horario = this.userform.controls['disp_horario'].value;
      this.service.postusuario(usuario1).subscribe((data: any) => {
        //console.log("olha aqui:", data)
        this.openDialog();
        //localStorage.setItem('usuarioId', data['id']);
      }, (error: any) => { console.log(error) });
    } else {
      this.openSnackBar();
    }
  }

  openDialog() {
    this.dialog.open(DialogElementsComponent);
  }

}
