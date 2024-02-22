package usa.harvard.projectspringsir.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Secteur {
    @Id
    private Long id;
    private String libelle;
    @ManyToOne
    private Ville ville;
}
