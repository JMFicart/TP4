package technifutur.be.university.models;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class LoginForm {
    private Long idLogin;
    @NotBlank(message="L'identifiant ne peut être vide et ne pas doit dépasser 50 caractères !")
    @Size(min=1, max=50)
    private String identifiant;
    @NotBlank(message="Le mot de passe ne peut être vide et ne pas doit dépasser 50 caractères !")
    @Size(min=1, max=50)
    private String password;
    private Long idPersonne;
    private boolean cancelled;
}
