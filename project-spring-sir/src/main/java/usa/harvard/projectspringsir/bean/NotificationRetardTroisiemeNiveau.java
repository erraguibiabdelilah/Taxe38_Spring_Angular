package usa.harvard.projectspringsir.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationRetardTroisiemeNiveau {
    @Id
    private Long id;
    @ManyToOne
    private Locale locale;
    @ManyToOne
    private Redevable redevable;
    private int anne;
    private String trim;
}
