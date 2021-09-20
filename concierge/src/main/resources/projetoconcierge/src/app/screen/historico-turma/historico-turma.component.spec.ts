import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HistoricoTurmaComponent } from './historico-turma.component';

describe('HistoricoTurmaComponent', () => {
  let component: HistoricoTurmaComponent;
  let fixture: ComponentFixture<HistoricoTurmaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HistoricoTurmaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HistoricoTurmaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
