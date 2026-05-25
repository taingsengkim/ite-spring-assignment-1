package co.istad.sengkim.itespringassigment1.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.UUID;

@Configuration
public class MyCoffeeBean {
    @Bean
    public List<Coffee> allBeans(List<Coffee> beans){
        return beans;
    }

    @Bean
        public Coffee iceLatte(){
        Coffee coffee = new Coffee();
        coffee.setName("Ice Latte");
        coffee.setCode(UUID.randomUUID());
        coffee.setPrice(1.25);
        coffee.setIsAvailable(true);
        return coffee;
    }
    @Bean
    public Coffee vnCoffee(){
        Coffee coffee = new Coffee();
        coffee.setName("Vietnam Coffee");
        coffee.setCode(UUID.randomUUID());
        coffee.setPrice(0.5);
        coffee.setIsAvailable(true);
        return coffee;
    }
    @Bean
    public Coffee mochaCoffee(){
        Coffee coffee = new Coffee();
        coffee.setName("Mocha Coffee");
        coffee.setCode(UUID.randomUUID());
        coffee.setPrice(2.5);
        coffee.setIsAvailable(true);
        return coffee;
    }

}
