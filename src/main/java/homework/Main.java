package homework;

import homework.alltransport.*;
import homework.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Transport transport = context.getBean("customTransport",Transport.class);
        transport.go();
        Person person = context.getBean("customPerson", Person.class);
        person.sit();
        person.go();
        Bus bus1 = context.getBean("customBus", Bus.class);
        Bus bus2 = context.getBean("customBus", Bus.class);
        bus1.setPerson(person);
        System.out.println(bus2 == bus1);

        Truck truck1 = context.getBean("customTruck", Truck.class);
        Truck truck2 = context.getBean("customTruck", Truck.class);
        System.out.println(truck2 == truck1);

        truck1.setPerson(person);

        context.close();

        System.out.println("==========================================");

        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Moto moto = context2.getBean("moto", Moto.class);
        Moto moto1 = context2.getBean("moto", Moto.class);
        moto.go();
        Person person1 = context2.getBean("person", Person.class);
        person1.sit();
        Car car = context2.getBean("car", Car.class);
        Car car1 = context2.getBean("car", Car.class);
        car.go();
        System.out.println(car1==car);
        System.out.println(moto1==moto);
        context2.close();

        System.out.println("================================================");

        AnnotationConfigApplicationContext context3 =
                new AnnotationConfigApplicationContext(Config.class);

        Person person2 = context3.getBean("newPerson", Person.class);
        person.sit();
        context3.close();


    }
}
