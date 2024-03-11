import {Component, OnInit} from '@angular/core';
import {Taxe38AdminService} from 'src/app/controller/service/admin/taxe38Bean/Taxe38Admin.service';
import {Taxe38Dto} from 'src/app/controller/model/taxe38Bean/Taxe38.model';
import {Taxe38Criteria} from 'src/app/controller/criteria/taxe38Bean/Taxe38Criteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import {LocaleDto} from 'src/app/controller/model/communBean/Locale.model';
import {LocaleAdminService} from 'src/app/controller/service/admin/communBean/LocaleAdmin.service';
import {RedevableDto} from 'src/app/controller/model/communBean/Redevable.model';
import {RedevableAdminService} from 'src/app/controller/service/admin/communBean/RedevableAdmin.service';


@Component({
  selector: 'app-taxe38-list-admin',
  templateUrl: './taxe38-list-admin.component.html'
})
export class Taxe38ListAdminComponent extends AbstractListController<Taxe38Dto, Taxe38Criteria, Taxe38AdminService>  implements OnInit {

    override fileName = 'Taxe38';


    redevables: Array<RedevableDto>;
    locales: Array<LocaleDto>;


    constructor( private taxe38Service: Taxe38AdminService  , private localeService: LocaleAdminService, private redevableService: RedevableAdminService) {
        super(taxe38Service);
    }

    ngOnInit(): void {
        this.activateSecurityConstraint('Taxe38').subscribe(() => {
            if (true || this.listActionIsValid){
                this.findPaginatedByCriteria();
                this.initExport();
                this.initCol();
                this.loadRedevable();
                this.loadLocale();
            }
        });
    }


    public override  initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'redevable?.nom', header: 'Redevable'},
            {field: 'locale?.id', header: 'Locale'},
            {field: 'anne', header: 'Anne'},
            {field: 'trim', header: 'Trim'},
            {field: 'datePresentaion', header: 'Date presentaion'},
            {field: 'nombreMoisRetard', header: 'Nombre mois retard'},
            {field: 'montantBase', header: 'Montant base'},
            {field: 'montantRetardPremeirMois', header: 'Montant retard premeir mois'},
            {field: 'montantTotal', header: 'Montant total'},
        ];
    }


    public async loadRedevable(){
       this.redevableService.findAllOptimized().subscribe(redevables => this.redevables = redevables, error => console.log(error))
    }
    public async loadLocale(){
       this.localeService.findAll().subscribe(locales => this.locales = locales, error => console.log(error))
    }



   public  override prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                'Redevable': e.redevable?.nom ,
                'Locale': e.locale?.id ,
                 'Anne': e.anne ,
                 'Trim': e.trim ,
                 'Date presentaion': e.datePresentaion ,
                 'Nombre mois retard': e.nombreMoisRetard ,
                 'Montant base': e.montantBase ,
                 'Montant retard premeir mois': e.montantRetardPremeirMois ,
                 'Montant total': e.montantTotal ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
        //'Redevable': this.criteria.redevable?.nom ? this.criteria.redevable?.nom : environment.emptyForExport ,
        //'Locale': this.criteria.locale?.id ? this.criteria.locale?.id : environment.emptyForExport ,
            'Anne Min': this.criteria.anneMin ? this.criteria.anneMin : environment.emptyForExport ,
            'Anne Max': this.criteria.anneMax ? this.criteria.anneMax : environment.emptyForExport ,
            'Trim Min': this.criteria.trimMin ? this.criteria.trimMin : environment.emptyForExport ,
            'Trim Max': this.criteria.trimMax ? this.criteria.trimMax : environment.emptyForExport ,
            'Date presentaion': this.criteria.datePresentaion ? this.criteria.datePresentaion : environment.emptyForExport ,
            'Nombre mois retard Min': this.criteria.nombreMoisRetardMin ? this.criteria.nombreMoisRetardMin : environment.emptyForExport ,
            'Nombre mois retard Max': this.criteria.nombreMoisRetardMax ? this.criteria.nombreMoisRetardMax : environment.emptyForExport ,
            'Montant base Min': this.criteria.montantBaseMin ? this.criteria.montantBaseMin : environment.emptyForExport ,
            'Montant base Max': this.criteria.montantBaseMax ? this.criteria.montantBaseMax : environment.emptyForExport ,
            'Montant retard premeir mois Min': this.criteria.montantRetardPremeirMoisMin ? this.criteria.montantRetardPremeirMoisMin : environment.emptyForExport ,
            'Montant retard premeir mois Max': this.criteria.montantRetardPremeirMoisMax ? this.criteria.montantRetardPremeirMoisMax : environment.emptyForExport ,
            'Montant total Min': this.criteria.montantTotalMin ? this.criteria.montantTotalMin : environment.emptyForExport ,
            'Montant total Max': this.criteria.montantTotalMax ? this.criteria.montantTotalMax : environment.emptyForExport ,
        }];
      }
}
