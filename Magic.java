// Coded by Jared Smith
// Class to keep track of Magic the Gathering Cards
// 2/14/15

public class Magic {
  public String cardName;
  public String setName;
  public String manaCost;
  public String type;

// Data is above this line
// ----------------------------------------------
// Behavior is below this line

// Zero parameter Constructor
  Magic() {
    cardName = "No card given";
    setName = "No set given";
    manaCost = "No mana cost given";
    type = "No type given";
   }

// Common case constructor which has all four items
  Magic(String thisCardName, String thisSetName, String thisManaCost, String thisType) {
    cardName = thisCardName;
    setName = thisSetName;
    manaCost = thisManaCost;
    type = thisType;
   }

// One parameter constructor
  Magic(String thisCardName) {
     this();
     cardName = thisCardName;
    }

  public String toString() {
    String output = "";
    output = "Card name: " + cardName + ". Set name: " + setName + ". Mana Cost: " + manaCost + ". Type: " + type;
    return output;
   }
}
