package com.company.DataWithJPA;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProyectoRepository extends CrudRepository<Proyecto,Long> {

    List<Proyecto> findByProyecto(String proyecto);

    Proyecto findById(long id);

}
