package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.Locale;

import java.util.Optional;

public interface LocaleDao extends JpaRepository<Locale,Long> {
    @Override
    Optional<Locale> findById(Long id);

    @Override
    void deleteById(Long id);
}
