/*package com.cg.archaeology.Archaeology.controller;

import com.cg.archaeology.Archaeology.exception.ArchaeologyIDNotFoundException;
import com.cg.archaeology.Archaeology.model.Archaeology;
import com.cg.archaeology.Archaeology.service.ArchaeologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
*/
/*
* Author: Ananya, Priyanka, Umang
* Description: Controller Class for all Functionalities
* Created On: 03/12/2019
 */
/*
@RestController

@RequestMapping("/capi/dcx/camel/v1")

public class Controller {

    @Autowired
    private ArchaeologyService service;

    @GetMapping(value = "GET/archaeology-sites")
    public HashMap<Integer, Archaeology> list(Model model){
        //Iterable archaeologicalServiceList = archaeologicalService.listAllProducts();
        return service.viewAllArchaeologies();

    }

    @PostMapping(value="POST/archaeology-sites")
    public ResponseEntity saveArchaelogy(@RequestBody Archaeology archaeology){
        boolean result = service.createArchaeology(archaeology);
        if(result)
            return new ResponseEntity("Archaeology Site added successfully", HttpStatus.OK);
        else
            return new ResponseEntity("Archaeology Site could not be added", HttpStatus.NOT_IMPLEMENTED);
    }



    @GetMapping( value = "GET/archaeology-sites/{id}")
    public Archaeology showArchaeology(@PathVariable Integer id) throws ArchaeologyIDNotFoundException{
        Archaeology archaeology = service.viewArchaeologyById(id);
        if(archaeology!=null)
            return archaeology;
        else
            throw new ArchaeologyIDNotFoundException("Archaeology Site with ID: "+id+" not found!");
    }

    @PutMapping(value = "PUT/archaeology-sites/{id}")
    public ResponseEntity updateArchaeologyById(@PathVariable Integer id, @RequestBody Archaeology archaeology) throws ArchaeologyIDNotFoundException{
        // Archaeology storedArch = Archaeology.getArchaeologyById(id);
        archaeology.setId(id);
        boolean result = service.updateArchaeologyById(archaeology,id);
        if(result)
            return new ResponseEntity("Archaeology Site updated successfully", HttpStatus.OK);
        else
            throw new ArchaeologyIDNotFoundException("Archaeology Site with ID: "+id+" not found!");

    }

    @DeleteMapping(value="DELETE/archaeology-sites/{id}")
    public ResponseEntity delete(@PathVariable Integer id) throws ArchaeologyIDNotFoundException{
        boolean result = service.deleteArchaeologyById(id);
        if(result)
            return new ResponseEntity("Archaeology Site deleted successfully", HttpStatus.OK);
        else
            throw new ArchaeologyIDNotFoundException("Archaeology Site with ID: "+id+" not found!");
    }







}


*/