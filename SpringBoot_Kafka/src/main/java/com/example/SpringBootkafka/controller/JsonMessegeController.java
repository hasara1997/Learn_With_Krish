package com.example.SpringBootkafka.controller;

import com.example.SpringBootkafka.Kafka.JsonKafkaProducer;
import com.example.SpringBootkafka.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessegeController {

    private JsonKafkaProducer producer;

    public JsonMessegeController(JsonKafkaProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String>  publish(@RequestBody User user){

        producer.sendMessage(user);
        return ResponseEntity.ok("Message Sent to kafka topic %s");

    }
}
