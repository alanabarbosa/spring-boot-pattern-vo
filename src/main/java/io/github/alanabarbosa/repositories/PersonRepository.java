package io.github.alanabarbosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.alanabarbosa.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
