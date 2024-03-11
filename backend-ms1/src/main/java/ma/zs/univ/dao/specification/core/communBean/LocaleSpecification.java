package  ma.zs.univ.dao.specification.core.communBean;

import ma.zs.univ.dao.criteria.core.communBean.LocaleCriteria;
import ma.zs.univ.bean.core.communBean.Locale;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class LocaleSpecification extends  AbstractSpecification<LocaleCriteria, Locale>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("complementAdresse", criteria.getComplementAdresse(),criteria.getComplementAdresseLike());
        addPredicateFk("rue","id", criteria.getRue()==null?null:criteria.getRue().getId());
        addPredicateFk("rue","id", criteria.getRues());
        addPredicateFk("rue","code", criteria.getRue()==null?null:criteria.getRue().getCode());
        addPredicateFk("redevable","id", criteria.getRedevable()==null?null:criteria.getRedevable().getId());
        addPredicateFk("redevable","id", criteria.getRedevables());
        addPredicateFk("redevable","cin", criteria.getRedevable()==null?null:criteria.getRedevable().getCin());
        addPredicateFk("categorieLocale","id", criteria.getCategorieLocale()==null?null:criteria.getCategorieLocale().getId());
        addPredicateFk("categorieLocale","id", criteria.getCategorieLocales());
    }

    public LocaleSpecification(LocaleCriteria criteria) {
        super(criteria);
    }

    public LocaleSpecification(LocaleCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
