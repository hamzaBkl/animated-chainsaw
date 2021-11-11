package com.example.mypetclinic.Services;

import com.example.mypetclinic.model.Owner;
import com.example.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
