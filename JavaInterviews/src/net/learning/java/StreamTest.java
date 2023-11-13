package net.learning.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("sedan", "BMW", "530", 1998));
        cars.add(new Car("sedan", "Audi", "A5", 1998));
        cars.add(new Car("sedan", "Mercedes", "E-Class", 2500));
        cars.add(new Car("hatchback", "Skoda", "Octavia", 1600));
        cars.add(new Car("hatchback", "Toyota", "TypeR", 1450));

        List<Car> sedanCars = cars.stream().filter(car -> car.type.equals("sedan")).collect(Collectors.toList());
        List<String> carMakeList = cars.stream().map(car -> car.make).collect(Collectors.toList());
        List<String> carMakeModelList = cars.stream().flatMap(car -> Stream.of(car.make, car.model)).collect(Collectors.toList());
        
        //lazy execution
        Stream<Integer> integerStream = Stream.of(10, 11, 12, 13, 14);
        Stream<Integer> filteredIntegerStream = integerStream.filter(i -> {
            System.out.println("Filtering even numbers");
            return i % 2 == 0;
        });
        System.out.println("Count = "+filteredIntegerStream.count());

        Map<Boolean, List<Car>> partitionedCars = cars.stream().collect(
            Collectors.partitioningBy(car -> car.type.equals("sedan"))
        );

        System.out.println("partitioned cars "+partitionedCars);

        Map<Object, Map<Object, Object>> groupedCars = cars.stream().collect(
            Collectors.groupingBy(
                car -> car.type, 
                Collectors.toMap(car -> car.make, c-> c.engineCapacity)
            )
        );

        System.out.println("grouped cars "+groupedCars);
    } 
}

class Car {

    String type;
    String make;
    String model;
    Integer engineCapacity;

   Car(String type, String make, String model, Integer engineCapacity){
    this.type = type;
    this.make = make;
    this.model = model;
    this.engineCapacity = engineCapacity;
   }

   @Override
   public String toString() {
    return "Car[type="+this.type+", make="+this.make+", model="+this.model+", engineCapacity="+this.engineCapacity+"]";
   }
}
