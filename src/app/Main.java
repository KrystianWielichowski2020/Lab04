package app;

//Klasa do testów

import Singleton.UserConf;

public class Main {
    public static void main(String[] args) {
        /*
        Test klasy wykorzystującej wzorzec Singleton.
        Spróbujemy stworzyć konfigurację 2 użtkowników.
        Po takim działaniu obie referencje powinny wskazywać na ten sam obiekt.
         */
        UserConf user1 = UserConf.getInstance();
        UserConf user2 = UserConf.getInstance();

        System.out.println("user1 == user2: " + (user1 == user2));
    }
}
