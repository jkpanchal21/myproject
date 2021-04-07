package com.example.emengencyservice.pojo;

public class Eventitem {
   private String Evid;
   private String EvName;
   private String Evdesc;

    public Eventitem(String evid, String evName, String evdesc) {
        Evid = evid;
        EvName = evName;
        Evdesc = evdesc;
    }

    public String getEvid() {
        return Evid;
    }

    public void setEvid(String evid) {
        Evid = evid;
    }

    public String getEvName() {
        return EvName;
    }

    public void setEvName(String evName) {
        EvName = evName;
    }

    public String getEvdesc() {
        return Evdesc;
    }

    public void setEvdesc(String evdesc) {
        Evdesc = evdesc;
    }
}
