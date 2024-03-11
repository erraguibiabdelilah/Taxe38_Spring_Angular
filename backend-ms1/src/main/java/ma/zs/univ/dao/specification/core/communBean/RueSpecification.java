package  ma.zs.univ.dao.specification.core.communBean;

import ma.zs.univ.dao.criteria.core.communBean.RueCriteria;
import ma.zs.univ.bean.core.communBean.Rue;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class RueSpecification extends  AbstractSpecification<RueCriteria, Rue>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public RueSpecification(RueCriteria criteria) {
        super(criteria);
    }

    public RueSpecification(RueCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
