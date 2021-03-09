package com.rensilver.crud.apicovidvacinationlist.services;

import com.rensilver.crud.apicovidvacinationlist.entities.Category;
import com.rensilver.crud.apicovidvacinationlist.entities.Citizen;
import com.rensilver.crud.apicovidvacinationlist.repositories.CategoryRepository;
import com.rensilver.crud.apicovidvacinationlist.repositories.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CitizenService {

    @Autowired
    private CitizenRepository citizenRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public Iterable<Citizen> findAll() {
       return citizenRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Citizen findById(Integer id) {
        Optional<Citizen> obj = citizenRepository.findById(id);
        Citizen entity = obj.orElseThrow(() -> new RuntimeException("Citizen not found"));
        return new Citizen(entity);
    }

    @Transactional
    public Citizen insert(Citizen entity) {
        Citizen citizen = new Citizen();
        citizen.setName(entity.getName());
        entity = citizenRepository.save(entity);
        return new Citizen(entity);
    }

    @Transactional
    public Citizen update(Integer id, Citizen entity) {
        Citizen citizen = citizenRepository.getOne(id);
        citizen.setName(entity.getName());
        return new Citizen(citizen);
    }

    public void delete(Integer id) {
        citizenRepository.deleteById(id);
    }
}
