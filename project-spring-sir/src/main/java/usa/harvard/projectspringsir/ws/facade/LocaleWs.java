package usa.harvard.projectspringsir.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.communBean.Locale;
import usa.harvard.projectspringsir.service.intefaceService.communInter.Localservice;

import java.util.List;

@RestController
@RequestMapping("api/Locale")
public class LocaleWs {
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable  String code) {
        return localservice.deleteByCode(code);
    }
    @GetMapping("/code/{code}")
    public Locale findByCode(@PathVariable String code) {
        return localservice.findByCode(code);
    }
    @PostMapping("/")
    public int save(@RequestBody Locale ville) {
        return localservice.save(ville);
    }
    @GetMapping("/")
    public List<Locale> findAll() {
        return localservice.findAll();
    }

    @Autowired
    private Localservice localservice;
}
