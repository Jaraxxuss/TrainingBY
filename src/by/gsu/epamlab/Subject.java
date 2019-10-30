package by.gsu.epamlab;

public class Subject {
    private final String name;
    private Material material;
    private final double volume;

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    public double getVolume() {
        return volume;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getMass(){
        return material.getDensity() * volume;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%.2f;%.2f",name,material,volume,getMass());
    }
}
