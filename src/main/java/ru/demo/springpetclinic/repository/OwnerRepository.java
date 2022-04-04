package ru.demo.springpetclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.demo.springpetclinic.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
