package com.lenient.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        SpeakerService speakerService = new SpeakerService();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = context.getBean(SpeakerService.class);
        Speaker[] speakers = speakerService.getSpeakers();
        
        for (Speaker speaker : speakers) {
            if (speaker != null) {
                System.out.println("Speaker: " + speaker.getFirstname() + " " + speaker.getLastname());
            }
        }
    }
}
