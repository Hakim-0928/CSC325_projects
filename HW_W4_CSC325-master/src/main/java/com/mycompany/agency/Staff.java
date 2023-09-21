package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.


    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("John Doe", "123 Main St.", "555-555-5555", "123-45-6789", 10000.0);
        staffList[1] = new StaffEmployee("Jane Smith", "456 Elm St.", "555-555-5555", "987-65-4321", 20.00);
        staffList[2] = new StaffEmployee("Bob Johnson", "789 Oak St.", "555-555-5555", "543-21-6789", 20.00);
        staffList[3] = new TempEmploee("Alice Brown", "321 Pine St.", "555-555-5555", "876-54-3210", 10.0);
        staffList[4] = new StaffEmployee("Charlie Davis", "987 Cedar St.", "555-555-5555", "234-56-7890", 20.00);
        staffList[5] = new TempEmploee("Eve Wilson", "654 Birch St.", "555-555-5555", "789-01-2345", 8.0);

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}