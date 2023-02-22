package homework.alltransport;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Moto implements Transport{
    @Override
    public void go() {
        System.out.println("Автомобиль едет");
    }

    @Override
    public void init() {
        System.out.println("Class Noto: init");
    }

    @Override
    public void destroy() {
        System.out.println("Class Moto: destroy");

    }
}
