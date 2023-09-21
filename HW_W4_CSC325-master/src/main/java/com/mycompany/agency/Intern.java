package com.mycompany.agency;



// TODO 1: Make Intern a child of StaffEmployee

public class Intern extends StaffEmployee
{
    //-----------------------------------------------------------------
    //  TODO 2: Constructor: Sets up this intern using the specified
    //  information.
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone,String socSec, double rate)
    {

        super(eName, eAddress, ePhone, socSec, rate);
    }

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern.
    //-----------------------------------------------------------------
    @Override
    public double pay()
    {
        return 0; //Richard
    }
}
