package com.lobo.hrpayroll.services;

import com.lobo.hrpayroll.client.WorkerFeignClient;
import com.lobo.hrpayroll.entities.Payment;
import com.lobo.hrpayroll.entities.Worker;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClient.findWorker(workerId).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
