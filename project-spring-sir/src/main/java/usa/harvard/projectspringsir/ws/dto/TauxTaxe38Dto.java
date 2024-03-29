package usa.harvard.projectspringsir.ws.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TauxTaxe38Dto {
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
