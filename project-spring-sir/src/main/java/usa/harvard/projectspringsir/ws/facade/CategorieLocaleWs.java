package usa.harvard.projectspringsir.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.taxe38Bean.CategorieLocale;
import usa.harvard.projectspringsir.service.intefaceService.taxe38Inter.CategorieLocaleService;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategorieLocaleWs {
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable  String code) {
        return categorieLocaleService.deleteByCode(code);
    }
    @GetMapping("/code/{code}")
    public CategorieLocale findByCode(@PathVariable String code) {
        return categorieLocaleService.findByCode(code);
    }
    @PostMapping("/")
    public int save(@RequestBody CategorieLocale ville) {
        return categorieLocaleService.save(ville);
    }
    @GetMapping("/")
    public List<CategorieLocale> findAll() {
        return categorieLocaleService.findAll();
    }

    @Autowired
    private CategorieLocaleService categorieLocaleService;
}
