package com.FirstCrud.FirstCrud.controller;

import com.FirstCrud.FirstCrud.dto.ClientDTO;
import com.FirstCrud.FirstCrud.entity.Client;
import com.FirstCrud.FirstCrud.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")

public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/save")
    public Client save(@RequestBody ClientDTO clientDTO){

        return this.clientService.SaveClient(clientDTO);

    }
    @PostMapping("/update")
    public Client Update(@RequestBody ClientDTO clientDTO, Long id){

        return this.clientService.UpdateClient(clientDTO,id);

    }

    @GetMapping("/get")
    public Client get(@RequestParam long id){
        return this.clientService.getClient( id);
    }
}
