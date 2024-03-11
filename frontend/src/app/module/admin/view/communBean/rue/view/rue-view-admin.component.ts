import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {RueAdminService} from 'src/app/controller/service/admin/communBean/RueAdmin.service';
import {RueDto} from 'src/app/controller/model/communBean/Rue.model';
import {RueCriteria} from 'src/app/controller/criteria/communBean/RueCriteria.model';

@Component({
  selector: 'app-rue-view-admin',
  templateUrl: './rue-view-admin.component.html'
})
export class RueViewAdminComponent extends AbstractViewController<RueDto, RueCriteria, RueAdminService> implements OnInit {


    constructor(private rueService: RueAdminService){
        super(rueService);
    }

    ngOnInit(): void {
    }




}
