import { DialogElementsComponent } from './../../dialog-elements/dialog-elements.component';
import { MatDialog } from '@angular/material/dialog';
import { UsuarioService } from './../../../services/usuario.service';
import { FormGroup, FormControl } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/models/usuario';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.scss']
})
export class UsuarioComponent implements OnInit {

  userform: FormGroup;

  constructor(private service:UsuarioService, public dialog: MatDialog) { }

  ngOnInit(): void {
    this.creatform(new Usuario());
  }

  creatform(usuario:Usuario){
    this.userform=new FormGroup({
      nome:new FormControl(usuario.nome),
      cpf:new FormControl(usuario.cpf),
      senha:new FormControl(usuario.senha)
    })
  }

  confirm(){

    let usuario1 =  new Usuario();
    usuario1.nome = this.userform.controls['nome'].value;
    usuario1.cpf = this.userform.controls['cpf'].value;
    usuario1.senha = this.userform.controls['senha'].value;
    
    this.service.postusuario(usuario1).subscribe((data:any)=>{
      this.openDialog();
      //localStorage.setItem('usuarioId',data['id']);
    }, (error:any)=>{console.log(error)});

  }

  openDialog() {
    this.dialog.open(DialogElementsComponent);
  }

}
