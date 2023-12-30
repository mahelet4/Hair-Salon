package Hairsalon.database.dao;

import Hairsalon.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {

    public Customer findById(Integer id);

    @Query("SELECT c FROM Customer c WHERE c.firstName LIKE :firstName or c.lastName LIKE :lastName")
    List<Customer> findByFirstNameOrLastName(String firstName, String lastName);

    @Query("SELECT c FROM Customer c WHERE c.user.id = :userId")
    List<Customer> findByUserId(Integer userId);



}
