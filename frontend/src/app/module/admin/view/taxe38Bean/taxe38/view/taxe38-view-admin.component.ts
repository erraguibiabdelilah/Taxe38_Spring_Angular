import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {Taxe38AdminService} from 'src/app/controller/service/admin/taxe38Bean/Taxe38Admin.service';
import {Taxe38Dto} from 'src/app/controller/model/taxe38Bean/Taxe38.model';
import {Taxe38Criteria} from 'src/app/controller/criteria/taxe38Bean/Taxe38Criteria.model';

import {LocaleDto} from 'src/app/controller/model/communBean/Locale.model';
import {LocaleAdminService} from 'src/app/controller/service/admin/communBean/LocaleAdmin.service';
import {RedevableDto} from 'src/app/controller/model/communBean/Redevable.model';
import {RedevableAdminService} from 'src/app/controller/service/admin/communBean/RedevableAdmin.service';
@Component({
  selector: 'app-taxe38-view-admin',
  templateUrl: './taxe38-view-admin.component.html'
})
export class Taxe38ViewAdminComponent extends AbstractViewController<Taxe38Dto, Taxe38Criteria, Taxe38AdminService> implements OnInit {


    constructor(private taxe38Service: Taxe38AdminService, private localeService: LocaleAdminService, private redevableService: RedevableAdminService){
        super(taxe38Service);
    }

    ngOnInit(): void {
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


}
