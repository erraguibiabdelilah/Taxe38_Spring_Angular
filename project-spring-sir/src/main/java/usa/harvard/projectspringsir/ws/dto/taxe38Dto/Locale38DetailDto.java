package usa.harvard.projectspringsir.ws.dto.taxe38Dto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Locale38DetailDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    private String typeLocale38Detail;
    private double superficie;
    private boolean active;
}
