package usa.harvard.projectspringsir.bean.taxe38;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CategorieLocale {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String libelle;
    private String code;
}
