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
public class Taxe38Detail {
    //type de material !! wach bache wela icone wela chi haja 5era
    @Id
    private Long id;
    @ManyToOne
    private Locale38Detail locale38Detail;
    // chehal men metre kari
    private double montantBase;
    private double montantRetardPremierMois;
    private double montantRetardAutreMois;
}
