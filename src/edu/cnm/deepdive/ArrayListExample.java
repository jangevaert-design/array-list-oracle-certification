package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayList myList = new ArrayList();
    ArrayList<Object> myList2 = new ArrayList<Object>();//Stores any object.
    ArrayList<String> list = new ArrayList<String>();//can only store Strings.
    ArrayList<String> list2 = new ArrayList<>();//diamond operator on right hand side can be left
    //blank since Java 5.
    List<String> list3 = new ArrayList<>();//using the List interface as type because ArrayList implements
    //the List interface. This is an example of polymorphism.

    //ArrayList<String> list4 = new List<>();will not compile. The interface needs to be on the left.
    //Array has a fixed size but ArrayList will automatically resize if needed.
    List<String> list5 = new ArrayList<>(20);//capacity of the ArrayList set on 20.
  }
}
