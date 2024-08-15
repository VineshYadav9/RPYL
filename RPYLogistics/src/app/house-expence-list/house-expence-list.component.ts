import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterLink, RouterOutlet } from '@angular/router';
import { DataTableDirective, DataTablesModule } from 'angular-datatables';
import { Config } from 'datatables.net';

@Component({
  selector: 'app-house-expence-list',
  standalone: true,
  imports: [FormsModule, DataTablesModule, HttpClientModule,
    HttpClientModule,CommonModule, RouterLink, RouterOutlet],
  templateUrl: './house-expence-list.component.html',
  styleUrl: './house-expence-list.component.css'
})
export class HouseExpenceListComponent implements OnInit, AfterViewInit{
  @ViewChild(DataTableDirective, {static: false})
  datatableElement!: DataTableDirective;

  dtOptions: Config = {};

  ngOnInit(): void {
    this.dtOptions = {
      ajax: 'http://localhost:8080/api/drivers',
      columns: [{
        title: 'Product',
        data: 'id'
      }, {
        title: 'Unit',
        data: 'firstName'
      }, {
        title: 'Rs',
        data: 'lastName'
      },
     {
      title: 'Quntity',
      data: 'firstName'
    }, {
      title: 'Date',
      data: 'firstName'
    },
 
    ]
    };
  }

  ngAfterViewInit(): void {
    this.datatableElement.dtInstance.then(dtInstance => {
      dtInstance.columns().every(function () {
        const that = this;
     
        $('input', this.footer()).on('keyup change', function () {
          
          if (that.search() !== (<HTMLInputElement>this)['value']) {
            that.search((<HTMLInputElement>this)['value'])
              .draw();
          }
        });
      });
    });
  }
}
