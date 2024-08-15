import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-house-material-expence',
  standalone: true,
  imports: [CommonModule,RouterLink,ReactiveFormsModule],
  templateUrl: './house-material-expence.component.html',
  styleUrl: './house-material-expence.component.css'
})
export class HouseMaterialExpenceComponent {
  profileForm = new FormGroup({
    firstName: new FormControl(),
    lastName: new FormControl(),
  });

  onSubmit() {
    // TODO: Use EventEmitter with form value
    console.warn(this.profileForm.value);
  }

}
