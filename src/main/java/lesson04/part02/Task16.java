package lesson04.part02;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
 * арбуз - ягода,
 * банан - трава,
 * вишня - ягода,
 * груша - фрукт,
 * дыня - овощ,
 * ежевика - куст,
 * жень-шень - корень,
 * земляника - ягода,
 * ирис - цветок,
 * картофель - клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * Пример вывода (тут показана только одна строка):
 * картофель - клубень
 *
 * Требования:
 * 1.	Объяви переменную коллекции Map с типом элементов String, String и сразу проинициализируй ee.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
 * 4.	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
 */

public class Task16 {

  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();
    map.put("арбуз", "ягода");
    map.put("банан", "трава");
    map.put("вишня", "ягода");
    map.put("груша", "фрукт");
    map.put("дыня", "овощ");
    map.put("ежевика", "куст");
    map.put("жень-шень", "корень");
    map.put("земляника", "ягода");
    map.put("ирис", "цветок");
    map.put("картофель", "клубень");

    System.out.println("арбуз - "+map.get("арбуз"));
    System.out.println("банан - "+map.get("банан"));
    System.out.println("вишня - "+map.get("вишня"));
    System.out.println("груша - "+map.get("груша"));
    System.out.println("дыня - "+map.get("дыня"));
    System.out.println("ежевика - "+map.get("ежевика"));
    System.out.println("жень-шень - "+map.get("жень-шень"));
    System.out.println("земляника - "+map.get("земляника"));
    System.out.println("ирис - "+map.get("ирис"));
    System.out.println("картофель - "+map.get("картофель"));
    //напишите тут ваш код
  }
}
