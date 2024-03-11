import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {LocaleAdminService} from 'src/app/controller/service/admin/communBean/LocaleAdmin.service';
import {LocaleDto} from 'src/app/controller/model/communBean/Locale.model';
import {LocaleCriteria} from 'src/app/controller/criteria/communBean/LocaleCriteria.model';
import {RueDto} from 'src/app/controller/model/communBean/Rue.model';
import {RueAdminService} from 'src/app/controller/service/admin/communBean/RueAdmin.service';
import {RedevableDto} from 'src/app/controller/model/communBean/Redevable.model';
import {RedevableAdminService} from 'src/app/controller/service/admin/communBean/RedevableAdmin.service';
import {CategorieLocaleDto} from 'src/app/controller/model/taxe38Bean/CategorieLocale.model';
import {CategorieLocaleAdminService} from 'src/app/controller/service/admin/taxe38Bean/CategorieLocaleAdmin.service';
@Component({
  selector: 'app-locale-create-admin',
  templateUrl: './locale-create-admin.component.html'
})
export class LocaleCreateAdminComponent extends AbstractCreateController<LocaleDto, LocaleCriteria, LocaleAdminService>  implements OnInit {



   private _validLocaleCode = true;
    private _validRueCode = true;
    private _validRueLibelle = true;
    private _validRedevableCin = true;
    private _validRedevableNom = true;
    private _validCategorieLocaleCode = true;
    private _validCategorieLocaleLibelle = true;

    constructor( private localeService: LocaleAdminService , private rueService: RueAdminService, private redevableService: RedevableAdminService, private categorieLocaleService: CategorieLocaleAdminService) {
        super(localeService);
    }

    ngOnInit(): void {
        this.rue = new RueDto();
        this.rueService.findAll().subscribe((data) => this.rues = data);
        this.redevable = new RedevableDto();
        this.redevableService.findAll().subscribe((data) => this.redevables = data);
        this.categorieLocale = new CategorieLocaleDto();
        this.categorieLocaleService.findAll().subscribe((data) => this.categorieLocales = data);
    }





    public override setValidation(value: boolean){
        this.validLocaleCode = value;
    }



    public override validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateLocaleCode();
    }

    public validateLocaleCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validLocaleCode = false;
        } else {
            this.validLocaleCode = true;
        }
    }


    public async openCreateRue(rue: string) {
    const isPermistted = await this.roleService.isPermitted('Rue', 'add');
    if(isPermistted) {
         this.rue = new RueDto();
         this.createRueDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateRedevable(redevable: string) {
    const isPermistted = await this.roleService.isPermitted('Redevable', 'add');
    if(isPermistted) {
         this.redevable = new RedevableDto();
         this.createRedevableDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get rue(): RueDto {
        return this.rueService.item;
    }
    set rue(value: RueDto) {
        this.rueService.item = value;
    }
    get rues(): Array<RueDto> {
        return this.rueService.items;
    }
    set rues(value: Array<RueDto>) {
        this.rueService.items = value;
    }
    get createRueDialog(): boolean {
       return this.rueService.createDialog;
    }
    set createRueDialog(value: boolean) {
        this.rueService.createDialog= value;
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
    get categorieLocale(): CategorieLocaleDto {
        return this.categorieLocaleService.item;
    }
    set categorieLocale(value: CategorieLocaleDto) {
        this.categorieLocaleService.item = value;
    }
    get categorieLocales(): Array<CategorieLocaleDto> {
        return this.categorieLocaleService.items;
    }
    set categorieLocales(value: Array<CategorieLocaleDto>) {
        this.categorieLocaleService.items = value;
    }
    get createCategorieLocaleDialog(): boolean {
       return this.categorieLocaleService.createDialog;
    }
    set createCategorieLocaleDialog(value: boolean) {
        this.categorieLocaleService.createDialog= value;
    }



    get validLocaleCode(): boolean {
        return this._validLocaleCode;
    }

    set validLocaleCode(value: boolean) {
         this._validLocaleCode = value;
    }

    get validRueCode(): boolean {
        return this._validRueCode;
    }
    set validRueCode(value: boolean) {
        this._validRueCode = value;
    }
    get validRueLibelle(): boolean {
        return this._validRueLibelle;
    }
    set validRueLibelle(value: boolean) {
        this._validRueLibelle = value;
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
    get validCategorieLocaleCode(): boolean {
        return this._validCategorieLocaleCode;
    }
    set validCategorieLocaleCode(value: boolean) {
        this._validCategorieLocaleCode = value;
    }
    get validCategorieLocaleLibelle(): boolean {
        return this._validCategorieLocaleLibelle;
    }
    set validCategorieLocaleLibelle(value: boolean) {
        this._validCategorieLocaleLibelle = value;
    }


}
