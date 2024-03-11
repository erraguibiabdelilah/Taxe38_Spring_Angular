import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {RueAdminService} from 'src/app/controller/service/admin/communBean/RueAdmin.service';
import {RueDto} from 'src/app/controller/model/communBean/Rue.model';
import {RueCriteria} from 'src/app/controller/criteria/communBean/RueCriteria.model';
@Component({
  selector: 'app-rue-create-admin',
  templateUrl: './rue-create-admin.component.html'
})
export class RueCreateAdminComponent extends AbstractCreateController<RueDto, RueCriteria, RueAdminService>  implements OnInit {



   private _validRueCode = true;
   private _validRueLibelle = true;

    constructor( private rueService: RueAdminService ) {
        super(rueService);
    }

    ngOnInit(): void {
    }





    public override setValidation(value: boolean){
        this.validRueCode = value;
        this.validRueLibelle = value;
    }



    public override validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateRueCode();
        this.validateRueLibelle();
    }

    public validateRueCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validRueCode = false;
        } else {
            this.validRueCode = true;
        }
    }
    public validateRueLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validRueLibelle = false;
        } else {
            this.validRueLibelle = true;
        }
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



}
