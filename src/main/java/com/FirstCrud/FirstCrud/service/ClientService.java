package com.FirstCrud.FirstCrud.service;

import com.FirstCrud.FirstCrud.dto.ClientDTO;
import com.FirstCrud.FirstCrud.entity.Client;
import jdk.internal.org.jline.reader.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FirstCrud.FirstCrud.repository.ClientRepository;

import java.util.List;

@Service 
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;



    public Client SaveClient(ClientDTO clientDTO){
        Client client = new Client();
        client.setName(clientDTO.Name());
        client.setPassword(clientDTO.Password());
        return this.clientRepository.save(client);

    }

    public Client UpdateClient(ClientDTO clientDTO, Long id){

        Client client = this.clientRepository.findById(id).get();


        client.setPassword(clientDTO.Password());
        return this.clientRepository.save(client);

    }
    public Client getClient(Long id){

       return this.clientRepository.findById(id).get();

    }
    public List<Client> getALLClient(Long id){

        return this.clientRepository.findAll();

    }

    public void Delete(Long id){
        this.clientRepository.deleteById(id);
    }
}
