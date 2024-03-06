package com.kirklearn.tickets.repository;

import com.kirklearn.tickets.model.Estacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacionRepository extends CrudRepository<Estacion,Long> {
}
