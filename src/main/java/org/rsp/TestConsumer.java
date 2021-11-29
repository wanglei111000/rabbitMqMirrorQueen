package org.rsp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestConsumer {
    @RabbitListener(queues = "spring-queue")
    public void test(Message message){
        log.info("收到下消息:"+message);
    }

    @RabbitListener(queues = "QUEUE_A")
    public void test2(String content){
        log.info("收到下消息:"+content);
    }
}
