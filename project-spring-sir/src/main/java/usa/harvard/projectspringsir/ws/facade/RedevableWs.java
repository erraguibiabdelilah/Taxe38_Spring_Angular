package usa.harvard.projectspringsir.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.communBean.Redevable;
import usa.harvard.projectspringsir.service.intefaceService.communInter.RedevableService;

import java.util.List;

@RestController
@RequestMapping("api/Redevable/")
public class RedevableWs {
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return redevableService.deleteByCin(code);
    }
    @GetMapping("/code/{code}")
    public Redevable findByCode(@PathVariable String code) {
        return redevableService.findByCin(code);
    }
    @PostMapping()
    public int save(@RequestBody  Redevable redevable) {
        return redevableService.save(redevable);
    }
    @GetMapping()
    public List<Redevable> findAll() {
        return redevableService.findAll();
    }

    @Autowired
    private RedevableService redevableService;
}
