package com.zinnybest.familiesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FamilyController {

    @Autowired private FamilyService service;

    @GetMapping("/families")
    public List<Family> getFamilies(Integer id){
        return service.getFamilies();
    }
    @PostMapping("/families/addnew")
    public void addFamily(@RequestBody Family family){
       service.addFamily(family);
    }
    @PutMapping("/families/{id}/edit")
    public void updateFamily(@PathVariable("id") Integer id, @RequestBody Family family){
        service.updateFamily(family);
    }
    @DeleteMapping("/families/{id}/delete")
    public void deleteFamily(@PathVariable("id") Integer id){
        service.deleteFamily(id);
    }
}
