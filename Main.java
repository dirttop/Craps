//dilan leon and gleb syomichev

class Main {

  public static void main(String[] args) {
    int win = 0;
    int loss = 0;
    int fourwin = 0;
    int fivewin = 0;
    int sixwin = 0;
    int eightwin = 0;
    int ninewin = 0;
    int tenwin = 0;
    
    for (int i = 0; i < 100000; i++){
      int roll1 = roll();
        //round 1
      if (roll1 == 7 || roll1 == 11) {
        win += 1;
      }
      else if (roll1 == 2 || roll1 == 3 || roll1 == 12) {
        loss += 1;
      }
      else {
        //round 2
        int roll2 = 0;
        while (roll2 != 7){
          roll2 = roll();
          if (roll2 == roll1){
            win += 1;
            if (roll1 == 4) {
              fourwin += 1;
              }
            if (roll1 == 5) {
              fivewin += 1;
              }
            if (roll1 == 6) {
              sixwin += 1;
              }
            if (roll1 == 8) {
              eightwin += 1;
              }
            if (roll1 == 9) {
              ninewin += 1;
              }
            if (roll1 == 10) {
              tenwin += 1;
              }
            
            break;
            }
          else if (roll2 == 7) {
            loss += 1;
            break;
            }
          }  
        }
      }
    double percentwin = win/100000.0;
    double percentloss = loss/100000.0;
    System.out.println("Craps Statistics");
    System.out.println("================");
    System.out.println("Win: " + (percentwin*100) + "%");
    System.out.println("Loss: " + (percentloss*100) + "%");

    System.out.println("\nChance of winning with initial roll of 2: 0%");
    System.out.println("\nChance of winning with initial roll of 3: 0%");
    System.out.println("\nChance of winning with initial roll of 4: " + ((fourwin/100000.0))*100 + "%");
    System.out.println("\nChance of winning with initial roll of 5: " + ((fivewin/100000.0))*100 + "%");
    System.out.println("\nChance of winning with initial roll of 6: " + ((sixwin/100000.0))*100 + "%");
    System.out.println("\nChance of winning with initial roll of 7: 100%");
    System.out.println("\nChance of winning with initial roll of 8: " + ((eightwin/100000.0))*100 + "%");
    System.out.println("\nChance of winning with initial roll of 9: " + ((ninewin/100000.0))*100 + "%");
    System.out.println("\nChance of winning with initial roll of 10: " + ((tenwin/100000.0))*100 + "%");
    System.out.println("\nChance of winning with initial roll of 11: 100%");
    System.out.println("\nChance of winning with initial roll of 12: 0%");
  }

  //Hi Dr. Morgan, please ignore this bad code, I was desperate
  
  public static int roll(){
    int die1 = 1 + (int)(6 * Math.random());
    int die2 = 1 + (int)(6 * Math.random());
    int total = die1 + die2;
    //System.out.println(total);
    return(total);
  }
}