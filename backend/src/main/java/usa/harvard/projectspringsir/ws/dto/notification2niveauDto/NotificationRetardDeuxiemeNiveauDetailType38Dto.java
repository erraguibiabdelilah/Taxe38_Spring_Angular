package usa.harvard.projectspringsir.ws.dto.notification2niveauDto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRetardDeuxiemeNiveauDetailType38Dto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    private String typeLocale38;
    private double montantBase;
    private double montantRetardPremierMois;
    private double montantRetardAutreMois;
    private double montantTotal;
}
