package com.luis.prueba41.service;

import com.luis.prueba41.model.Feriado;
import com.luis.prueba41.repository.FeriadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class FeriadoService
{
    @Autowired
    private FeriadoRepository feriadoRepository;

    public void saveFeriado(Feriado feriado) {
        feriadoRepository.save(feriado);
    }

}
