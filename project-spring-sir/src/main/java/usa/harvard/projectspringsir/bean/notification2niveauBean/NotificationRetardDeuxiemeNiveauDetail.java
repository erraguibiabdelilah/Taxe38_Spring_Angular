package usa.harvard.projectspringsir.bean.notification2niveauBean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import usa.harvard.projectspringsir.bean.taxe38Bean.Trim;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class NotificationRetardDeuxiemeNiveauDetail {
     @Id
     private Long id;
     @Column(unique = true)
     private String code;
     @ManyToOne
     private Trim trim;
     private double montantBase;
     private double montantRetardPremierMois;
     private double montantRetardAutreMois;
     private double montantTotal;
}
