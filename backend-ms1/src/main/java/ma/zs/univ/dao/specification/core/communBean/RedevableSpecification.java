package  ma.zs.univ.dao.specification.core.communBean;

import ma.zs.univ.dao.criteria.core.communBean.RedevableCriteria;
import ma.zs.univ.bean.core.communBean.Redevable;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class RedevableSpecification extends  AbstractSpecification<RedevableCriteria, Redevable>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
        addPredicate("cin", criteria.getCin(),criteria.getCinLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicateBool("credentialsNonExpired", criteria.getCredentialsNonExpired());
        addPredicateBool("enabled", criteria.getEnabled());
        addPredicateBool("accountNonExpired", criteria.getAccountNonExpired());
        addPredicateBool("accountNonLocked", criteria.getAccountNonLocked());
        addPredicateBool("passwordChanged", criteria.getPasswordChanged());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
    }

    public RedevableSpecification(RedevableCriteria criteria) {
        super(criteria);
    }

    public RedevableSpecification(RedevableCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
