
package com. study1;

public class Monthly extends Appointment{

    public Monthly(String desc, int day, int mon, int year) {

// TODO Auto-generated constructor stub

        super(desc, day, mon, year);

    }

    public void occursOn(int day, int mon, int year)

    {

        if(getDay()==day) {

            System. out. println(getDescription() + " is fixed");

        }

    }

}

