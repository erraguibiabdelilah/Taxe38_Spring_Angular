package usa.harvard.projectspringsir.bean;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TauxTaxe38 {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    @Column(unique = true)
    private String CategorieLocale;
    private double montantParMetreCarre;
    private Date dateMin;
    private Date dateMax;
    private double pourcentagePremierRetard;
    private double pourcentageAutreMoisRetard;
}
