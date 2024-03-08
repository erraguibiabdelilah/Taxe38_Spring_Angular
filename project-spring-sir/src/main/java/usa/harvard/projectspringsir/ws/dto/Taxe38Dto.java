package usa.harvard.projectspringsir.ws.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.ws.dto.LocaleDto;
import usa.harvard.projectspringsir.ws.dto.RedevableDto;
import usa.harvard.projectspringsir.ws.dto.TauxTaxe38Dto;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Taxe38Dto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private RedevableDto redevableDto;
    @ManyToOne
    private LocaleDto localeDto;
    @ManyToOne
    private TauxTaxe38Dto tauxTaxe38Dto;
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
