import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { LoginService } from '../../services/login.service';
import { FormGroup, FormControl } from '@angular/forms';
import { cpf } from 'cpf-cnpj-validator';
import { MatSnackBar } from '@angular/material/snack-bar';
import { CpfToltipComponent } from 'src/app/components/validacao/cpf-toltip/cpf-toltip.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  loginform: FormGroup;

  constructor(private service: LoginService, private _snackBar: MatSnackBar, private router: Router) { }

  ngOnInit(): void {
    this.createForm();
  }

  openSnackBar() {
    this._snackBar.openFromComponent(CpfToltipComponent, { duration: 2000 });
  }

  createForm() {
    this.loginform = new FormGroup({
      cpf: new FormControl(''),
      senha: new FormControl('')
    })
  }

  onClickLogin() { //70000000023
    console.log("Teste");
    let user: any = { username: this.loginform.controls['cpf'].value.toString(), password: this.loginform.controls['senha'].value };
    if (cpf.isValid(this.loginform.controls['cpf'].value.toString())) {
      let user: any = { username: this.loginform.controls['cpf'].value, password: this.loginform.controls['senha'].value };
      this.service.postLogin(user).subscribe((data: any) => {
        if(data.papel){
          localStorage.setItem('id', data.id)
          localStorage.setItem('nome', data.nome)
          localStorage.setItem('papel', data.papel)
          this.router.navigate(['/'+data.papel]);
        }else{
          localStorage.clear();
          alert("Usuario ou senha incorretos")
        }
        
      }, (error: any) => { });
    } else {
      this.openSnackBar();
    };
  }

}
