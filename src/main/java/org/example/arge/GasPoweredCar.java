package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter(){
        return this.avgKmPerLitre;
    }

    public int getCylinders(){
        return this.cylinders;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "GasPoweredCar's engine is starting";
    }

    @Override
    public String drive(){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return "GasPoweredCar is being drove";
    }
}
