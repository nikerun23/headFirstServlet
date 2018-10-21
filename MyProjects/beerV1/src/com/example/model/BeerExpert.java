package com.example.model;

import java.util.*;

public class BeerExpert {
  public ArrayList getBrands(String color) {
    ArrayList brands = new ArrayList();
    if (color.equals("Amber")) {
      brands.add("Jack Amber");
      brands.add("Red Moose");
    } else {
      brands.add("Jail Pale Ale");
      brands.add("Gout Moose");
    }
    return brands;
  }
}
