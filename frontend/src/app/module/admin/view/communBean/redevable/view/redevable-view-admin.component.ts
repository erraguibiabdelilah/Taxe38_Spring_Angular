import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {RedevableAdminService} from 'src/app/controller/service/admin/communBean/RedevableAdmin.service';
import {RedevableDto} from 'src/app/controller/model/communBean/Redevable.model';
import {RedevableCriteria} from 'src/app/controller/criteria/communBean/RedevableCriteria.model';

@Component({
  selector: 'app-redevable-view-admin',
  templateUrl: './redevable-view-admin.component.html'
})
export class RedevableViewAdminComponent extends AbstractViewController<RedevableDto, RedevableCriteria, RedevableAdminService> implements OnInit {


    constructor(private redevableService: RedevableAdminService){
        super(redevableService);
    }

    ngOnInit(): void {
    }




}
