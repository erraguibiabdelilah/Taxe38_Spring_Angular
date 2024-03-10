package usa.harvard.projectspringsir.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.communBean.Ville;
import usa.harvard.projectspringsir.service.imple.communImpl.VilleServiceImpl;

import java.util.List;

@RestController
@RequestMapping("api/ville/")
@CrossOrigin("*")
public class VilleWs {
    @Autowired
    private  VilleServiceImpl villeService;
    public VilleWs(VilleServiceImpl villeService) {
        this.villeService = villeService;
    }
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return villeService.deleteByCode(code);
    }
    @GetMapping("/code/{code}")
    public Ville findByCode(@PathVariable String code) {
        return villeService.findByCode(code);
    }
<<<<<<< HEAD
    @PostMapping("/")
    public int save(@RequestBody Ville ville) {
        return villeService.save(ville);
    }
    @GetMapping("/")
=======

    @PostMapping()
    public int save(@RequestBody Ville ville) {
        return villeService.save(ville);
    }

    @GetMapping()
>>>>>>> 660933d1a31def529797a4d2e63aff06d9852518
    public List<Ville> findAll() {
        return villeService.findAll();
    }
}
