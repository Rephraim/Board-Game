public class BasicEvent {
  private String descrip;
  private int changeT;       //all the data of an event
  private int changeM;
  private int changeH;
  private int changeA;

  public Event(String title, int t, int m, int h, int a) {
    descrip = title;
    changeT = t;
    changeM = m;
    changeH = h;
    changeA = a;
  }
  
  public String getDescrip() {
    returns descrip;
  }
  
  public int getChangeT() {
    return changeT;
  }
  
  public int getChangeM() {
    return changeM;
  }
  
  public int getChangeH() {
    return changeH;
  }
  
  public int getChangeA() {
    return changeA;
  }
}
