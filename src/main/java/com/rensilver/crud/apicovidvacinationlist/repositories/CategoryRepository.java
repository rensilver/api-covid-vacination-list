package com.rensilver.crud.apicovidvacinationlist.repositories;

import com.rensilver.crud.apicovidvacinationlist.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
