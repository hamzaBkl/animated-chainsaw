package com.example.mypetclinic.bootstrap;

import com.example.mypetclinic.Services.OwnerService;
import com.example.mypetclinic.Services.VetService;
import com.example.mypetclinic.Services.map.OwnerServiceMap;
import com.example.mypetclinic.Services.map.VetServiceMap;
import com.example.mypetclinic.model.Owner;
import com.example.mypetclinic.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {

        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jon");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        Vet vet1=new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Walter");
        vet1.setLastName("white");
        vetService.save(vet1);

    }
}
