package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.api.CryptoApi;
import com.example.dto.Crypto;
import com.example.model.CryptoModel;
import java.util.List;
import org.springframework.http.ResponseEntity;
import java.util.Random;

@RestController
public class OpenApiController implements CryptoApi  {

    @Override
    public ResponseEntity<List<CryptoModel>> getAllCrypto(){
        Random random = new Random();
        int randomInt = random.nextInt(); 
        String id = randomInt+"10";
        Crypto c = new Crypto(id, "BTH");
        CryptoModel cm = new CryptoModel();
        cm.setId(c.getId());
        cm.setName(c.getName());
        return ResponseEntity.ok(List.of(cm));
    }

}