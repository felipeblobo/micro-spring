package com.lobo.hrworker.resources;

import com.lobo.hrworker.entities.Worker;
import com.lobo.hrworker.repositories.WorkerRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/workers")
@AllArgsConstructor
public class WorkerResources {

    private WorkerRepository workerRepository;

    private Environment env;

    private static Logger logger = LoggerFactory.getLogger(WorkerResources.class);

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findWorker(@PathVariable final Long id) {

        logger.info("PORT = " + env.getProperty("local.server.port"));

        Worker worker = workerRepository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
