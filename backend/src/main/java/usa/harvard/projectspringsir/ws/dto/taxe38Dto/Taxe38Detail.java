package usa.harvard.projectspringsir.ws.dto.taxe38Dto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Taxe38Detail {
    //type de material !! wach bache wela icone wela chi haja 5era
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private Locale38DetailDto locale38DetailDto;
    // chehal men metre kari
    private double montantBase;
    private double montantRetardPremierMois;
    private double montantRetardAutreMois;
}
