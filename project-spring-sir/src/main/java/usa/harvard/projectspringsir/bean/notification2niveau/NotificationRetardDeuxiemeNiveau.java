package usa.harvard.projectspringsir.bean.notification2niveau;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.bean.commun.Locale;
import usa.harvard.projectspringsir.bean.commun.Redevable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationRetardDeuxiemeNiveau {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
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
