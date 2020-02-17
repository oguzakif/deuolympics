package deuolympics;

public class athlete {
private String country;
private String sport;
private String name;
private char gender;
private date birthdate;
private double skill;
private int score;

    public athlete(String incountry,String insport,String inname,char ingender,date inbirthdate,double inskill,int inscore) {
        country = incountry;
        sport = insport;
        name= inname;
        gender = ingender;
        birthdate = inbirthdate;
        skill = inskill;
        score = inscore;
    }

}