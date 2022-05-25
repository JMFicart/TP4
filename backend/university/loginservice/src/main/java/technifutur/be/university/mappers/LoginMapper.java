package technifutur.be.university.mappers;

import org.springframework.stereotype.Service;
import technifutur.be.university.models.Login;
import technifutur.be.university.models.LoginDto;

@Service
public class LoginMapper {
    public LoginDto entity2Dto(Login entity) {
        if(entity == null) {
            return null;
        }
        return LoginDto.builder()
                .idLogin(entity.getIdLogin())
                .identifiant(entity.getIdentifiant())
                .password(entity.getPassword())
                .idPersonne(entity.getIdPersonne())
                .cancelled(entity.isCancelled())
                .build();
    }
}
