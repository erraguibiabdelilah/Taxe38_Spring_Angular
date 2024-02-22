package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.Locale;
import usa.harvard.projectspringsir.bean.Locale38Detail;

import java.util.Optional;

public interface Locale38DetailDao extends JpaRepository<Locale38Detail,Long> {
    @Override
    Optional<Locale38Detail> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
