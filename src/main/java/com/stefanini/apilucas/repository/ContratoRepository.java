package com.stefanini.apilucas.repository;

import com.stefanini.apilucas.model.ContratoModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContratoRepository extends CrudRepository<ContratoModel,Integer> {

    List<ContratoModel> findByNumber(final Integer number);
}
