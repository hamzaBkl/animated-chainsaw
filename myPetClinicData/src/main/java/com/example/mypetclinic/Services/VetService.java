package com.example.mypetclinic.Services;

import com.example.mypetclinic.model.Pet;
import com.example.mypetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
