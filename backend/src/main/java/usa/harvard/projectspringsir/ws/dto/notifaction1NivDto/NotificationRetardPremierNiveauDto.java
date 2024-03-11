package usa.harvard.projectspringsir.ws.dto.notifaction1NivDto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.ws.dto.communDto.LocaleDto;
import usa.harvard.projectspringsir.ws.dto.communDto.RedevableDto;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRetardPremierNiveauDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private LocaleDto localeDto;
    @ManyToOne
    private RedevableDto redevableDto;
    private Date anne;
    private double montantBase;
    private double montantRetardPremierMois;
}
