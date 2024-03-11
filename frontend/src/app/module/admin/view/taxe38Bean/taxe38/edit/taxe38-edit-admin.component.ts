import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {Taxe38AdminService} from 'src/app/controller/service/admin/taxe38Bean/Taxe38Admin.service';
import {Taxe38Dto} from 'src/app/controller/model/taxe38Bean/Taxe38.model';
import {Taxe38Criteria} from 'src/app/controller/criteria/taxe38Bean/Taxe38Criteria.model';


import {LocaleDto} from 'src/app/controller/model/communBean/Locale.model';
import {LocaleAdminService} from 'src/app/controller/service/admin/communBean/LocaleAdmin.service';
import {RedevableDto} from 'src/app/controller/model/communBean/Redevable.model';
import {RedevableAdminService} from 'src/app/controller/service/admin/communBean/RedevableAdmin.service';

@Component({
  selector: 'app-taxe38-edit-admin',
  templateUrl: './taxe38-edit-admin.component.html'
})
export class Taxe38EditAdminComponent extends AbstractEditController<Taxe38Dto, Taxe38Criteria, Taxe38AdminService>   implements OnInit {


    private _validTaxe38Code = true;

    private _validRedevableCin = true;
    private _validRedevableNom = true;
    private _validLocaleCode = true;



    constructor( private taxe38Service: Taxe38AdminService , private localeService: LocaleAdminService, private redevableService: RedevableAdminService) {
        super(taxe38Service);
    }

    ngOnInit(): void {
        this.redevable = new RedevableDto();
        this.redevableService.findAll().subscribe((data) => this.redevables = data);
        this.locale = new LocaleDto();
        this.localeService.findAll().subscribe((data) => this.locales = data);
    }


    public override setValidation(value: boolean){
        this.validTaxe38Code = value;
        }
    public override validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateTaxe38Code();
    }
    public validateTaxe38Code(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validTaxe38Code = false;
        } else {
            this.validTaxe38Code = true;
        }
    }




   get locale(): LocaleDto {
       return this.localeService.item;
   }
  set locale(value: LocaleDto) {
        this.localeService.item = value;
   }
   get locales(): Array<LocaleDto> {
        return this.localeService.items;
   }
   set locales(value: Array<LocaleDto>) {
        this.localeService.items = value;
   }
   get createLocaleDialog(): boolean {
       return this.localeService.createDialog;
   }
  set createLocaleDialog(value: boolean) {
       this.localeService.createDialog= value;
   }
   get redevable(): RedevableDto {
       return this.redevableService.item;
   }
  set redevable(value: RedevableDto) {
        this.redevableService.item = value;
   }
   get redevables(): Array<RedevableDto> {
        return this.redevableService.items;
   }
   set redevables(value: Array<RedevableDto>) {
        this.redevableService.items = value;
   }
   get createRedevableDialog(): boolean {
       return this.redevableService.createDialog;
   }
  set createRedevableDialog(value: boolean) {
       this.redevableService.createDialog= value;
   }


    get validTaxe38Code(): boolean {
        return this._validTaxe38Code;
    }
    set validTaxe38Code(value: boolean) {
        this._validTaxe38Code = value;
    }

    get validRedevableCin(): boolean {
        return this._validRedevableCin;
    }
    set validRedevableCin(value: boolean) {
        this._validRedevableCin = value;
    }
    get validRedevableNom(): boolean {
        return this._validRedevableNom;
    }
    set validRedevableNom(value: boolean) {
        this._validRedevableNom = value;
    }
    get validLocaleCode(): boolean {
        return this._validLocaleCode;
    }
    set validLocaleCode(value: boolean) {
        this._validLocaleCode = value;
    }
}
