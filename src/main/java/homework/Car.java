package homework;

public class Car implements Transport{
    public void go() {
        System.out.println("Автомобиль едет");
    }
    public void init() {
        System.out.println("Class Car: init");
    }
    public void destroy () {
        System.out.println("Class Car: destroy");

    }
}
