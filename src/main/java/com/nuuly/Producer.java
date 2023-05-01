package com.nuuly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This is an example Producer that can publish a message to a topic.
 * An example of using this is as follows:
 *
 *      <pre>
 *      producer.sendMessage(
 *          topic = MY_TOPIC,
 *          key = key,
 *          value = value
 *     )
 *     </pre>
 */
@Service
public class Producer {
    private final KafkaProducerService<String> kafkaProducerService;

    private final String INVENTORY_TOPIC = "inventory_updates";

    @Autowired
    public Producer(KafkaProducerService<String> kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    public void sendInvetoryMessage(String key, String message) throws Exception {
        kafkaProducerService.sendMessage(INVENTORY_TOPIC, key, message);
    }
}
