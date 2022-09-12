package com.example.SpringBootkafka.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate1) {
        this.kafkaTemplate = kafkaTemplate1;
    }

    public void send(String message){
        LOGGER.info(String.format("Message sent %s",message));
        kafkaTemplate.send("KrishTrain",message);
    }
}
