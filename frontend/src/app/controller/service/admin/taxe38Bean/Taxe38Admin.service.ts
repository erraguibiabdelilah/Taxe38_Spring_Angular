import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import {environment} from 'src/environments/environment';

import {Taxe38Dto} from 'src/app/controller/model/taxe38Bean/Taxe38.model';
import {Taxe38Criteria} from 'src/app/controller/criteria/taxe38Bean/Taxe38Criteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class Taxe38AdminService extends AbstractService<Taxe38Dto, Taxe38Criteria> {
     constructor(private http: HttpClient) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/taxe38/');
    }

    public constrcutDto(): Taxe38Dto {
        return new Taxe38Dto();
    }

    public constrcutCriteria(): Taxe38Criteria {
        return new Taxe38Criteria();
    }
}
