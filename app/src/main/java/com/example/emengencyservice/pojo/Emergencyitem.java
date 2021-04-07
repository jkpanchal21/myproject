package com.example.emengencyservice.pojo;

public class Emergencyitem {
    private String EmId;
    private String EmName;
    private String EmNumber;

    public Emergencyitem(String emId, String emName, String emNumber) {
        EmId = emId;
        EmName = emName;
        EmNumber = emNumber;
    }

    public String getEmId() {
        return EmId;
    }

    public void setEmId(String emId) {
        EmId = emId;
    }

    public String getEmName() {
        return EmName;
    }

    public void setEmName(String emName) {
        EmName = emName;
    }

    public String getEmNumber() {
        return EmNumber;
    }

    public void setEmNumber(String emNumber) {
        EmNumber = emNumber;
    }
}
