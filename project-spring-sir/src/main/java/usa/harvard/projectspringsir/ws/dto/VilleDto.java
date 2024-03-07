package usa.harvard.projectspringsir.ws.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class VilleDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    private String libelle;
}
