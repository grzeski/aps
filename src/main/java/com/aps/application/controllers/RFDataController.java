package com.aps.application.controllers;

import com.aps.application.database.RFDataEntity;
import com.aps.application.database.RFDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/rfdata")
class RFDataController {

    @Autowired
    private RFDataRepository rfDataRepository;

    @GetMapping("/all")
    private Flux<RFDataEntity> getAllPositionData() {
        Flux<RFDataEntity> all = Flux.fromIterable(rfDataRepository.findAll());
        return all;
    }

    @GetMapping("/rf/{id}")
    private Mono<RFDataEntity> getPositionDataById(@PathVariable String id) {
        Mono<RFDataEntity> r = Mono.fromCallable(() -> rfDataRepository.findById(Integer.decode(id)).orElse(new RFDataEntity()));
        return r;
    }

    @PutMapping(value = "/create")
    public void positiondataPut() {
        throw new ResponseStatusException(
                HttpStatus.METHOD_NOT_ALLOWED);
    }

    @PostMapping(value = "/create")
    public void positiondataPost() {
        throw new ResponseStatusException(
                HttpStatus.METHOD_NOT_ALLOWED);
    }


    @DeleteMapping(value = "/delete")
    public void positiondataDelete() {
        throw new ResponseStatusException(
                HttpStatus.METHOD_NOT_ALLOWED);
    }

}

