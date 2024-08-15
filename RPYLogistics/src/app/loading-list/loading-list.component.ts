
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterLink, RouterOutlet } from '@angular/router';
import { DataTablesModule } from 'angular-datatables';
import { DataTableDirective } from 'angular-datatables';
import { Config } from 'datatables.net';


@Component({
  selector: 'app-loading-list',
  templateUrl: './loading-list.component.html',
  standalone: true,
   imports: [FormsModule, DataTablesModule, HttpClientModule,
   HttpClientModule,CommonModule, RouterLink, RouterOutlet],
})
export class LoadingListComponent implements OnInit, AfterViewInit {

  @ViewChild(DataTableDirective, {static: false})
  datatableElement!: DataTableDirective;

  dtOptions: Config = {};

  ngOnInit(): void {
    this.dtOptions = {
      ajax: 'http://localhost:8080/api/drivers',
      columns: [{
        title: 'Vehicle number',
        data: 'id'
      }, {
        title: 'Loading Point',
        data: 'firstName'
      }, {
        title: 'Unloading Point',
        data: 'lastName'
      },
     {
      title: 'Fare Rs',
      data: 'firstName'
    }, {
      title: 'Advance Rs',
      data: 'firstName'
    },
   {
    title: 'POD Rs',
    data: 'firstName'
  },
 {
  title: 'Pay to driver',
  data: 'firstName'
},
{
  title: 'Fuel expence Rs/Lt',
  data: 'firstName'
},

 {
  title: 'Other expence',
  data: 'firstName'
},
 {
  title: 'comments',
  data: 'firstName'
},

{
  title: 'POD Rs',
  data: 'firstName'
},
{
title: 'Pay to driver',
data: 'firstName'
},
{
title: 'Fuel expence Rs/Lt',
data: 'firstName'
},

{
title: 'Other expence',
data: 'firstName'
},
{
title: 'comments',
data: 'firstName'
},

  {
    title: 'Action',
    "data":null, "render":function(data,row){
      return '<button (click) = updateClicked2() class="btn btn-warning deleteBtn">Update</button>'
    }
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
