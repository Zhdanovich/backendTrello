package com.example;

public enum TicketStatus {

    NEW("new"),
    PROGRESS("in progress"),
    DONE("done"),
    DECLINED("declined");

    private String text;

    TicketStatus(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
