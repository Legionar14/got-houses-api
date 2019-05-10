package com.vkotarlic.got_house.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "houses")
public class House {

    @Id
    @JsonIgnore
    private ObjectId _id;

    private String name;
    private String sigil;
    private String seat;
    private ArrayList<String> titles;
    private String lord;
    private String words;
    private String founder;
    private String militaryStrength;

    public House() {}

    public House(ObjectId _id, String name, String sigil, String seat,
                 ArrayList<String> titles, String lord, String words, String founder, String militaryStrength) {
        this._id = _id;
        this.name = name;
        this.sigil = sigil;
        this.seat = seat;
        this.titles = titles;
        this.lord = lord;
        this.words = words;
        this.founder = founder;
        this.militaryStrength = militaryStrength;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSigil() {
        return sigil;
    }

    public void setSigil(String sigil) {
        this.sigil = sigil;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public ArrayList<String> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<String> titles) {
        this.titles = titles;
    }

    public String getLord() {
        return lord;
    }

    public void setLord(String lord) {
        this.lord = lord;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getMilitaryStrength() {
        return militaryStrength;
    }

    public void setMilitaryStrength(String militaryStrength) {
        this.militaryStrength = militaryStrength;
    }

}
