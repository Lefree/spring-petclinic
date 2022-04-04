package ru.demo.springpetclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.demo.springpetclinic.model.PetType;

public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}
