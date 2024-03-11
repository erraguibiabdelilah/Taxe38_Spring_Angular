import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';
import {FileUploadModule} from 'primeng/fileupload';
import {FullCalendarModule} from '@fullcalendar/angular';
import {CardModule} from "primeng/card";

import { Taxe38CreateAdminComponent } from './taxe38/create/taxe38-create-admin.component';
import { Taxe38EditAdminComponent } from './taxe38/edit/taxe38-edit-admin.component';
import { Taxe38ViewAdminComponent } from './taxe38/view/taxe38-view-admin.component';
import { Taxe38ListAdminComponent } from './taxe38/list/taxe38-list-admin.component';
import { CategorieLocaleCreateAdminComponent } from './categorie-locale/create/categorie-locale-create-admin.component';
import { CategorieLocaleEditAdminComponent } from './categorie-locale/edit/categorie-locale-edit-admin.component';
import { CategorieLocaleViewAdminComponent } from './categorie-locale/view/categorie-locale-view-admin.component';
import { CategorieLocaleListAdminComponent } from './categorie-locale/list/categorie-locale-list-admin.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    Taxe38CreateAdminComponent,
    Taxe38ListAdminComponent,
    Taxe38ViewAdminComponent,
    Taxe38EditAdminComponent,
    CategorieLocaleCreateAdminComponent,
    CategorieLocaleListAdminComponent,
    CategorieLocaleViewAdminComponent,
    CategorieLocaleEditAdminComponent,
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
    PaginatorModule,
    TranslateModule,
    FileUploadModule,
    FullCalendarModule,
    CardModule,

  ],
  exports: [
  Taxe38CreateAdminComponent,
  Taxe38ListAdminComponent,
  Taxe38ViewAdminComponent,
  Taxe38EditAdminComponent,
  CategorieLocaleCreateAdminComponent,
  CategorieLocaleListAdminComponent,
  CategorieLocaleViewAdminComponent,
  CategorieLocaleEditAdminComponent,
  ],
})
export class Taxe38BeanAdminModule { }
