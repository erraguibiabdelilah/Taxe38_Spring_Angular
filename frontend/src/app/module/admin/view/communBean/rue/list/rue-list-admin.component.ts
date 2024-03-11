import {Component, OnInit} from '@angular/core';
import {RueAdminService} from 'src/app/controller/service/admin/communBean/RueAdmin.service';
import {RueDto} from 'src/app/controller/model/communBean/Rue.model';
import {RueCriteria} from 'src/app/controller/criteria/communBean/RueCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';



@Component({
  selector: 'app-rue-list-admin',
  templateUrl: './rue-list-admin.component.html'
})
export class RueListAdminComponent extends AbstractListController<RueDto, RueCriteria, RueAdminService>  implements OnInit {

    override fileName = 'Rue';




    constructor( private rueService: RueAdminService  ) {
        super(rueService);
    }

    ngOnInit(): void {
        this.activateSecurityConstraint('Rue').subscribe(() => {
            if (true || this.listActionIsValid){
                this.findPaginatedByCriteria();
                this.initExport();
                this.initCol();
            }
        });
    }


    public override  initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }





   public  override prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
        }];
      }
}
