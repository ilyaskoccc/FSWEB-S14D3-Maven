package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){
        System.out.println("Created");
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "Start Engine";
    }

    public String drive() {
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return "Start Drive";
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Run Engine");
    }
}
