package com.rtcf85.condominio.controler;

import com.rtcf85.condominio.entity.Condominium;
import com.rtcf85.condominio.entity.dto.CondominiumDTO;
import com.rtcf85.condominio.repository.CondominiumRepository;
import com.rtcf85.condominio.service.CondominiumService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("condominium")
public class CondominiumController {

    @Autowired
    private CondominiumService condominiumService;

    @GetMapping("")
    public Iterable<Condominium> list() {

        return condominiumService.findAll();
    }

    @GetMapping("/{id}")
    public Condominium get(@PathVariable("id") Long id) {

        Optional<Condominium> condominium = condominiumService.get(id);
        if(condominium.isPresent()) {
            return condominium.get();
        } else {
           return null;
        }
    }

    @PostMapping("")
    public Condominium add(@RequestBody Condominium condominium){

        return condominiumService.save(condominium);
    }

    @PutMapping("")
    public Condominium update(@RequestBody Condominium condominium){
        return condominiumService.save(condominium);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        condominiumService.delete(id);
    }

    @GetMapping("/findByStateName/{stateName}")
    public List<Condominium> findByStateName(@PathVariable("stateName") String stateName) {
        return condominiumService.findByStateName(stateName);
    }

    @GetMapping("/findByCityName/{cityName}")
    public List<Condominium> findByCityName(@PathVariable("cityName") String cityName) {
        return condominiumService.findByCityName(cityName);
    }
}