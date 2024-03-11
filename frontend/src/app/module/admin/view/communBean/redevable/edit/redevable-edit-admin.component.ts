import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {RedevableAdminService} from 'src/app/controller/service/admin/communBean/RedevableAdmin.service';
import {RedevableDto} from 'src/app/controller/model/communBean/Redevable.model';
import {RedevableCriteria} from 'src/app/controller/criteria/communBean/RedevableCriteria.model';



@Component({
  selector: 'app-redevable-edit-admin',
  templateUrl: './redevable-edit-admin.component.html'
})
export class RedevableEditAdminComponent extends AbstractEditController<RedevableDto, RedevableCriteria, RedevableAdminService>   implements OnInit {


    private _validRedevableCin = true;
    private _validRedevableNom = true;




    constructor( private redevableService: RedevableAdminService ) {
        super(redevableService);
    }

    ngOnInit(): void {
    }


    public override setValidation(value: boolean){
        this.validRedevableCin = value;
        this.validRedevableNom = value;
        }
    public override validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateRedevableCin();
        this.validateRedevableNom();
    }
    public validateRedevableCin(){
        if (this.stringUtilService.isEmpty(this.item.cin)) {
            this.errorMessages.push('Cin non valide');
            this.validRedevableCin = false;
        } else {
            this.validRedevableCin = true;
        }
    }
    public validateRedevableNom(){
        if (this.stringUtilService.isEmpty(this.item.nom)) {
            this.errorMessages.push('Nom non valide');
            this.validRedevableNom = false;
        } else {
            this.validRedevableNom = true;
        }
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

}
