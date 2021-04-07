package com.example.emengencyservice.pojo;

public class ComplainReplyByAdminItem {

    private String ComplainRepiyByAdminid;
    private String ComplainRepiyByAdminName;
    private String ComplainRepiyByAdmindesc;

    public ComplainReplyByAdminItem(String complainRepiyByAdminid, String complainRepiyByAdminName, String complainRepiyByAdmindesc) {
        ComplainRepiyByAdminid = complainRepiyByAdminid;
        ComplainRepiyByAdminName = complainRepiyByAdminName;
        ComplainRepiyByAdmindesc = complainRepiyByAdmindesc;
    }

    public String getComplainRepiyByAdminid() {
        return ComplainRepiyByAdminid;
    }

    public void setComplainRepiyByAdminid(String complainRepiyByAdminid) {
        ComplainRepiyByAdminid = complainRepiyByAdminid;
    }

    public String getComplainRepiyByAdminName() {
        return ComplainRepiyByAdminName;
    }

    public void setComplainRepiyByAdminName(String complainRepiyByAdminName) {
        ComplainRepiyByAdminName = complainRepiyByAdminName;
    }

    public String getComplainRepiyByAdmindesc() {
        return ComplainRepiyByAdmindesc;
    }

    public void setComplainRepiyByAdmindesc(String complainRepiyByAdmindesc) {
        ComplainRepiyByAdmindesc = complainRepiyByAdmindesc;
    }
}
