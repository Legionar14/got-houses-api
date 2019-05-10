package com.vkotarlic.got_house.controllers;

import com.vkotarlic.got_house.model.House;
import com.vkotarlic.got_house.repositories.HouseRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/houses")
public class HouseController {

    @Autowired
    private HouseRepository repository;

    @GetMapping("/")
    public List<House> getAllHouses() {
        return repository.findAll();
    }

    @GetMapping("/{name}")
    public House getHouseByName(@PathVariable("name") String name) {
        return repository.findHousesByNameContaining(name.toLowerCase());
    }

    @PostMapping("/add")
    public House createHouse(@Valid @RequestBody House house, HttpServletResponse response) {
        house.set_id(ObjectId.get());
        repository.save(house);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return house;
    }

    @DeleteMapping("/delete/{name}")
    public void deleteHouse(@PathVariable("name") String name, HttpServletResponse response) {
        repository.delete(repository.findHouseByName(name));
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

}
