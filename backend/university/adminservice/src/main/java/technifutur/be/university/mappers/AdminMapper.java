package technifutur.be.university.mappers;

import org.springframework.stereotype.Service;
import technifutur.be.university.models.admin.Admin;
import technifutur.be.university.models.admin.AdminDto;

@Service
public class AdminMapper {
    public AdminDto entity2Dto(Admin entity) {
        if(entity == null) {
            return null;
        }
        return AdminDto.builder()
                .idPersonne(entity.getIdPersonne())
                .NomPersonne(entity.getNomPersonne())
                .PrenomPersonne(entity.getPrenomPersonne())
                .AdressePersonne(entity.getAdressePersonne())
                .NoRuePersonne(entity.getNoRuePersonne())
                .LocalitePersonne(entity.getLocalitePersonne())
                .CodePostalPersonne(entity.getCodePostalPersonne())
                .TelephonePersonne(entity.getTelephonePersonne())
                .EmailPersonne(entity.getEmailPersonne())
                .DateIn(entity.getDateIn())
                .DateOut(entity.getDateOut())
                .TypePersonne(entity.getTypePersonne())
                .Id_Horaire(entity.getId_Horaire())
                .Id_Login(entity.getId_Login())
                .build();
    }
}
