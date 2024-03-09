package usa.harvard.projectspringsir.ws.facade;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.commun.Ville;
import usa.harvard.projectspringsir.service.imple.VilleServiceImpl;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("api/ville")
public class VilleWs {

    private  VilleServiceImpl villeService;
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return villeService.deleteByCode(code);
    }

    @GetMapping("/code/{code}")
    public Ville findByCode(@PathVariable String code) {
        return villeService.findByCode(code);
    }

    @PostMapping("/")
    public Ville save(@RequestBody Ville ville) {
        return villeService.save(ville);
    }

    @GetMapping("/")
    public List<Ville> findAll() {
        return villeService.findAll();
    }
}
