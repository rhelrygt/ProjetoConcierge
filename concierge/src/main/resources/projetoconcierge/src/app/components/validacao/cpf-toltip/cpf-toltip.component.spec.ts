import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CpfToltipComponent } from './cpf-toltip.component';

describe('CpfToltipComponent', () => {
  let component: CpfToltipComponent;
  let fixture: ComponentFixture<CpfToltipComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CpfToltipComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CpfToltipComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
