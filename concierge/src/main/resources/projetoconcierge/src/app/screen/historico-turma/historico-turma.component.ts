import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-historico-turma',
  templateUrl: './historico-turma.component.html',
  styleUrls: ['./historico-turma.component.scss']
})
export class HistoricoTurmaComponent implements OnInit {

  Turma = {nome:"Informática Básica", dataInicio:"10/04/1998", dataFinal:"10/04/2087", horario:"22:00 ás 23:00", vagas:10, local:"Cine",n1:1.5,n2:3.2,status:"Reprovado"}
  ArrayHistorico = [{data:"15/09/2352",status:"PRESENTE"},{data:"16/03/2015",status:"PRESENTE"}]

  constructor() { }

  ngOnInit(): void {
  }

}
