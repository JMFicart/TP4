package technifutur.be.university.services;

import org.springframework.stereotype.Service;
import technifutur.be.university.exceptions.ElementNotFoundException;
import technifutur.be.university.mappers.LoginMapper;
import technifutur.be.university.models.Login;
import technifutur.be.university.models.LoginDto;
import technifutur.be.university.models.LoginForm;
import technifutur.be.university.repositories.LoginRepository;
import java.util.List;

@Service
public class LoginService {
    private Long nextIdLogin = 3L;
    private final LoginRepository cRepo;
    private final LoginMapper mapper;

    public LoginService(LoginRepository cRepo, LoginMapper mapper) {
        this.cRepo = cRepo;
        this.mapper = mapper;
    }

    public LoginDto getLoginById(Long id){
        return cRepo.findById(id).map(mapper::entity2Dto).orElseThrow(() -> new ElementNotFoundException(id, LoginDto.class));
    }

    public LoginDto getLoginByIdentifiant(String identifiant){
        return this.cRepo.findByIdentifiant(identifiant)
                .map(mapper::entity2Dto)
                .orElseThrow(() -> new ElementNotFoundException(identifiant, LoginDto.class));
    }

    public List<LoginDto> getAll(){
        return cRepo.findAll().stream().map(mapper::entity2Dto).toList();
    }

    public Login insert(LoginForm form){
        Login login = Login.builder()
                .idLogin(++nextIdLogin)
                .identifiant(form.getIdentifiant())
                .password(form.getPassword())
                .idPersonne(form.getIdPersonne())
                .cancelled(false)
                .build();
        cRepo.save(login);
        return login;
    }

    public Login update(LoginForm form){
        Login login = Login.builder()
                .idLogin(form.getIdLogin())
                .identifiant(form.getIdentifiant())
                .password(form.getPassword())
                .idPersonne(form.getIdPersonne())
                .build();
        login = cRepo.save(login);
        return login;
    }

    public Login delete(LoginForm form){
        Login login = Login.builder()
                .cancelled(true)
                .build();
        login = cRepo.save(login);
        return login;
    }
}
