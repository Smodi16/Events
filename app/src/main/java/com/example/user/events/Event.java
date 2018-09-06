package com.example.user.events;

public class Event {
    String name;
    String roomNo;
    String organizer;

    public Event() {

    }
    public Event(String name, String roomNo, String organizer) {
        this.name = name;
        this.roomNo = roomNo;
        this.organizer = organizer;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }
}
