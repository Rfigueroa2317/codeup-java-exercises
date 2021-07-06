package Company;

public class TeamLead implements TimeSheets{


    @Override
    public void fillOutTimesheets() {
        System.out.println("Team Lead is filling out Timesheets.");
    }

    @Override
    public void firePeople(){
        System.out.println("You're fired! later!");
    }

}
