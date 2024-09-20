package org.apiuniara.controllers;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apiuniara.models.Cliente;
import org.apiuniara.services.ClienteService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
@Validated
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public Cliente add(@Valid @RequestBody Cliente cliente){
        return clienteService.add(cliente);
    }

    @GetMapping
    public List<Cliente> findAll(){
        return  clienteService.findAll();
    }

}
