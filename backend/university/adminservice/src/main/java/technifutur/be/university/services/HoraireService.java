package technifutur.be.university.services;

import org.springframework.stereotype.Service;
import technifutur.be.university.exceptions.ElementNotFoundException;
import technifutur.be.university.mappers.HoraireMapper;
import technifutur.be.university.models.*;
import technifutur.be.university.repositories.HoraireRepository;
import java.util.List;

@Service
public class HoraireService {
    private Long nextIdHoraire = 1L;
    private final HoraireRepository hRepo;
    private final HoraireMapper mapper;

    public HoraireService(HoraireRepository hRepo, HoraireMapper mapper) {
        this.hRepo = hRepo;
        this.mapper = mapper;
    }

    public HoraireDto getHoraireById(Long id){
        return hRepo.findById(id).map(mapper::entity2Dto).orElseThrow(() -> new ElementNotFoundException(id, HoraireDto.class));
    }

    public List<HoraireDto> getAll(){
        return hRepo.findAll().stream().map(mapper::entity2Dto).toList();
    }

    public Horaire insert(HoraireForm form){
        Horaire horaire = Horaire.builder()
                .IdHoraire(++nextIdHoraire)
                .LibelleHoraire(form.getLibelleHoraire())
                .build();
        hRepo.save(horaire);
        return horaire;
    }

    public Horaire update(HoraireForm form){
        Horaire horaire = Horaire.builder()
                .LibelleHoraire(form.getLibelleHoraire())
                .build();
        horaire = hRepo.save(horaire);
        return horaire;
    }

//    public Horaire delete(HoraireForm form){
//        Horaire horaire = Horaire.builder()
//                .DateOut(LocalDate.now())
//                .build();
//        horaire = hRepo.save(horaire);
//        return horaire;
//    }
}
