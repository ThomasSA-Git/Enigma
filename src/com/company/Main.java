package com.company;

public class Main {

  public int numericValue(char letter) {
    if (letter == ' ') {
      int num = 0;
      return num;
    } else {
      int num = Character.getNumericValue(letter) - 9;
      return num;
    }
  }

  public int numericValue2(char c) {
    if (c == ' ') {
      int num = 0;
      return num;
    } else {
      int num = c - 'A' + 1;
      return num;
    }
  }


  public static void main(String[] args) {
    Main obj = new Main();
    char letter = 'A';
    char c = 'A';

    obj.numericValue(letter);
    obj.numericValue2(c);

  }
}
