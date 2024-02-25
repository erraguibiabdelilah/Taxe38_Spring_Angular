package usa.harvard.projectspringsir.ws.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor

public class NotificationRetardDeuxiemeNiveauDetail {
     @Id
     private Long id;
     @Column(unique = true)
     private String code;
     private double trim;
     private double montantBase;
     private double montantRetardPremierMois;
     private double montantRetardAutreMois;
     private double montantTotal;
}
