package com.example.githubaction;

public class CodeSmell {

  public void ignoredException() {

    try {
      System.out.println("hello world");
    } catch (Exception e) {

    }

  }

  public void unUsedVariables() {
    var fistName = "sungjin";
    var lastName = "kang";

    System.out.println("sungjin kang");
  }

}
