package usa.harvard.projectspringsir.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usa.harvard.projectspringsir.service.intefaceService.QuartieService;

@RestController
@RequestMapping("api/Quartie")
public class QuartieWs {
    @Autowired
    private QuartieService quartieService;
}
