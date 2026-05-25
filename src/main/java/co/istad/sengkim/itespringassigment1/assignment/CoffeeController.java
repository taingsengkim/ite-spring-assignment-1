package co.istad.sengkim.itespringassigment1.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CoffeeController {
    private final MyCoffeeBean myCoffeeBean;
    private Coffee bean1;
    private  Coffee bean2;
    private  Coffee bean3;

    @Autowired
    public void setBean1(@Qualifier("iceLatte") Coffee bean1){
        this.bean1 = bean1;
    }
    @Autowired
    public void setBean2(@Qualifier("vnCoffee") Coffee bean2){
        this.bean2 = bean2;
    }
    @Autowired
    public void setBean3(@Qualifier("mochaCoffee") Coffee bean3){
        this.bean3 = bean3;
    }
    public CoffeeController(MyCoffeeBean myCoffeeBean
           ){
        this.myCoffeeBean = myCoffeeBean;
    }
    @GetMapping("/coffees")
    public Map<String,Object> getCoffees(){
        return Map.of("coffees",myCoffeeBean.allBeans(List.of(bean1,bean2,bean3)));
    }
}
