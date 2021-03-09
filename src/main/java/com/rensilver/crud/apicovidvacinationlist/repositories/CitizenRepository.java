package com.rensilver.crud.apicovidvacinationlist.repositories;

import com.rensilver.crud.apicovidvacinationlist.entities.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
}
