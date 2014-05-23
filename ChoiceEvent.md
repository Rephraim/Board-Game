public class ChoiceEvent extends BasicEvent() {
  private String choice1;
  private String choice2;
  private String choice3;
  
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
