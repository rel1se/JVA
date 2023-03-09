package practice7.Decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer){
        super(developer);
    }
    public String makeCodeReview(){
        return "Making code review... ";
    }
    public String makeJob(){
        return super.makeJob() + makeCodeReview();
    }
}
