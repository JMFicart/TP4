package technifutur.be.university.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginDto {
    private Long idLogin;
    private String identifiant;
    private String password;
    private Long idPersonne;
    private boolean cancelled;
}
