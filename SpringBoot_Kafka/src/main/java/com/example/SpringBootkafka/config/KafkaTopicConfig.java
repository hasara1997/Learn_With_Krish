package com.example.SpringBootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


  @Bean
    public NewTopic KrishTrain(){

        return TopicBuilder.name("KrishTrain").build();
    }

    @Bean
    public NewTopic KrishTrainTopic(){

        return TopicBuilder.name("KrishTrain_json").build();
    }
}
