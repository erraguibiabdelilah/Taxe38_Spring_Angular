package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.taxe38.Trim;

public interface TrimDao extends JpaRepository<Trim,Long> {
}
