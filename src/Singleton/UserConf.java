package Singleton;

// Klasa wykorzystująca wzorzec Singleton. Przechowuje ona dane użytkownika i jego ustawienia.

public class UserConf {
    private static UserConf instance;
    private String name, vorname;
    private boolean ascendingOrder;

    private UserConf(){
        setName("Krystian");
        setVorname("Wielichowski");
        setAscendingOrder(true);
    }

    public static UserConf getInstance() {
        if(instance==null){
            instance = new UserConf();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public boolean isAscendingOrder() {
        return ascendingOrder;
    }

    public void setAscendingOrder(boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }
}
