package usa.harvard.projectspringsir.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationRetardDeuxiemeNiveau {
    @Id
    private Long id;
    @OneToOne
    private Locale locale;
    @OneToOne
    private Redevable redevable;
    private int anne;
    private double montantBase;
    private double montantRetardPremierMois;
    private double montantRetardAutreMois;
    private double montantTotal;
}
