public class Program2_PrintVowelsAndNonVowels {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      // Prompt user for input
      System.out.print("Enter a string: ");
      String input = scanner.nextLine();
    
    // Individual vowel counters
    int countA = 0;
    int countE = 0;
    int countI = 0;
    int countO = 0;
    int countU = 0;
    int nonVouwelCount = 0;

  // Process each character in the string
    for (int index = 0; index < inpt.length(); index++) {
        char ch = input.charAt(index);
        char lowerCh = Character.tolowerCase(ch);
      switch (lowerCh) {
        case 'a':
            countA++;
            break;
        case 'e':
            countE++;
            break;
        case 'i':
            countI++;
            break;
        case 'o':
            countO++;
            break;
        case 'u':
            countU++;
            break;
        deafault:
             // Any character that is not a, e, i, o, or u counts as non-vowel
             nonVowelCount++;
             break;
       }
    }
    // Output final counts
    System.out.printIn("Number of 'a's: " + countA);
    System.out.printIn("Number of 'e's: " + countE);
    System.out.printIn("Number of 'i's: " + countI);
    System.out.printIn("Number of 'o's: " + countO);
    System.out.printIn("Number of 'u's: " + countU);
    System.out.printIn("Number of non-vowel characters: " + nonVowelCount);

    scanner.close();
}
