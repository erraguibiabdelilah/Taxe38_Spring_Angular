package  ma.zs.univ.dao.specification.core.taxe38Bean;

import ma.zs.univ.dao.criteria.core.taxe38Bean.Taxe38Criteria;
import ma.zs.univ.bean.core.taxe38Bean.Taxe38;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class Taxe38Specification extends  AbstractSpecification<Taxe38Criteria, Taxe38>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateInt("anne", criteria.getAnne(), criteria.getAnneMin(), criteria.getAnneMax());
        addPredicateInt("trim", criteria.getTrim(), criteria.getTrimMin(), criteria.getTrimMax());
        addPredicate("datePresentaion", criteria.getDatePresentaion(), criteria.getDatePresentaionFrom(), criteria.getDatePresentaionTo());
        addPredicateInt("nombreMoisRetard", criteria.getNombreMoisRetard(), criteria.getNombreMoisRetardMin(), criteria.getNombreMoisRetardMax());
        addPredicateBigDecimal("montantBase", criteria.getMontantBase(), criteria.getMontantBaseMin(), criteria.getMontantBaseMax());
        addPredicateBigDecimal("montantRetardPremeirMois", criteria.getMontantRetardPremeirMois(), criteria.getMontantRetardPremeirMoisMin(), criteria.getMontantRetardPremeirMoisMax());
        addPredicateBigDecimal("montantTotal", criteria.getMontantTotal(), criteria.getMontantTotalMin(), criteria.getMontantTotalMax());
        addPredicateFk("redevable","id", criteria.getRedevable()==null?null:criteria.getRedevable().getId());
        addPredicateFk("redevable","id", criteria.getRedevables());
        addPredicateFk("redevable","cin", criteria.getRedevable()==null?null:criteria.getRedevable().getCin());
        addPredicateFk("locale","id", criteria.getLocale()==null?null:criteria.getLocale().getId());
        addPredicateFk("locale","id", criteria.getLocales());
    }

    public Taxe38Specification(Taxe38Criteria criteria) {
        super(criteria);
    }

    public Taxe38Specification(Taxe38Criteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
