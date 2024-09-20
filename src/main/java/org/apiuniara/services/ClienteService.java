package org.apiuniara.services;

import lombok.RequiredArgsConstructor;
import org.apiuniara.models.Cliente;
import org.apiuniara.repositories.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    public Cliente add(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
