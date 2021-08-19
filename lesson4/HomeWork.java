package lesson4;

import java.util.*;

public class HomeWork {
    /**
     * 1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
     * вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     * Посчитать, сколько раз встречается каждое слово.
     * 2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
     * телефонных номеров. В этот телефонный справочник с помощью метода add() можно
     * добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
     * учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
     * тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
     * лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
     * через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
     * справочника.
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "One", "Two", "Three", "One", "Four", "Five", "Two", "One", "Six", "Six",
                "Seven", "Three", "One", "Eight", "Nine", "Three", "Two", "One", "Five", "Ten"));
        printWithoutDuplication(stringList);
        countDuplicates(stringList);
        testPhoneBook();
    }

    public static void printWithoutDuplication(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        System.out.println(inputSet);
    }

    public static void countDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        for (String word : inputSet) {
            int count = 0;
            for (String inner : input) {
                if (word.equals(inner)) {
                    count ++;
                }
            }
            System.out.printf("%s: %d\n", word, count);
        }
    }
    public static void testPhoneBook() {
        PhoneBook.add("Hodgon", "+7 951 707 8915");
        PhoneBook.add("Nike", "+7 951 707 3030");
        PhoneBook.add("Adidas", "+7 951 707 2342");

        PhoneBook.get("Hodgon");
        PhoneBook.get("Nike");
        PhoneBook.get("Adidas");
    }
}

