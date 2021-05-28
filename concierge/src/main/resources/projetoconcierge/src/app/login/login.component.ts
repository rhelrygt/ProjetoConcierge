import { LoginService } from './../services/login.service';
import { FormGroup, FormControl } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { cpf } from 'cpf-cnpj-validator'; 
import {MatSnackBar} from '@angular/material/snack-bar';
import { CpfToltipComponent } from '../components/validacao/cpf-toltip/cpf-toltip.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginform: FormGroup;

  constructor(private service: LoginService, private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
    this.createForm();
  }

  openSnackBar() {
    this._snackBar.openFromComponent(CpfToltipComponent,{duration:2000});
  }

  createForm(){
    this.loginform = new FormGroup({
      cpf: new FormControl(''),
      senha: new FormControl('')
    })
  }

  onClickLogin(){ 
    if(cpf.isValid(this.loginform.controls['cpf'].value.toString())){
      let user : any = {username:this.loginform.controls['cpf'].value.toString(), password:this.loginform.controls['senha'].value};
      console.log(user);
    this.service.postLogin(user).subscribe((data:any)=>{
    }, (error:any)=>{console.log(error)});
    }else{
      this.openSnackBar();
    };
    

  }

}
