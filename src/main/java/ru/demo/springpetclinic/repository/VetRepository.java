package ru.demo.springpetclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.demo.springpetclinic.model.Vet;

public interface VetRepository extends JpaRepository<Vet, Long> {
}
