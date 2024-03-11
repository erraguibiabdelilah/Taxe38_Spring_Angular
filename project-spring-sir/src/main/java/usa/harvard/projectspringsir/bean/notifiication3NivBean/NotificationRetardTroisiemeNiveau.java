package usa.harvard.projectspringsir.bean.notifiication3NivBean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.bean.taxe38Bean.Trim;
import usa.harvard.projectspringsir.bean.communBean.Locale;
import usa.harvard.projectspringsir.bean.communBean.Redevable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationRetardTroisiemeNiveau {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private Locale locale;
    @ManyToOne
    private Redevable redevable;
    private int anne;
    @ManyToOne
    private Trim trim;
}
