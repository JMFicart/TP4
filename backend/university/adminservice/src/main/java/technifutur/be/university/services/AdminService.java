package technifutur.be.university.services;

import org.springframework.stereotype.Service;
import technifutur.be.university.exceptions.ElementNotFoundException;
import technifutur.be.university.mappers.AdminMapper;
import technifutur.be.university.models.Admin;
import technifutur.be.university.models.AdminDto;
import technifutur.be.university.models.AdminForm;
import technifutur.be.university.repositories.AdminRepository;
import java.time.LocalDate;
import java.util.List;

@Service
public class AdminService {
    private Long nextIdAdmin = 3L;
    private final AdminRepository cRepo;
    private final AdminMapper mapper;

    public AdminService(AdminRepository cRepo, AdminMapper mapper) {
        this.cRepo = cRepo;
        this.mapper = mapper;
    }

    public AdminDto getAdminById(Long id){
        return cRepo.findById(id).map(mapper::entity2Dto).orElseThrow(() -> new ElementNotFoundException(id, AdminDto.class));
    }

    public List<AdminDto> getAll(){
        return cRepo.findAll().stream().map(mapper::entity2Dto).toList();
    }

    public Admin insert(AdminForm form){
        Admin administratif = Admin.builder()
                .idPersonne(++nextIdAdmin)
                .NomPersonne(form.getNomPersonne())
                .PrenomPersonne(form.getPrenomPersonne())
                .AdressePersonne(form.getAdressePersonne())
                .NoRuePersonne(form.getNoRuePersonne())
                .LocalitePersonne(form.getLocalitePersonne())
                .CodePostalPersonne(form.getCodePostalPersonne())
                .TelephonePersonne(form.getTelephonePersonne())
                .EmailPersonne(form.getEmailPersonne())
                .DateIn(form.getDateIn())
                .TypePersonne("P")
                .Id_Horaire(form.getId_Horaire())
                .Id_Login(form.getId_Login())
                .build();
        cRepo.save(administratif);
        return administratif;
    }

    public Admin update(AdminForm form){
        Admin administratif = Admin.builder()
                .NomPersonne(form.getNomPersonne())
                .PrenomPersonne(form.getPrenomPersonne())
                .AdressePersonne(form.getAdressePersonne())
                .NoRuePersonne(form.getNoRuePersonne())
                .LocalitePersonne(form.getLocalitePersonne())
                .CodePostalPersonne(form.getCodePostalPersonne())
                .TelephonePersonne(form.getTelephonePersonne())
                .EmailPersonne(form.getEmailPersonne())
                .DateIn(form.getDateIn())
                .TypePersonne("P")
                .Id_Horaire(form.getId_Horaire())
                .Id_Login(form.getId_Login())
                .build();
        administratif = cRepo.save(administratif);
        return administratif;
    }

    public Admin delete(AdminForm form){
        Admin administratif = Admin.builder()
                .DateOut(LocalDate.now())
                .build();
        administratif = cRepo.save(administratif);
        return administratif;
    }
}
