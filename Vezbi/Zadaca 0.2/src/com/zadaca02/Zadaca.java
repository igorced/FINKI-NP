package com.zadaca02;

public class Zadaca {
    private String description;
    private int numOfMembers;
    private boolean status;

    Zadaca() {
        this.description = "";
        this.numOfMembers = 0;
        this.status = false;
    }
    Zadaca(String description, int numOfMembers, boolean status) {
        this.description = description;
        this.numOfMembers = numOfMembers;
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }
    public int getNumOfMembers() {
        return this.numOfMembers;
    }
    public boolean getStatus() {
        return this.status;
    }
}
