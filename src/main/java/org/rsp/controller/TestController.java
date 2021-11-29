package org.rsp.controller;

import org.rsp.producer.MsgProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Desc: TODO
 * @Version: 1.0
 * @Modified By:
 */
@RestController
public class TestController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private MsgProducer producer;

    @ResponseBody
    @RequestMapping("/test")
    public void test() {
        for (int i = 0; i < 3; i++) {
            rabbitTemplate.convertAndSend("spring-exchange", "spring.routingkey", "hello"+i);
        }
    }

    @ResponseBody
    @RequestMapping("/test2")
    public void test2() {
        for (int i = 0; i < 3; i++) {
            producer.sendMsg("hhha");
        }
    }

}