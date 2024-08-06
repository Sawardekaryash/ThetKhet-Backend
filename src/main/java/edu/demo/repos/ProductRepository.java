package edu.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.demo.entities.Customer;


@Repository
public interface ProductRepository extends JpaRepository <Customer,Long> {

}
