//package org.rsp.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.core.*;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.amqp.rabbit.core.RabbitAdmin;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @ClassName: RabbitConfig
// * @Desc: 采用的是 springboot 自带的 rabbitmq ，自动加载配置文件
// * 内容进行初始化
// * @Date:
// * @Version: 1.0
// * @Modified By:
// */
//@Configuration
//@Slf4j
//public class RabbitConfig {
//    public static final String DIRECTEXCHANGE="spring-exchange";
//    public static final String DIRECTQUEUE="spring-queue";
//
//    @Bean
//    public DirectExchange directExchange(){
//        return new DirectExchange(DIRECTEXCHANGE,true,false);
//    }
//
//    @Bean
//    public Queue queue() {
//        return QueueBuilder.durable(DIRECTQUEUE).build();
//    }
//
//    @Bean
//    public Binding binding() {
//        return BindingBuilder.bind(queue()).to(directExchange()).with("spring.routingkey");
//    }
//
//}