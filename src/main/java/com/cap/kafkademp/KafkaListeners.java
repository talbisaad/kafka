package com.cap.kafkademp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

 @KafkaListener(topics = "FirstTopic", groupId = "groupID")
 void listener(String data){

     System.out.println("Listener received  : "+data + "!");

}

}
