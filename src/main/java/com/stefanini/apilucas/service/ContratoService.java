package com.stefanini.apilucas.service;

import com.stefanini.apilucas.model.ContratoModel;
import com.stefanini.apilucas.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContratoService {
    @Autowired
    ContratoRepository repository;

    public List<ContratoModel> contratoGet() {
        return (List<ContratoModel>) repository.findAll();
    }

    public boolean contratoPost(ContratoModel contratoModel) {
        if (contratoModel.getName() != null) {
            repository.save(contratoModel);
            return true;
        }
        return false;
    }

}
