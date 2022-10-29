package com. study1;

public class OneTime extends Appointment{

    public OneTime(String desc, int day, int mon, int year) {

// TODO Auto-generated constructor stub

        super(desc, day, mon, year);

    }

    public void occursOn(int day, int mon, int year)

    {

        if(getDay()==day && getMon()==mon && getYear()==year) {

            System. out. println(getDescription() + " is fixed");

        }

    }

    private int getDay() {
    }