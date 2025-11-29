package com.major.travelai.model;

public class Destination{
    private String city;
    private String country;
    private String description;

    public Destination(){}

    public Destination(String city,String country,String description)
    {
        this.city=city;
        this.country=country;
        this.description=description;
    }
//    getter and setter for city
    public String getCity(){
        return city;
    }
    public void setCity(String city)
    {
      this.city=city;
    }

//    getter and setter for country
    public String getCountry(){
        return country;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }

//    getter and setter for description
    public String getDescription(){
        return description;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

}
