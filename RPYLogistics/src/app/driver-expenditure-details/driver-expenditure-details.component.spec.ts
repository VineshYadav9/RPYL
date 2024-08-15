import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DriverExpenditureDetailsComponent } from './driver-expenditure-details.component';

describe('DriverExpenditureDetailsComponent', () => {
  let component: DriverExpenditureDetailsComponent;
  let fixture: ComponentFixture<DriverExpenditureDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DriverExpenditureDetailsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DriverExpenditureDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
