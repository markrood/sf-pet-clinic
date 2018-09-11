package rood.mark.sfpetclinic.services;

import rood.mark.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
