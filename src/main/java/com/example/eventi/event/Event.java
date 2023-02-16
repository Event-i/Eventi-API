package com.example.eventi.event;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "event")
public class Event {

    @Id
//    @SequenceGenerator(name = "event_sequence", sequenceName = "event_sequence", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_sequence")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long event_id;
    private String name;
    private String description;
    private String location;
    private int attending;
    private String image;
    private String created_by;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "CURRENT_TIMESTAMP")
    private Date created_at;


    public Event () {

    }
    public Event(Long event_id, String name, String description, String location, int attending, String image, String created_by, Date created_at) {
        this.event_id = event_id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.attending = attending;
        this.image = image;
        this.created_by = created_by;
        this.created_at = created_at;
    }

    public Long getId() {
        return event_id;
    }

    public void setId(Long event_id) {
        this.event_id = event_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAttending() {
        return attending;
    }

    public void setAttending(int attending) {
        this.attending = attending;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date  getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date  created_at) {
        this.created_at = created_at;
    }
}
