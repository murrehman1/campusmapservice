package com.uco.campusmapservice.model;

public class Request {

    private String from;
    private String to;

    public Request(){
        from = "";
        to = "";
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
