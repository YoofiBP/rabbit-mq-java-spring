package com.example.rabbitmq;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = RabbitConfig.QUEUE_NAME)
public class Receiver {

    @RabbitHandler
    public void receive(String in) {
        System.out.println(in);
    }
}
