package usa.harvard.projectspringsir.bean.taxe38;
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
@Entity
public class Taxe38Detail {
    //type de material !! wach bache wela icone wela chi haja 5era
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private Locale38Detail locale38Detail;
    @ManyToOne
    private TauxTaxe38 tauxTaxe38;
    @ManyToOne
    private Taxe38 taxe38;
    private double montantBase;// bach
    private double montantRetardPremierMois;
    private double montantRetardAutreMois;

}
