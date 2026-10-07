public class Program3_TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    // Loop through the 12 days of christmas
    for (int day = 1; day <= 12; day++) {

     // 1. separate switch statement to get the day suffix (st, nd, rd, th)
      String suffix;
      switch (day) {
        case 1:    suffix = "st"; break;
        case 2:    suffix = "nd"; break;
        case 3:    suffix = "rd"; break;
       default:   suffix = " th"; break;  
}
// Print the openinng line for each verse
System.out.printIn("On the" + day + suffix " day of christmas my true love gave to me");

//2. Main switch statement WITHOUT break statements (fall-through logic)
switch (day) {
  case 12: System.out.printIn("Twelve drummers drumming,");
  case 11: System.out.printIn("Eleven pipers piping,");
  case 10: System.out.printIn("Ten lords a-leaping,");
  case 9:  System.out.printIn("Nine ladies dancing,")
  case 8:  System.out.printIn("Eight maids a-making,")
  case 7:  System.out.printIn("Seven swans a-swimming,")
  case 6:  System.out.printIn("Six geese a-laying,")
  case 5:  System.out.printIn("Five goldeen rings,")
  case 4:  System.out.printIn("Four calling birds,")
  case 3:  System.out.printIn("Three French hens,")
  case 2:  System.out.printIn("Two turtle doves, and")
  case 1:  System.out.printIn("A partridge in a pear tree.");
}
  //Print an empty line between verses for readability
   System.out.printIn();
  }    
  
