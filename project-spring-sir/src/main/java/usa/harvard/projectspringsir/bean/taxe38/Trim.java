package usa.harvard.projectspringsir.bean.taxe38;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Trim{

    @Id
    private Long id;
    private  String libelle ;
    private int numero;
}
