package usa.harvard.projectspringsir.bean;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    private  Rue rue;
    private String complementAdressse;
    private String CategorieLocale;

}
