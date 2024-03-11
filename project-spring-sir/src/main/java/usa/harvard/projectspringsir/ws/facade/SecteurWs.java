package usa.harvard.projectspringsir.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.communBean.Secteur;
import usa.harvard.projectspringsir.service.intefaceService.communInter.SecteurService;

import java.util.List;

@RestController
@RequestMapping("api/secteur/")
public class SecteurWs {
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable  String code) {
        return service.deleteByCode(code);
    }

    @GetMapping("/code/{code}")
    public Secteur findByCode(String code) {
        return service.findByCode(code);
    }

    @PostMapping()
    public int save(@RequestBody  Secteur secteur) {
        return service.save(secteur);
    }

    @GetMapping()
    public List<Secteur> findAll() {
        return service.findAll();
    }

    @Autowired
    private SecteurService service;
}
