package com.example.emengencyservice.pojo;

public class Noticeitem {
    private String Noid;
    private String NoName;
    private String Nodesc;

    public Noticeitem(String noid, String noName, String nodesc) {
        Noid = noid;
        NoName = noName;
        Nodesc = nodesc;
    }

    public String getNoid()
    {
        return Noid;
    }

    public void setNoid(String noid)
    {
        Noid = Noid;
    }

    public String getNoName() {

        return NoName;
    }

    public void setNoName(String noName) {

        NoName = noName;
    }

    public String getNodesc() {

        return Nodesc;
    }

    public void setNodesc(String nodesc) {

        Nodesc = nodesc;
    }
}
