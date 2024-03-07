package usa.harvard.projectspringsir.ws.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class NotificationRetardTroisiemeNiveauDto {
    @Id
    private Long id;
    @Column(unique = true)
    private String code;
    @ManyToOne
    private LocaleDto localeDto;
    @ManyToOne
    private RedevableDto redevableDto;
    private int anne;
    private String trim;
}
