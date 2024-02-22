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
public class Taxe38 {
    @Id
    private Long id;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Locale locale;
    @ManyToOne
    private TauxTaxe38 tauxTaxe38;
    //ina anne ba4i ye5lsse
    private int anne;
    //kola 3 mois
    private double trim;
    // anne imta ja
    private Date datePresentation;
    private int nombreMoisRetard;
    private double montantBase;
    private double montantRetardPremierMois;
    private double montantTotal;
}
