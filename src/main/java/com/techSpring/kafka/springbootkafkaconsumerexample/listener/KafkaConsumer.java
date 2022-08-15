package com.techSpring.kafka.springbootkafkaconsumerexample.listener;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="kafka-Example",groupId="test-consumer-group")
    public void  consume(String message){

        System.out.println("Consumer Message---->"+ message);


    }
}
