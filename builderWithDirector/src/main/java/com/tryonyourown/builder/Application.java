package com.tryonyourown.builder;

/**
 * Hello Builder with Director Design Pattern !
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        System.out.println( "Builder with Director Design Pattern" );
        Director director = new Director();
        // Building Sports car
        SportsCar sportsCar = new SportsCar();
        director.setCar(sportsCar);
        director.buildSportsCar();
        Car mySportsCar = sportsCar.getProduct();
        System.out.println(mySportsCar.start());

        // Building SUV Car
        SUVCar suvCar = new SUVCar();
        director.setCar(suvCar);
        director.buildSUVCar();
        Car mySuvCar = suvCar.getProduct();
        System.out.println(mySuvCar.start());
    }
}
