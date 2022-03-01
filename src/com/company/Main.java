package com.company;

import java.lang.reflect.Array;

public class Main {

  /*public int numericValue(char letter) {
    if (letter == ' ') {
      int num = 0;
      return num;
    } else {
      int num = Character.getNumericValue(letter) - 9;  //Den numeriske værdi af A er 10, derfor -9 for at få 1.
      return num;
    }
  }*/

  /*public Array charToString(String krypt){


    char[] ch = krypt.toCharArray();

    for (int i = 0; i < krypt.length(); i++) {
      ch[i] = krypt.charAt(i);
    }

  }*/

  public int getNumericValue(char c) {

    if (c == ' ') {
      int num = 0;
      return num;
    } else {
      int num = c - 'A' + 1;    //A har her værdien 65. Derfor trækkes A fra hver gang, og der plusses med 1 for at få den rigtige værdi.
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
    //char letter = 'A';
    char c = 'C';
    int numLetter = 3;
    String krypt = "Dette er en test";

    //obj.numericValue(letter);
    System.out.println(obj.getNumericValue(c));
    System.out.println(obj.returnLetter(numLetter));
    //System.out.println(obj.charToString(krypt));
  }
}
