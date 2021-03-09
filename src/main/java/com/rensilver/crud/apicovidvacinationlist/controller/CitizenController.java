package com.rensilver.crud.apicovidvacinationlist.controller;

import com.rensilver.crud.apicovidvacinationlist.entities.Citizen;
import com.rensilver.crud.apicovidvacinationlist.services.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/citizens")
public class CitizenController {

    @Autowired
    private CitizenService service;

    @GetMapping
    public List<Citizen> findAllCategories() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Citizen findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Citizen insert(@RequestBody Citizen citizen) {
        return service.insert(citizen);
    }

    @PutMapping(value = "/{id}")
    public Citizen update(@PathVariable Integer id, @RequestBody Citizen citizen) {
        citizen = service.update(id, citizen);
        return citizen;
    }

    @DeleteMapping(value = "/{id}")
    public Citizen delete(@PathVariable Integer id) {
        Citizen citizen = new Citizen();
        service.delete(id);
        return citizen;
    }
}
