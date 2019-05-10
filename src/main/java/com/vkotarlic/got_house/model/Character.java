package com.vkotarlic.got_house.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "characters")
public class Character {

    @Id
    @JsonIgnore
    private ObjectId id;

    private String name;
    private String dob;
    private int age;
    private String father;
    private String mother;
    private ArrayList<String> titles;

    public Character(ObjectId id, String name, String dob, int age, String father, String mother, ArrayList<String> titles) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.titles = titles;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public ArrayList<String> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<String> titles) {
        this.titles = titles;
    }

}
