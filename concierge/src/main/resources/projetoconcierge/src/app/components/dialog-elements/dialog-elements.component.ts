import { MatDialog } from '@angular/material/dialog';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-dialog-elements',
  templateUrl: './dialog-elements.component.html',
  styleUrls: ['./dialog-elements.component.scss']
})
export class DialogElementsComponent implements OnInit {

  constructor(private router: Router, public dialog: MatDialog) {}

  ngOnInit() {
  }
  goToUpdateUsuario() {
    this.router.navigate(['/update-usuario']);
    this.dialog.closeAll();
}

closeDialog() {
  this.router.navigate(['/']);
  this.dialog.closeAll();
}

}
