package com.example.emengencyservice.pojo;

public class EventReplyByAdminitem {

    private String EventReplyByAdminid;
    private String EventReplyByAdminName;
    private String EventReplyByAdminstatus;
    private String EventReplyByAdmindesc;


    public EventReplyByAdminitem(String eventReplyByAdminid, String eventReplyByAdminName, String eventReplyByAdminstatus,String eventReplyByAdmindesc) {
        EventReplyByAdminid = eventReplyByAdminid;
        EventReplyByAdminName = eventReplyByAdminName;
        EventReplyByAdminstatus = eventReplyByAdminstatus;
        EventReplyByAdmindesc = eventReplyByAdmindesc;
    }

    public String getEventReplyByAdminid() {
        return EventReplyByAdminid;
    }

    public void setEventReplyByAdminid(String eventReplyByAdminid) {
        EventReplyByAdminid = eventReplyByAdminid;
    }

    public String getEventReplyByAdminName() {
        return EventReplyByAdminName;
    }

    public void setEventReplyByAdminName(String eventReplyByAdminName) {
        EventReplyByAdminName = eventReplyByAdminName;
    }

    public String getEventReplyByAdminstatus() {
        return EventReplyByAdminstatus;
    }

    public void setEventReplyByAdminstatus(String eventReplyByAdminstatus) {
        EventReplyByAdminstatus = eventReplyByAdminstatus;
    }

    public String getEventReplyByAdmindesc() {
        return EventReplyByAdmindesc;
    }

    public void setEventReplyByAdmindesc(String eventReplyByAdmindesc) {
        EventReplyByAdmindesc = eventReplyByAdmindesc;
    }
}
