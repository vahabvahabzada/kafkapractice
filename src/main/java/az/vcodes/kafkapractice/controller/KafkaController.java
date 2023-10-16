package az.vcodes.kafkapractice.controller;

import az.vcodes.kafkapractice.kafka.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final Producer producer;

    public KafkaController(final Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/add-car")
    public String sendItem(@RequestBody String item) {
        producer.sendMessage("cars", item);
        return "Message sent: " + item;
    }

    @PostMapping("/add-phone")
    public String sendPhone(@RequestBody String item) {
        producer.sendMessage("phones", item);
        return "Message sent: " + item;
    }
}
