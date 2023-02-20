package homework;

public class Person {
    private Car car;

    public Person(Car car) {
        this.car = car;
    }


    public void sit() {
        System.out.println("Владелец сел в автомобиль");
    }
    public void go() {
        System.out.println("Автомобиль едет");
    }
}
