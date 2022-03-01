package com.company;

public class Main {

  public int numericValue(char letter) {
    if (letter == ' ') {
      int num = 0;
      return num;
    } else {
      int num = Character.getNumericValue(letter) - 9;  //Den numeriske værdi af A er 10, derfor -9 for at få 1.
      return num;
    }
  }

  public int numericValue2(char c) {
    if (c == ' ') {
      int num = 0;
      return num;
    } else {
      int num = c - 'A' + 1;    //A har her værdien 68. Derfor trækkes A fra hver gang, og der plusses med 1 for at få den rigtige værdi.
      return num;
    }
  }

  public char returnLetter(int letter) {
    if (letter == 0) {
      return ' ';
    } else
      letter += 'A' - 1;
    char b = (char) letter;
    return b;
  }

  public static void main(String[] args) {
    Main obj = new Main();
    char letter = 'A';
    char c = 'A';
    int numLetter = 3;

    obj.numericValue(letter);
    obj.numericValue2(c);
    System.out.println(obj.returnLetter(numLetter));
  }
}
