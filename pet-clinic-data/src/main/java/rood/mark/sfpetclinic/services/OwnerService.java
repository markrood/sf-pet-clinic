package rood.mark.sfpetclinic.services;

import rood.mark.sfpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
