import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})


export class AppComponent {
  title = 'projetoconcierge';

  constructor( private router: Router) {
  }

  goToCadastrarUsuario() {
    this.router.navigate(['/cadastrar-usuario']);
  }
  goEditarUsuario(){
    this.router.navigate(['/update-usuario']);
  }
  goToHome(){
    this.router.navigate(['/home']);
  }
}


