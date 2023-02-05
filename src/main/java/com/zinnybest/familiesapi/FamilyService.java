package com.zinnybest.familiesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyService {

    @Autowired private FamilyRepository repository;

     public List<Family> getFamilies(){
        return repository.findAll();
    }
    public void addFamily(Family family){
         repository.save(family);
    }
    public void updateFamily(Family family){
         repository.save(family);
    }
    public void deleteFamily(Integer id){
         repository.deleteById(id);
    }


}
