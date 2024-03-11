import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import {environment} from 'src/environments/environment';

import {RedevableDto} from 'src/app/controller/model/communBean/Redevable.model';
import {RedevableCriteria} from 'src/app/controller/criteria/communBean/RedevableCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class RedevableAdminService extends AbstractService<RedevableDto, RedevableCriteria> {
     constructor(private http: HttpClient) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/redevable/');
    }

    public constrcutDto(): RedevableDto {
        return new RedevableDto();
    }

    public constrcutCriteria(): RedevableCriteria {
        return new RedevableCriteria();
    }
}
