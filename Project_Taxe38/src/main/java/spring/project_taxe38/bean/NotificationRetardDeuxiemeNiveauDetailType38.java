package usa.harvard.projectspringsir.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationRetardDeuxiemeNiveauDetailType38 {
    @Id
    private Long id;
    private String typeLocale38;
    private double montantBase;
    private double montantRetardPremierMois;
    private double montantRetardAutreMois;
    private double montantTotal;
}
