package usa.harvard.projectspringsir.ws.facade;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import usa.harvard.projectspringsir.bean.notifaction1NivBean.NotificationRetardPremierNiveau;
import usa.harvard.projectspringsir.service.imple.notifaction1NivImpl.NotificationRetardPremierNiveauServiceImpl;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("api/NotificationRetardPremierNiveauService/")
public class NotificationRetardPremierNiveauWs {
    @Autowired
    private NotificationRetardPremierNiveauServiceImpl notificationRetardPremierNiveauService ;
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return notificationRetardPremierNiveauService.deleteByCode(code);
    }
    @GetMapping("/code/{code}")
    public NotificationRetardPremierNiveau findByCode(@PathVariable String code) {
        return notificationRetardPremierNiveauService.findByCode(code);
    }
    @PostMapping()
    public NotificationRetardPremierNiveau save(@RequestBody NotificationRetardPremierNiveau notificationRetardPremierNiveau) {
        return notificationRetardPremierNiveauService.save(notificationRetardPremierNiveau);
    }
    @GetMapping()
    public List<NotificationRetardPremierNiveau> findAll() {
        return notificationRetardPremierNiveauService.findAll();
    }
}
