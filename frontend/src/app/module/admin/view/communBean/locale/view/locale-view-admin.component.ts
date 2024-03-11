import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

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
  selector: 'app-locale-view-admin',
  templateUrl: './locale-view-admin.component.html'
})
export class LocaleViewAdminComponent extends AbstractViewController<LocaleDto, LocaleCriteria, LocaleAdminService> implements OnInit {


    constructor(private localeService: LocaleAdminService, private rueService: RueAdminService, private redevableService: RedevableAdminService, private categorieLocaleService: CategorieLocaleAdminService){
        super(localeService);
    }

    ngOnInit(): void {
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


}
