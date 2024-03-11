package usa.harvard.projectspringsir.bean.communBean;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.bean.taxe38Bean.CategorieLocale;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locale {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
   private Rue rue ;
    private String complementAdressse;
    @ManyToOne
    private CategorieLocale categorieLocale;
    @ManyToOne
    private Redevable redevable;

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }
}
