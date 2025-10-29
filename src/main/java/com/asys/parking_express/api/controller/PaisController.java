package com.asys.parking_express.api.controller;

import com.asys.parking_express.persistencia.entity.PaisEntity;
import com.asys.parking_express.servicios.PaisService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/pais")
public class PaisController {
    private final PaisService service;

    public PaisController(PaisService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<PaisEntity> mostrarPaises() {
        return service.verPaises();
    }

    @PostMapping("/crearPais")
    public PaisEntity crearPais(@RequestBody PaisEntity pais){
        return service.GuardarPais(pais);
    }
}