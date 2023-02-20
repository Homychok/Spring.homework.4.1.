package homework;

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


    }
}
