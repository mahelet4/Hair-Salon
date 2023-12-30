package Hairsalon.database.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerService {

    private Integer id; // Use Integer instead of int
    private String name;
    private String description;
    private Double price; // Use Double instead of double
}
