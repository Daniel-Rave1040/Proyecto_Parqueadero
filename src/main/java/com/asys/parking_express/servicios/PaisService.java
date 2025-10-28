package com.asys.parking_express.servicios;

import com.asys.parking_express.persistencia.entity.PaisEntity;
import com.asys.parking_express.persistencia.repository.PaisRepository;
import org.springframework.stereotype.Service;

@Service
public class PaisService {
    private final PaisRepository repository;

    public PaisService(PaisRepository repository) {
        this.repository = repository;
    }
    public PaisEntity GuardarPais(PaisEntity pais){
        return repository.save(pais);
    }
}
