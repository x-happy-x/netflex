package ru.netflex.moviesserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netflex.moviesserver.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
}
