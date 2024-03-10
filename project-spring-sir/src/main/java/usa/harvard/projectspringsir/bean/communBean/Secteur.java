package usa.harvard.projectspringsir.bean.communBean;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Secteur {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String code;
    private String libelle;
    @ManyToOne
    private Ville ville;
}
