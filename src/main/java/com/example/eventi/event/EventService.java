package com.example.eventi.event;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        return List.of(new Event("futsal", "having fun", "house", "10", "https", "Cristian", "100"));
    }
}
