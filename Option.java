public class Option {
  
  private String descrip;
  private String statchanges;
  
  private int changeT; //change in tardies
  private int changeM; //change in money
  private int changeH; //change in happiness
  private int changeA; //change in academics
  
  public Option (String desc, String changes, int cT, int cM, int cH, int cA) {
    descrip = desc;
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
