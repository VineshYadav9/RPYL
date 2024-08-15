import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-loading-details',
  standalone: true,
  imports: [CommonModule,RouterLink,ReactiveFormsModule],
  templateUrl: './loading-details.component.html',
  styleUrl: './loading-details.component.css'
})
export class LoadingDetailsComponent {
  profileForm = new FormGroup({
    firstName: new FormControl(),
    lastName: new FormControl(),
  });

  onSubmit() {
    // TODO: Use EventEmitter with form value
    console.warn(this.profileForm.value);
  }
}
