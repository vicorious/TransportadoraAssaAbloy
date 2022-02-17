package com.transportadoraassaabloy.assaabloy.api;

import com.transportadoraassaabloy.assaabloy.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("${app.context-api}/prueba")
@RestController
public class Api {

    @Autowired
    PruebaService pruebaService;

    @GetMapping("prueba-api")
    public ResponseEntity<?> DemoApi(){
        try {
            return new ResponseEntity<>(pruebaService.pruebaApi(), HttpStatus.OK);
        } catch (Exception error){
            return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
        }
    }

}
