package usa.harvard.projectspringsir.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.communBean.Quartie;
import usa.harvard.projectspringsir.service.intefaceService.communInter.QuartieService;

import java.util.List;
@RestController
@RequestMapping("api/Quartie/")
public class QuartieWs {
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode( @PathVariable String code) {
        return quartieService.deleteByCode(code);
    }

    @GetMapping("/code/{code}")
    public Quartie findByCode(@PathVariable String code) {
        return quartieService.findByCode(code);
    }

    @PostMapping()
    public int save(@RequestBody  Quartie quartie) {
        return quartieService.save(quartie);
    }

    @GetMapping()
    public List<Quartie> findAll() {
        return quartieService.findAll();
    }

    public QuartieWs(QuartieService quartieService) {
        this.quartieService = quartieService;
    }

    @Autowired
    private QuartieService quartieService;
}
