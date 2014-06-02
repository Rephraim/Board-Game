public class Event {

  private String descrip;

  private Option choiceA;
  private Option choiceB;
  private Option choiceC;
  
  private boolean isRequired;

  public Event(String title, Option c1, Option c2, Option c3, boolean req) {
    descrip = title;
    choiceA = c1;
    choiceB = c2;
    choiceC = c3;
    isRequired = req;
  }
  
  public String getDescrip() {
    return descrip;
  }

  public Option getChoiceA() {
    return choiceA;
  }

  public Option getChoiceB() {
    return choiceB;
  }
  
  public Option getChoiceC() {
    return choiceC;
  }
  
  public boolean getRequirement() {
    return isRequired;
  }
}
