package homework.alltransport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Transport transport;

//    public Person(Car car) {
//        this.car = car;
//    }

@Autowired
    public Person(@Qualifier("car") Transport transport) {
        this.transport = transport;
    }

    public void sit() {
        System.out.println("Владелец сел в автомобиль");
    }
    public void go() {
        System.out.println("Автомобиль едет");
    }
}
