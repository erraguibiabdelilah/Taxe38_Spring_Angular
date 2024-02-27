package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.Locale;
import usa.harvard.projectspringsir.bean.Locale38Detail;
import java.util.Optional;
@Repository
public interface Locale38DetailDao extends JpaRepository<Locale38Detail,Long> {
    Locale38Detail findByCode(String code);
    int deleteByCode(String code);
}
