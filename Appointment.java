package com.study1;

public class Appointment {

    private String description;

    private int day;

    private int mon;

    private int year;

    public Appointment(String desc, int day, int mon, int year)

    {

        description=desc;

        this.day=day;

        this.mon=mon;

        this.year=year;

    }

    public void occursOn(int day,int mon, int year)

    {

    }

    /**

     * "at"return the description

     */

    public String getDescription() {

        return description;

    }

    /**

     * "at"param description the description to set

     */

    public void setDescription(String description) {

        this. description = description;

    }

    /**

     * "at"return the day

     */

    public int getDay() {

        return day;

    }

    /**

     * "at"param day the day to set

     */

    public void setDay(int day) {

        this. day = day;

    }

    /**

     * "at"return the mon

     */

    public int getMon() {

        return mon;

    }

    /**

     * "at"param mon the mon to set

     */

    public void setMon(int mon) {

        this. mon = mon;

    }

    /**

     * "at"return the year

     */

    public int getYear() {

        return year;

    }

    /**

     * "at"param year the year to set

     */

    public void setYear(int year) {

        this. year = year;

    }

}