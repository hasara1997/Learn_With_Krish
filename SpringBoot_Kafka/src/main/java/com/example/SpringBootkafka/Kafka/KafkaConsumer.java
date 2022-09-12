package com.example.SpringBootkafka.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "KrishTrain", groupId = "myGroup")
    public void consume(String messege){

        LOGGER.info(String.format("Messege received --> %s",messege));

    }


}
