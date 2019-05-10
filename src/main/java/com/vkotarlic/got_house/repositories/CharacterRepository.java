package com.vkotarlic.got_house.repositories;

import com.vkotarlic.got_house.model.Character;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CharacterRepository extends MongoRepository<Character, String> {

    List<Character> findAll();
    Character findById(ObjectId id);
    Character findCharacterByName(String name);
    Character findCharacterByNameContaining(String name);

}
