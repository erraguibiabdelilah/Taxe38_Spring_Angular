package usa.harvard.projectspringsir.bean.notifaction1NivBean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.bean.communBean.Locale;
import usa.harvard.projectspringsir.bean.communBean.Redevable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationRetardPremierNiveau {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private Locale locale;
    @ManyToOne
    private Redevable redevable;
    private int anne;
    private double montantBase;
}
