package com.rifqimuhammadaziz.springkafka;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaListeners {

    @KafkaListener(
            topics = "xenosty",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }

}
