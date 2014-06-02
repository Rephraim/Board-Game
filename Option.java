public class Option {
  
  private String descrip;
  private String statchanges;
  
  private int changeT;
  private int changeM;
  private int changeH;
  private int changeA;
  
  public Option (String desc, String changes, int cT, int cM, int cH, int cA) {
    descrip = details;
    statchanges = changes;
    changeT = cT;
    changeM = cM;
    changeH = cH;
    changeA = cA;
  }
  
  public String getDescrip() {
    return descrip;
  }
   
   public String getStatChanges() {
    return statchanges;
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
