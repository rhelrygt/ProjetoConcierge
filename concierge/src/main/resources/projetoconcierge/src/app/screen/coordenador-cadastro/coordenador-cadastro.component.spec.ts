import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoordenadorCadastroComponent } from './coordenador-cadastro.component';

describe('CoordenadorCadastroComponent', () => {
  let component: CoordenadorCadastroComponent;
  let fixture: ComponentFixture<CoordenadorCadastroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CoordenadorCadastroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CoordenadorCadastroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
