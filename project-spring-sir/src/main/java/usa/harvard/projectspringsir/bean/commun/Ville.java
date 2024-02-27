package usa.harvard.projectspringsir.bean.commun;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ville {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    private String libelle;
}
