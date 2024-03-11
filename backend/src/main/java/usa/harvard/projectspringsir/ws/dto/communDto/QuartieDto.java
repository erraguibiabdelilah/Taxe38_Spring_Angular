package usa.harvard.projectspringsir.ws.dto.communDto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class QuartieDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    private String libelle ;
    @ManyToOne
    private SecteurDto secteurDto;
}
