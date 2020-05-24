package com.edu.uac.co.potterhead.Model;

public class Character {
    private String name;
    private String house;
    private String patronus;
    private String species;
    private String bloodStatus;
    private String role;
    private String school;
    private boolean deathEater;
    private boolean dumboldoresArmy;
    private boolean orderOfThePhoenix;
    private boolean ministryOfMagic;
    private String alias;
    private String wand;
    private String boggart;
    private String animagus;

    public Character(String name, String house, String patronus, String species, String bloodStatus, String role,
                     String school, boolean deathEater, boolean dumboldoresArmy, boolean orderOfThePhoenix,
                     boolean ministryOfMagic, String alias, String wand, String boggart, String animagus) {
        this.name = name;
        this.house = house;
        this.patronus = patronus;
        this.species = species;
        this.bloodStatus = bloodStatus;
        this.role = role;
        this.school = school;
        this.deathEater = deathEater;
        this.dumboldoresArmy = dumboldoresArmy;
        this.orderOfThePhoenix = orderOfThePhoenix;
        this.ministryOfMagic = ministryOfMagic;
        this.alias = alias;
        this.wand = wand;
        this.boggart = boggart;
        this.animagus = animagus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isDeathEater() {
        return deathEater;
    }

    public void setDeathEater(boolean deathEater) {
        this.deathEater = deathEater;
    }

    public boolean isDumboldoresArmy() {
        return dumboldoresArmy;
    }

    public void setDumboldoresArmy(boolean dumboldoresArmy) {
        this.dumboldoresArmy = dumboldoresArmy;
    }

    public boolean isOrderOfThePhoenix() {
        return orderOfThePhoenix;
    }

    public void setOrderOfThePhoenix(boolean orderOfThePhoenix) {
        this.orderOfThePhoenix = orderOfThePhoenix;
    }

    public boolean isMinistryOfMagic() {
        return ministryOfMagic;
    }

    public void setMinistryOfMagic(boolean ministryOfMagic) {
        this.ministryOfMagic = ministryOfMagic;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getWand() {
        return wand;
    }

    public void setWand(String wand) {
        this.wand = wand;
    }

    public String getBoggart() {
        return boggart;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public String getAnimagus() {
        return animagus;
    }

    public void setAnimagus(String animagus) {
        this.animagus = animagus;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", house='" + house + '\'' +
                ", patronus='" + patronus + '\'' +
                ", species='" + species + '\'' +
                ", bloodStatus='" + bloodStatus + '\'' +
                ", role='" + role + '\'' +
                ", school='" + school + '\'' +
                ", deathEater=" + deathEater +
                ", dumboldoresArmy=" + dumboldoresArmy +
                ", orderOfThePhoenix=" + orderOfThePhoenix +
                ", ministryOfMagic=" + ministryOfMagic +
                ", alias='" + alias + '\'' +
                ", wand='" + wand + '\'' +
                ", boggart='" + boggart + '\'' +
                ", animagus='" + animagus + '\'' +
                '}';
    }
}
