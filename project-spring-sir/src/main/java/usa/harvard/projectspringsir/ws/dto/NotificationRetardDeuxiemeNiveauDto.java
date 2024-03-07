package usa.harvard.projectspringsir.ws.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class NotificationRetardDeuxiemeNiveauDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @OneToOne
    private LocaleDto localeDto;
    @OneToOne
    private RedevableDto redevableDto;
    private int anne;
    private double montantBase;
    private double montantRetardPremierMois;
    private double montantRetardAutreMois;
    private double montantTotal;
}
