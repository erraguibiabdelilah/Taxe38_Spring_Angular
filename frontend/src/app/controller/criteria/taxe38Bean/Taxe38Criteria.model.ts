import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {LocaleCriteria} from '../communBean/LocaleCriteria.model';
import {RedevableCriteria} from '../communBean/RedevableCriteria.model';

export class Taxe38Criteria  extends BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
     public anne: number;
     public anneMin: number;
     public anneMax: number;
     public trim: number;
     public trimMin: number;
     public trimMax: number;
     public nombreMoisRetard: number;
     public nombreMoisRetardMin: number;
     public nombreMoisRetardMax: number;
     public montantBase: number;
     public montantBaseMin: number;
     public montantBaseMax: number;
     public montantRetardPremeirMois: number;
     public montantRetardPremeirMoisMin: number;
     public montantRetardPremeirMoisMax: number;
     public montantTotal: number;
     public montantTotalMin: number;
     public montantTotalMax: number;
  public locale: LocaleCriteria ;
  public locales: Array<LocaleCriteria> ;

}
