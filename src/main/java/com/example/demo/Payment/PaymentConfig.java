package com.example.demo.Payment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class PaymentConfig {

    @Bean
    CommandLineRunner commandLineRunner(PaymentRepository repository){




        return args -> {
            List<Payment> ls=new ArrayList<>();
                  Payment p1 = new Payment( "BoFA", "a.b@com", LocalDate.of(2021, 12, 12), 36);
                  Payment p2 = new Payment( "Wells", "a.b@com", LocalDate.of(2022, 12, 12), 36);

                  ls.add(p1);
                  ls.add(p2);

                  repository.saveAll(ls);


        };



    }

    public static String method(String str){

        String answer="";

        for (int i = 0; i <str.length() ; i++) {

            int count=0;
            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }

            answer+=str.charAt(i)+""+count;
        }

        return answer;

    }
}
