package com.example.SpringBootkafka.Kafka;

import com.example.SpringBootkafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaProducer.class);

    private KafkaTemplate<String, User> kafkaTemplate;


    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate1) {
        this.kafkaTemplate = kafkaTemplate1;
    }

   public void sendMessage(User data){

        LOGGER.info(String.format("Kafka Message Send --> %s",data.toString()));

       Message<User> message= MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC,"KrishTrain_json").build();

       kafkaTemplate.send(message);
   }

}
