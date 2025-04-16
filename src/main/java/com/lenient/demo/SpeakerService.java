package com.lenient.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeakerService {
//    SpeakerRepositoryInterface speakerRepository = new SpeakerRepository();

    @Autowired
    SpeakerRepositoryInterface speakerRepository;

    public SpeakerService() {
        System.out.println("Constructor called");
    }

//    @Autowired
    public SpeakerService(SpeakerRepositoryInterface speakerRepository) {
        System.out.println("Constructor with speakerRepository called");
        this.speakerRepository = speakerRepository;
    }

    public Speaker[] getSpeakers() {
        return speakerRepository.getSpeakers();
    }

//    @Autowired
    public void setSpeakerRepository(SpeakerRepositoryInterface speakerRepository) {
        System.out.println("setSpeakerRepository called");
        this.speakerRepository = speakerRepository;
    }
}
