package com.vkotarlic.got_house.repositories;

import com.vkotarlic.got_house.model.House;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HouseRepository extends MongoRepository<House, String> {

    List<House> findAll();
    House findHouseByName(String name);
    House findHousesByNameContaining(String name);

}
