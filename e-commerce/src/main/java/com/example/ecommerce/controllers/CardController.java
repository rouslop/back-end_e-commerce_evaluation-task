package com.example.ecommerce.controllers;

import com.example.ecommerce.models.DTCard;
import com.example.ecommerce.services.CreditCardService;
import com.example.ecommerce.services.implementations.CreditCardServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/card")
public class CardController {
    private CreditCardService creditCardService = new CreditCardServiceImpl();

    @PostMapping("/check")
    public ResponseEntity checkCard(@RequestBody DTCard card){
        if (creditCardService.checkCard(card)){
            return ResponseEntity.ok().body(HttpStatus.OK);
        }
        else {
            return ResponseEntity.badRequest().body(HttpStatus.BAD_REQUEST);
        }
    }
}
