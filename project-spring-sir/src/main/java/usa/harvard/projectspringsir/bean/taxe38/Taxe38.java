package usa.harvard.projectspringsir.bean.taxe38;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.bean.commun.Locale;
import usa.harvard.projectspringsir.bean.commun.Redevable;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Taxe38 {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Locale locale;

    //ina anne ba4i ye5lsse
    private int anne;
    //kola 3 mois
    @ManyToOne
    private Trim trim;
    // anne imta ja
    private LocalDate datePresentation;
    private int nombreMoisRetard;
    private double montantBase; //somme des bacches
    private double montantRetardPremierMois;//montantRetard=somme des retard
    private double montantTotal;
}
