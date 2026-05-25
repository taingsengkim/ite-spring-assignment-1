package co.istad.sengkim.itespringassigment1.assignment;

import lombok.Getter;
import lombok.Setter;import java.util.UUID;

@Setter
@Getter

public class Coffee {
    private String name;
    private UUID code;
    private Double price;
    private Boolean isAvailable;
}
