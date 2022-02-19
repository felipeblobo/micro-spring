package com.lobo.hrpayroll.client;

import com.lobo.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hr-worker", url="localhost:8001", path = "/workers")
@Component
public interface WorkerFeignClient {

    @GetMapping("/{id}")
    ResponseEntity<Worker> findWorker(@PathVariable final Long id);
}
