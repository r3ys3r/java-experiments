class PezDispenser {
  //Setter property
  public static final int MAX_PEZ = 12;
  final private String characterName;
  private int pezCount;
  
  public PezDispenser(String characterName){
    this.characterName = characterName;
    pezCount = 0;
  }
  
  public boolean dispense(){
    boolean wasDispensed = false;
    if (!isEmpty()){
      pezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }
  
  public boolean isEmpty(){
    return pezCount == 0;
  }
  
  public void fill(){
	  fill(MAX_PEZ);
  }
  
  public void fill(int pezAmount){
	  pezCount += pezAmount;
  }
  
  
  
  //This is a getter property
  public String getCharacterName() {
    //returns the character name
    return characterName;
  
  }
  
}