package homework.config;

import homework.alltransport.Car;
import homework.alltransport.Person;
import homework.alltransport.Transport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Transport newTransport() {
        return new Car();
    }
    @Bean
    public Person newPerson() {
        return new Person(newTransport());
    }
    /*
    @Configuration
    @ComponentScan(basePackages = "homework")
    public class Config {}

}
     */
}
