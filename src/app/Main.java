package app;

//Klasa do testów

import Singleton.UserConf;
import builders.CarBuilder;
import builders.TeslaModel3;
import builders.TeslaModelS;
import directors.CarDealershipDirector;
import entities.Car;

public class Main {
    public static void main(String[] args) {
        /*
        Test klasy wykorzystującej wzorzec Singleton.
        Spróbujemy stworzyć konfigurację 2 użtkowników.
        Po takim działaniu obie referencje powinny wskazywać na ten sam obiekt.
         */
        UserConf user1 = UserConf.getInstance();
        UserConf user2 = UserConf.getInstance();

        System.out.println("Laboratorium 4\n Test klasy wykorzystującej wzorzec Singleton\n" +
                "user1 == user2: " + (user1 == user2));


        /*
        Test klas wykorzystujących wzorzec Builder
         */
        CarDealershipDirector director = new CarDealershipDirector();
        CarBuilder carBuilderModelS = new TeslaModelS();

        director.setCarBuilder(carBuilderModelS);
        director.constructCar();

        Car car = director.getCar();

        System.out.println("\nTest klas wykorzystujących wzorzec Builder\nUtworzony samochód: " + car);
    }
}
