package co.istad.sengkim.itespringassigment1.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class CoffeeController {
    private final MyCoffeeBean myCoffeeBean;
    public CoffeeController(MyCoffeeBean myCoffeeBean){
        this.myCoffeeBean = myCoffeeBean;
    }
    @GetMapping("/coffees")
    public Map<String,Object> getCoffees(){
        return Map.of("coffees",myCoffeeBean.allBeans());
    }
}
