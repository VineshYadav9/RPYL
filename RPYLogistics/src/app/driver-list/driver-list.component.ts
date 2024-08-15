import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router, RouterLink, RouterOutlet } from '@angular/router';
import { DataTableDirective, DataTablesModule } from 'angular-datatables';
import { Config } from 'datatables.net';
import { data } from 'jquery';

@Component({
  selector: 'app-driver-list',
  standalone: true,
  imports: [FormsModule, DataTablesModule, HttpClientModule,
    HttpClientModule,CommonModule, RouterLink, RouterOutlet],
  templateUrl: './driver-list.component.html',
  styleUrl: './driver-list.component.css'
})
export class DriverListComponent implements OnInit, AfterViewInit{
  @ViewChild(DataTableDirective, {static: false})
  datatableElement!: DataTableDirective;

  constructor(private http: HttpClient, private router: Router) {
     
 }
  dtOptions: Config = {};
  
  ngOnInit(): void {
   
    const that = this;
    this.dtOptions = {
      
      serverSide: true, 
     // ajax: 'http://localhost:8080/api/drivers',
     ajax: (dataTablesParameters: any, callback) => {
          that.http.get<DataTablesModule>('http://localhost:8080/api/driver/drivers',
        ).subscribe(resp => {
          callback({
            // recordsTotal: resp.recordsTotal,
            // recordsFiltered: resp.recordsFiltered,
            data:resp
          });
        });
    },
      columns: [
        {
          title: 'Name',
          data: 'name'
        }, 
        {
          title: 'Father Name',
          data: 'fatherName'
        },
        {
        title: 'Aadhar',
        data: 'aadhar'
      }, 
      {
        title: 'License',
        data: 'license'
      },
     
      {
        title: 'Age',
        data: 'age'
      },
      {
        title: 'Joining Date',
        data: 'driverJoiningDate'
      },
      {
        title: 'Leaving Date',
        data: 'driverLeavingDate'
      },
      {
        title: 'Address',
        data: 'driverAddress'
      },
      {
        title: 'Comments',
        data: 'comment'
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

  updateClicked2(){
    this.router.navigate(['/driverDetails'])
    
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
