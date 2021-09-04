package com.stefanini.apilucas.controller;

import com.stefanini.apilucas.model.ContratoModel;
import com.stefanini.apilucas.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/contratos")
public class ContratoController {
    @Autowired
    ContratoService service;

    @GetMapping
    public ResponseEntity<List<ContratoModel>> contratoGet() {
        List<ContratoModel> list = service.contratoGet();
        if (!list.isEmpty()) {
            return ResponseEntity.ok(list);
        }
        return ResponseEntity.notFound().build();

    }

    @PostMapping
    public ResponseEntity<Void> contratoPost(@RequestBody ContratoModel contratoModel) {

        if (service.contratoPost(contratoModel)) {
            return ResponseEntity.status(201).build();
        }

        return ResponseEntity.status(403).build();
    }

}
