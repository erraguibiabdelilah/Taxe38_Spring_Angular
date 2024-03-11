import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {LocaleDto} from '../communBean/Locale.model';
import {RedevableDto} from '../communBean/Redevable.model';

export class Taxe38Dto extends BaseDto{

    public code: string;

    public anne: null | number;

    public trim: null | number;


    public nombreMoisRetard: null | number;

    public montantBase: null | number;

    public montantRetardPremeirMois: null | number;

    public montantTotal: null | number;

    public redevable: RedevableDto ;
    public locale: LocaleDto ;
    

    constructor() {
        super();

        this.code = '';
        this.anne = null;
        this.trim = null;
        this.nombreMoisRetard = null;
        this.montantBase = null;
        this.montantRetardPremeirMois = null;
        this.montantTotal = null;
        this.locale = new LocaleDto() ;

        }

}
