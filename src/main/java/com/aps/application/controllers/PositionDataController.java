package com.aps.application.controllers;

import com.aps.application.database.PositionDataEntity;
import com.aps.application.database.PositionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/positiondata")
class PositionDataController {

    @Autowired
    private PositionDataRepository positionDataRepository;

    @GetMapping("/all")
    private Flux<PositionDataEntity> getAllPositionData() {
        Flux<PositionDataEntity> all = Flux.fromIterable(positionDataRepository.findAll());
        return all;
    }

    @GetMapping("/position/{id}")
    private Mono<PositionDataEntity> getPositionDataById(@PathVariable String id) {
        Mono<PositionDataEntity> p = Mono.fromCallable(() -> positionDataRepository.findById(Integer.decode(id)).orElse(new PositionDataEntity()));
        return p;
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

