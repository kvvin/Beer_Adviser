package com.kvvin.beeradviser;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("1. Fat Tire  \n");
            brands.add("2. Eliot Ness  \n");
            brands.add("3. Boston Lager \n");
        } else if (color.equals("light"))
        {
            brands.add("1. Kingfisher Ultra Light:e\n");
            brands.add("2. Carlsberg Smootht\n");
            brands.add("3. Carlsberg Smooth");
        }
        else if (color.equals("brown")){
            brands.add("1. Kingfisher Ultra Max \n");
            brands.add("2. Hoegaarden Brown \n");
            brands.add("3. Bira 91 Brown Ale");
        }
        else {
            brands.add("1. Guinness Foreign Extra Stout \n");
            brands.add("2. Simba Stout \n");
            brands.add("3. Toit Black Knight");
        }
        return brands;

    }
}
