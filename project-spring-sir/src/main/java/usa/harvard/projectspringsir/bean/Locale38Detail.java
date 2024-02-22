package usa.harvard.projectspringsir.bean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private String typeLocale38Detail;
    //surface
    private double superficie;
    private boolean active;
    //mohammed ezzaim Locale38Detail
}
