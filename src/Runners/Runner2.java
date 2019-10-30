package Runners;

import by.gsu.epamlab.Material;
import by.gsu.epamlab.Subject;

public class Runner2 {
    public static void main(String[] args) {
        //1
        Material steel = new Material("steel",7850.0);
        Material copper = new Material("copper",8500.0);
        Subject wire = new Subject("wire",steel,0.03);
        //2
        System.out.println(wire);
        //3
        wire.setMaterial(copper);
        System.out.println("The wire mass is " + wire.getMass() + " kg.");

    }
}
