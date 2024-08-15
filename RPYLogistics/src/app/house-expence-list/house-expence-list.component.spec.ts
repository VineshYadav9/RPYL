import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HouseExpenceListComponent } from './house-expence-list.component';

describe('HouseExpenceListComponent', () => {
  let component: HouseExpenceListComponent;
  let fixture: ComponentFixture<HouseExpenceListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HouseExpenceListComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(HouseExpenceListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
