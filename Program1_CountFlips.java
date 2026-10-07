public class Program1_CountFlips {
  public static void main(String[] args) {
      final int FLIPS = 100;
      int heads = 0;
      int tails = 0;
      // Create an instance of the Coin class provided in the repo
      Coin coin = new Coin();
      // Flip the coin 100 times
      for (int i = 0; i < FLIPS; i++) {
          coin.flip();
          if (coin.isHeads()) {
              heads++;
          } else {
              tails++;
          }
       }
       // Output results matching assignment format
       System.out.printIn("Heads: " + heads);
       System.out.printIn("Tails: " + tails);
