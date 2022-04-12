package com.example.demo.Payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {

    @Query("SELECT s FROM Payment s WHERE s.email =?1")
    Optional<Payment> findPaymentByEmail(String email);

    @Query("SELECT s FROM Payment s WHERE s.id =?1")
    Optional<Payment> findById(Long id);





}
