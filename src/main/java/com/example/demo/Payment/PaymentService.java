package com.example.demo.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    private final PaymentRepository  paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository){
        this.paymentRepository=paymentRepository;
    }


    public List<Payment> getPayments() {

        return paymentRepository.findAll();
    }




    public void addNewPayment(Payment payment) {

        Optional<Payment> paymentOptional= paymentRepository.findPaymentByEmail(payment.getEmail());

        if (paymentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        paymentRepository.save(payment);

        System.out.println(payment);

    }

    public void deletePayment(Long paymentId) {
        if(!paymentRepository.existsById(paymentId)) {

            throw new IllegalStateException(
                    "Payment with id "+paymentId +" doesn't exist");
        }
        paymentRepository.deleteById(paymentId);
    }


    public Payment getPaymentById(Long paymentId) {

        return paymentRepository.getById(paymentId);
    }
}

