package usa.harvard.projectspringsir.dao.taxe38Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.taxe38Bean.CategorieLocale;

public interface CategorieLocaleDao extends JpaRepository<CategorieLocale,Long> {
    int deleteByCode(String code);
    CategorieLocale findByCode(String code );
}
