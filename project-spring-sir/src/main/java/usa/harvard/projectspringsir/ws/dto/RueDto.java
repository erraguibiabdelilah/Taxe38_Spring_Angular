package usa.harvard.projectspringsir.ws.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.ws.dto.QuartieDto;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RueDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    private String libelle;
    @ManyToOne
    private QuartieDto quartieDto;
}
