package usa.harvard.projectspringsir.ws.dto.taxe38Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
public class TypeLocale38DetailDto {

    private Long id;
    private String code;
    private String libelle; //type panneau publicitaire
}
