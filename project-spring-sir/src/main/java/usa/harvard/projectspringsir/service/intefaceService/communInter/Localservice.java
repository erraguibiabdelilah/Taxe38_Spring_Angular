package usa.harvard.projectspringsir.service.intefaceService.communInter;

import usa.harvard.projectspringsir.bean.communBean.Locale;

import java.util.List;

public interface Localservice {
    int deleteByCode(String code);
    Locale findByCode(String code);
    int save(Locale ville);
    List<Locale> findAll();

}
