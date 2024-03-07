package usa.harvard.projectspringsir.bean.taxe38;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Trim{
    @Id  @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private  String libelle ;
    private int numero;
}
