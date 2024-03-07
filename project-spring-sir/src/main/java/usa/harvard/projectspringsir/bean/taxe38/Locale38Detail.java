package usa.harvard.projectspringsir.bean.taxe38;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locale38Detail {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    //type de panneau
    @ManyToOne
    private TypeLocale38Detail typeLocale38Detail;
    //surface
    private double superficie;
    private boolean active;
}
