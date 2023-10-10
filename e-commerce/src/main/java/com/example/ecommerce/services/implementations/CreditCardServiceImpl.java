package com.example.ecommerce.services.implementations;

import com.example.ecommerce.models.DTCard;
import com.example.ecommerce.services.CreditCardService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CreditCardServiceImpl implements CreditCardService {
    @Override
    public boolean checkCard(DTCard card) {
        if ((card.getNumber().toString().length() < 16 ) || (card.getNumber().toString().length() > 19)){
            return false;
        }
        else if (card.getCvv().toString().length() != 3 && card.getCvv().toString().length() != 4) {
            return false;
        }
        else if (card.getCvv().toString().length() == 4) {
            if ((card.getNumber().toString().startsWith("34")) || (card.getNumber().toString().startsWith("37"))) {
                return !card.getExpiryDate().isBefore(LocalDate.now());
            } else return false;
        }
        else {
            return !card.getExpiryDate().isBefore(LocalDate.now());
        }
    }
}
