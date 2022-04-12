package com.example.demo.Payment;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/payment")
public class PaymentController {

    private final PaymentService paymentService;

     List<String> text;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }

    @GetMapping
    public List<Payment> getPayments(){
        return paymentService.getPayments();

    }



    @PostMapping
    @ResponseBody
    public ResponseTransfer registerAnewPayment(@RequestBody Payment payment){
        paymentService.addNewPayment(payment);

        return  new ResponseTransfer(payment.toString());

    }

    @DeleteMapping(path = "{paymentId}")
    public ResponseTransfer delelePayment(@PathVariable ("paymentId") Long paymentId) {
        paymentService.deletePayment(paymentId);

        return new ResponseTransfer("payment deleted with id= "+paymentId);

    }

    @GetMapping(path = "{paymentId}")
    public Payment getPaymenetById(@PathVariable("paymentId") Long paymentId){
        return  paymentService.getPaymentById(paymentId);


    }






}
