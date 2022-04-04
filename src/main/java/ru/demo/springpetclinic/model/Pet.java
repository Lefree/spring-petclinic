package ru.demo.springpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

/**
 * Класс питомца.
 */
@Entity
public class Pet {

    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long petId;

    /**
     * Вид.
     */
    @OneToOne
    private PetType petType;

    /**
     * Владелец.
     */
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Owner owner;

    /**
     * Дата рождения.
     */
    private LocalDate birthDate;

    /**
     * Дата последнего посещения.
     */
    private LocalDate lastVisitDate;

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getLastVisitDate() {
        return this.lastVisitDate;
    }

    public void setLastVisitDate(LocalDate visitDate) {
        this.lastVisitDate = visitDate;
    }
}
