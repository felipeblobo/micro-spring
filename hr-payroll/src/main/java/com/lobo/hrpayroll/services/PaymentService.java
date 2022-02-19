package com.lobo.hrpayroll.services;

import com.lobo.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Felipe", 200.0, days);
    }
}
