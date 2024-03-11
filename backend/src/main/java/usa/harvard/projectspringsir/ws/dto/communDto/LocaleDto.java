package usa.harvard.projectspringsir.ws.dto.communDto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.ws.dto.communDto.RueDto;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LocaleDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private RueDto rueDto;
    private String complementAdressse;
    private String CategorieLocale;

}
