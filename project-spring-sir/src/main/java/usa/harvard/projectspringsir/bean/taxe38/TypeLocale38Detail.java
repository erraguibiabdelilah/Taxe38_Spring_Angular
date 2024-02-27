package usa.harvard.projectspringsir.bean.taxe38;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TypeLocale38Detail {
    @Id
    private Long id;
    private String code;
    private String libelle; //type panneau publicitaire


}
