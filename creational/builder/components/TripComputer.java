package creational.builder.components;


import creational.builder.cars.Car;

public class TripComputer {

    private Car car;

    public void setCar(Car car){
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Fuel level: "+this.car.getFuel());
    }

    public void showStatus(){
        String status = this.car.getEngine().isStarted() ? "Car is started" : "Car isn't started";
        System.out.println(status);
    }
}
