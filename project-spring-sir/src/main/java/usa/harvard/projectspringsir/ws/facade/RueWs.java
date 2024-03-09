package usa.harvard.projectspringsir.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usa.harvard.projectspringsir.service.intefaceService.RueService;

@RestController
@RequestMapping("api/rue")
public class RueWs {
    @Autowired
    private RueService rueService;

}
