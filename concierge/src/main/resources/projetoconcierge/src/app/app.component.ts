import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})


export class AppComponent {
  title = 'projetoconcierge';

  constructor(private router: Router) {
  }

  goToCursos() {
    this.router.navigate(['/cursos'])
  }

  goToTurmas() {
    this.router.navigate(['/turmas'])
  }

  goToContato() {
    this.router.navigate(['/contato'])
  }

  goToSobre() {
    this.router.navigate(['/sobre'])
  }

  goToHome() {
    this.router.navigate(['/']);
  }

  goToLogin() {
    this.router.navigate(['/login']);
  }

  goTo() {
    this.router.navigate(['/professor']);
  }

  readLocalStorageValue(key: string) {
    return localStorage.getItem(key);
  }

  logout(){
    alert("Você será deslogado")
    localStorage.clear();
    this.router.navigate(['/'])
  }
}


