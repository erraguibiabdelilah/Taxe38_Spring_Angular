package usa.harvard.projectspringsir.bean.notifiication3Niv;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.bean.taxe38.Trim;
import usa.harvard.projectspringsir.bean.commun.Locale;
import usa.harvard.projectspringsir.bean.commun.Redevable;

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
