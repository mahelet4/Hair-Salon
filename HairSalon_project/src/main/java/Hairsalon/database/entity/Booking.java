package Hairsalon.database.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Booking {

    private int id;
    private String customerName;
    private String service;
    private Date date;
    private String status;
}
