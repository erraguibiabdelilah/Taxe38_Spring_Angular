package usa.harvard.projectspringsir.ws.dto.communDto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class RedevableDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    private String ref;
    private String  name ;
    private String prenom;
    private String email;
}
