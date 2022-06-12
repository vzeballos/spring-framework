package com.cydeo.repository;

import com.cydeo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

    //method --> sql = derive query eg. findById(int id) = select * from payment where id = x
    //sql - @Query
    //JPQL -@Query

}
