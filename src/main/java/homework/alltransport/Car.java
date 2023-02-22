package homework.alltransport;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
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
