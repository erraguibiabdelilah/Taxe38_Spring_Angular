package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.Locale;
import usa.harvard.projectspringsir.bean.Taxe38;

import java.util.Optional;

public interface Taxe38Dao extends JpaRepository<Taxe38,Long> {
    @Override
    Optional<Taxe38> findById(Long id);

    @Override
    void deleteById(Long id);
}
