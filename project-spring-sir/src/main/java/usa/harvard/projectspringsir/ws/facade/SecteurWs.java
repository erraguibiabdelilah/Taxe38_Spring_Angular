package usa.harvard.projectspringsir.ws.facade;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.commun.Secteur;
import usa.harvard.projectspringsir.service.intefaceService.SecteurService;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("api/Secteur")
public class SecteurWs {
    @Autowired
    private SecteurService secteurService;
    @DeleteMapping("code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return secteurService.deleteByCode(code);
    }
    @GetMapping("code/{code}")
    public Secteur findByCode(@PathVariable String code) {
        return secteurService.findByCode(code);
    }
    @PostMapping()
    public Secteur save(@RequestBody Secteur secteur) {
        return secteurService.save(secteur);
    }
    @GetMapping()
    public List<Secteur> findAll() {
        return secteurService.findAll();
    }
}
