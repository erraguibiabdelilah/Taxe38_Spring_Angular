package usa.harvard.projectspringsir.ws.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

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
    private String trim;
}
