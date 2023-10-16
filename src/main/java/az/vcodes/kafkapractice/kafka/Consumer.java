package az.vcodes.kafkapractice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics = "cars", groupId = "my-consumers")
    public void carListener(String message) {
        System.out.println("Received message: Car --> " + message);
    }

    @KafkaListener(topics = "phones", groupId = "my-consumers")
    public void phoneListener(String message) {
        System.out.println("Received message: Mobile --> " + message);
    }
}
