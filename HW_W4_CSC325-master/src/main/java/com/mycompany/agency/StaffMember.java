package com.mycompany.agency;



// TODO 1: Make this class work and public
public abstract class StaffMember
{
    protected String name;
    protected String address;
    protected String phone;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    //-----------------------------------------------------------------
    // TODO 2: Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String str = "name" + name +
                "\naddress" + address +
                "\nphone" +  phone;

        return str;
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the pay method for each type of
    //  employee.
    //-----------------------------------------------------------------
    public abstract double pay();
}