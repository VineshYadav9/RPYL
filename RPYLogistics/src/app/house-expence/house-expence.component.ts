import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-house-expence',
  standalone: true,
  imports: [CommonModule,RouterLink],
  templateUrl: './house-expence.component.html',
  styleUrl: './house-expence.component.css'
})
export class HouseExpenceComponent {

}
