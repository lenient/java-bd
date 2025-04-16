package com.lenient.demo;

import org.springframework.stereotype.Service;

@Service
public class SpeakerRepository implements SpeakerRepositoryInterface {
    
    private Speaker[] speakers = new Speaker[10];
    private int count = 0;

    public void addSpeaker(Speaker speaker) {
        if (count < speakers.length) {
            speakers[count] = speaker;
            count++;
        } else {
            System.out.println("Speaker repository is full");
        }
    }

    @Override
    public Speaker[] getSpeakers() {
        addSpeaker(new Speaker("first", "last"));
        return speakers;
    }

    public int getCount() {
        return count;
    }
}
