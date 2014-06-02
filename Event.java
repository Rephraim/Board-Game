public class Event {

  private String descrip;
  private int changeT;       //all the data of an event
  private int changeM;
  private int changeH;
  private int changeA;
  
  private Option choiceA;
  private Option choiceB;
  private Option choiceC;

  public Event(String title, Option c1, Option c2, Option c3) {
    descrip = title;
    choiceA = c1;
    choiceB = c2;
    choiceC = c3;
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
}
