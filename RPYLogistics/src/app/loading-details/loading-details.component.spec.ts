import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoadingDetailsComponent } from './loading-details.component';

describe('LoadingDetailsComponent', () => {
  let component: LoadingDetailsComponent;
  let fixture: ComponentFixture<LoadingDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LoadingDetailsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LoadingDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
