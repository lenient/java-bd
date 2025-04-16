package com.lenient.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.lenient.demo")
public class AppConfig {

//    @Bean
//    public SpeakerService getSpeakerService(SpeakerRepositoryInterface speakerRepository) {
//        SpeakerService speakerService = new SpeakerService(speakerRepository);
////        speakerService.setSpeakerRepository(getSpeakerRepository());
//        return speakerService;
//    }
//
//    @Bean
//    public SpeakerRepositoryInterface getSpeakerRepository() {
//        return new SpeakerRepository();
//    }
}
