package usa.harvard.projectspringsir.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.communBean.Rue;
import usa.harvard.projectspringsir.service.intefaceService.communInter.RueService;

import java.util.List;

@RestController
@RequestMapping("api/rue/")
public class RueWs {
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(String code) {
        return rueService.deleteByCode(code);
    }
    @GetMapping("/code/{code}")
    public Rue findByCode(String code) {
        return rueService.findByCode(code);
    }
    @PostMapping()
    public int save(Rue rue) {
        return rueService.save(rue);
    }
    @GetMapping()
    public List<Rue> findAll() {
        return rueService.findAll();
    }


    @Autowired
    private RueService rueService;

}
