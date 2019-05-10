package com.vkotarlic.got_house.controllers;


import com.vkotarlic.got_house.model.Character;
import com.vkotarlic.got_house.repositories.CharacterRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    @Autowired
    private CharacterRepository repository;

    @GetMapping("/")
    public List<Character> getAllCharacters() {
        return repository.findAll();
    }

    @GetMapping("/{name}")
    public Character characterByName(@PathVariable("name") String name) {
        return repository.findCharacterByNameContaining(name.toLowerCase());
    }

    @PostMapping("/add")
    public Character addCharacter(@Valid @RequestBody Character character, HttpServletResponse response) {
        character.setId(ObjectId.get());
        repository.save(character);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return character;
    }

    @PutMapping("/update/{id}")
    public Character updateCharacter(@PathVariable("id") ObjectId id,@Valid @RequestBody Character character, HttpServletResponse response) {
        character.setId(id);
        repository.save(character);
        response.setStatus(HttpServletResponse.SC_OK);
        return character;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCharacter(@PathVariable("id") ObjectId id, HttpServletResponse response) {
        repository.delete(repository.findById(id));
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

}
