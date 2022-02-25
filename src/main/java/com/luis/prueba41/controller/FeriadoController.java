package com.luis.prueba41.controller;

import com.luis.prueba41.model.Feriado;
import com.luis.prueba41.service.FeriadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feriado")
public class FeriadoController
{
    @Autowired
    FeriadoService feriadoService;

    @PostMapping("/create")
    public void add(@RequestBody Feriado feriado) {
        feriadoService.saveFeriado(feriado);
    }
}
