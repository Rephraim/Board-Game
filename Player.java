public class Player {
  private int tardies;
  private int money;
  private int happiness;
  private int academics;
  private String name;
  
  public Player (String name) {
    tardies = 0;
    money = 50;
    happiness = 50;       //takes name input, initializes variables to corrects values
    academics = 50;
    name = name;
  }

  public int getTardies() {       //returns # of tardies
    return tardies;
  }

  public int getMoney() {         //returns $$$ left
    return money;
  }
  
  public int getHappiness() {     //returns happiness
    return happiness;
  }
  
  public int getAcademics() {     //returns academics
    return academics;
  }
  
  public String getName() {       //returns name
    return name;
  }
  
  public void changeTardies(int change) {       //change the player's stats as they get events
    tardies += change;
  }
  
  public void changeMoney (int change) {
    money += change;
  }
  
  public void changeHappiness(int change) {
    happiness += change;
  }
  
  public void changeAcademics(int change) {
    academics += change;
  }
}
