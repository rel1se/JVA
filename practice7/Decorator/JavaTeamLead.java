package practice7.Decorator;

public class JavaTeamLead extends DeveloperDecorator
{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String sendWeekReport(){
        return "Sending week report... ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
