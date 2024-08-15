import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HouseExpenceComponent } from './house-expence.component';

describe('HouseExpenceComponent', () => {
  let component: HouseExpenceComponent;
  let fixture: ComponentFixture<HouseExpenceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HouseExpenceComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(HouseExpenceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
