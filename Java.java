package com. study1;

import static jdk.tools.jlink.internal.plugins.PluginsResourceBundle.getDescription;

public class Daily extends Appointment{

    public Daily(String desc, int day, int mon, int year) {

// TODO Auto-generated constructor stub

        super(desc, day, mon, year);

    }

    public void occursOn(int day, int mon, int year)

    {

        System. out. println(getDescription() + " is fixed");

    }

    public boolean getDescription() {
        return description;
    }

    public void setDescription(boolean description) {
        this.description = description;
    }
}  