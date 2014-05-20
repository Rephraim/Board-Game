public class ChoiceEvent extends BasicEvent() {
  public String choice1;
  public String choice2;
  public String choice3;
  
  public ChoiceEvent (String c1, String c2, String c3) {
    choice1 = c1;
    choice2 = c2;
    choice3 = c3;
  }
  
  public String getChoice1() {
    return choice1;
  }
  
  public String getChoice2() {
    return choice2;
  }
  
  public String getChoice3() {
    return choice3;
  }
}
