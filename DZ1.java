package Sem_4_DZ;

import java.util.LinkedList;

/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
 * Постараться не обращаться к листу по индексам.
*/
public class DZ1 {
  public static void main(String[] args) throws Exception {
    LinkedList<Integer> ll = new LinkedList<>();

    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    System.out.println("Исходный список элементов: " + ll);

    LinkedList<Integer> reversedList = reverseLinkedList(ll);
    System.out.println("Перевернутый список: " + reversedList);

  }

  public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll) {

    LinkedList<Integer> reversedList = new LinkedList<>();

    for (int i = ll.size() - 1; i >= 0; i--) {

      Integer element = ll.get(i);

      reversedList.add(element);

    }

    return reversedList;

  }
}
