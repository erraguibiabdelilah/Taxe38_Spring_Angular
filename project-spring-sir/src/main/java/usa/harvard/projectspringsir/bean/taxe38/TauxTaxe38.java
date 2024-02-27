package usa.harvard.projectspringsir.bean.taxe38;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TauxTaxe38 {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String code;


    @ManyToOne
    private TypeLocale38Detail typeLocale38Detail;
    @ManyToOne
    private CategorieLocale categorieLocale;
    private double montantParMetreCarre;
    private LocalDate dateMin;
    private LocalDate dateMax;
    private double pourcentagePremierRetard;
    private double pourcentageAutreMoisRetard;
}
