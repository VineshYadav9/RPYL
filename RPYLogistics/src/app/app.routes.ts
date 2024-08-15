import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';


export const routes: Routes = [

  {'path': '', component: DashboardComponent},
  {
    // here users route component will get lazy loaded, by using a callback with import statement!
    'path': 'loadingList', 
    loadComponent: () =>
    import('./loading-list/loading-list.component').then((x) => x.LoadingListComponent
    ),
  },
  {
    'path': 'loadingDetails', 
    loadComponent: () =>
    import('./loading-details/loading-details.component').then((x) => x.LoadingDetailsComponent
    ),
  },
  {
    'path': 'driverDetails', 
    loadComponent: () =>
    import('./driver-details/driver-details.component').then((x) => x.DriverDetailsComponent
    ), 
  },
  {
    'path': 'driverlist', 
    loadComponent: () =>
    import('./driver-list/driver-list.component').then((x) => x.DriverListComponent
    ), 
  },
  {
    'path': 'driverExpenditure', 
    loadComponent: () =>
    import('./driver-expenditure-details/driver-expenditure-details.component').then((x) => x.DriverExpenditureDetailsComponent
    ), 
  },
  {
    'path': 'houseExpence', 
    loadComponent: () =>
    import('./house-expence/house-expence.component').then((x) => x.HouseExpenceComponent
    ), 
  },
  {
    'path': 'houseMaterial', 
    loadComponent: () =>
    import('./house-material-expence/house-material-expence.component').then((x) => x.HouseMaterialExpenceComponent
    ), 
  },
  {
    'path': 'houseMateriallist', 
    loadComponent: () =>
    import('./house-expence-list/house-expence-list.component').then((x) => x.HouseExpenceListComponent
    ), 
  },
  {'path': '**', component: DashboardComponent},
  // {

  //   path: '',
  //   component: MainlayoutComponent,

  //   children: [

  //     {
  //       path: 'header',
  //       component: HeaderComponent,
  //       // data: { breadcrumb: {alias: 'Charts'} },
  //     },
  //     {
  //       path: 'dashboard',
  //       component: DasboardComponent
  //     },
  //     {
  //       path: 'loadingDetails',
  //       component: LoadingDetailsComponent
  //     },

  //     {
  //       path: 'driverdetails',
  //       component: DriverDetailsComponent
  //     },
  //     {
  //       path: '**',
  //       component: DasboardComponent
  //     },
  //   ]
  // },

  // {
  //   path: 'driverexpenditure',
  //   component: DriverExpenditureDetailsComponent
  // },

  // // {
  // //   path: '**',
  // //   component: DasboardComponent
  // // },

  // {
  //   path: '**',
  //   redirectTo: '',
  //   pathMatch: 'full'
  // },

  // {
  //   path: 'layout',
  //   loadChildren: () =>
  //     import('./layout/layout.module').then((m) => m.LayoutModule)
  // },
];
