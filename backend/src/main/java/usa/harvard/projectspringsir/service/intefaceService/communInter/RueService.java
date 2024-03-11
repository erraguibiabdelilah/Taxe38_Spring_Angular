package usa.harvard.projectspringsir.service.intefaceService.communInter;
import usa.harvard.projectspringsir.bean.communBean.Rue;
import java.util.List;

public interface RueService {
    int deleteByCode(String code);
    Rue findByCode(String code);
    int save(Rue rue);
    List<Rue> findAll();
}
