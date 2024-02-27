package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.taxe38.Locale38Detail;

@Repository
public interface Locale38DetailDao extends JpaRepository<Locale38Detail,Long> {
    Locale38Detail findByCode(String code);
    int deleteByCode(String code);
}
