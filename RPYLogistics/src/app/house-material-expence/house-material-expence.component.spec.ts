import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HouseMaterialExpenceComponent } from './house-material-expence.component';

describe('HouseMaterialExpenceComponent', () => {
  let component: HouseMaterialExpenceComponent;
  let fixture: ComponentFixture<HouseMaterialExpenceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HouseMaterialExpenceComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(HouseMaterialExpenceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
