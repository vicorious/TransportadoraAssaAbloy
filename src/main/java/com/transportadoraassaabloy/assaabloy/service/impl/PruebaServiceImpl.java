package com.transportadoraassaabloy.assaabloy.service.impl;

import com.transportadoraassaabloy.assaabloy.service.PruebaService;
import org.springframework.stereotype.Service;

@Service
public class PruebaServiceImpl implements PruebaService {

    @Override
    public String pruebaApi() {
        return "OK";
    }

}
