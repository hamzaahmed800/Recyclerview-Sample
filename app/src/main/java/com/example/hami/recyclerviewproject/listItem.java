package com.example.hami.recyclerviewproject;



public class listItem {

    private String head;
    private String realname;
    private String team;
    private String firstapp;
    private String credit;
    private String publish;
    private String url;
    private String bio;




    public listItem(String head, String realname, String team, String firstapp, String credit, String publish, String bio, String url ) {
        this.head = head;
        this.realname = realname;
        this.team = team;
        this.firstapp = firstapp;
        this.credit = credit;
        this.publish = publish;
        this.bio = bio;

        this.url = url;

    }

    public String getHead() {
        return head;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstapp() {
        return firstapp;
    }

    public String getCredit() {
        return credit;
    }

    public String getPublish() {
        return publish;
    }

    public String getBio() {
        return bio;
    }

    public String getUrl() {
        return url;
    }
}
