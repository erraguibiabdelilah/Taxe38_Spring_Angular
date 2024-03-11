package usa.harvard.projectspringsir.ws.dto.communDto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.ws.dto.communDto.VilleDto;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SecteurDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    private String libelle;
    @ManyToOne
    private VilleDto villeDto;
}
