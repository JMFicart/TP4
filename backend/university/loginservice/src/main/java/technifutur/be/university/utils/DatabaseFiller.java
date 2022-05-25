package technifutur.be.university.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import technifutur.be.university.models.Login;
import technifutur.be.university.repositories.LoginRepository;
import java.text.ParseException;

@Component
public class DatabaseFiller  implements InitializingBean {
    private final LoginRepository cRepo;

    public DatabaseFiller(LoginRepository cRepo) {
        this.cRepo = cRepo;
    }

    private void setupLogin() throws ParseException {
        Login l = Login.builder()
                .idLogin(1L)
                .identifiant("USR1")
                .password("ABCDE")
                .idPersonne(1L)
                .cancelled(false)
                .build();
        cRepo.save(l);
        System.out.println(l.getIdentifiant());

        l = Login.builder()
                .idLogin(2L)
                .identifiant("USR2")
                .password("12345")
                .idPersonne(2L)
                .cancelled(false)
                .build();
        cRepo.save(l);
        System.out.println(l.getIdentifiant());

        l = Login.builder()
                .idLogin(3L)
                .identifiant("USR3")
                .password("XY123")
                .idPersonne(3L)
                .cancelled(false)
                .build();
        cRepo.save(l);
        System.out.println(l.getIdentifiant());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setupLogin();
    }
}
