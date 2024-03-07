package usa.harvard.projectspringsir.bean.commun;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.bean.taxe38.CategorieLocale;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locale {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private Rue rue;
    private String complementAdressse;
//    @ManyToOne
//    private Redevable redevable;
    @ManyToOne
    private CategorieLocale categorieLocale;
}
