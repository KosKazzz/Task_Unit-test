import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        names();
    }

    public static boolean firstLetterUpperCase(String str) {
        char[] chars = str.toCharArray();
        return Character.isUpperCase(chars[0]);
    }


    public static String compareStrings(String str1, String str2) {
        String longestStr = str1;
        String inputStr = str2;
        if (longestStr.length() > inputStr.length()) {
            return longestStr;
        } else if (longestStr.length() == inputStr.length()) {
            System.out.println("Они равны по длине и теперь новым \"самым длинным\" будет - " + inputStr);
            return inputStr;
        } else {
            return inputStr;
        }
    }

    public static void names() {
        String maxName = null;
        String name;
        while (true) {
            System.out.println("Введите имя с большой буквы: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Надо ввести имя...");
                continue;
            }
            if (input.equals("end")) {
                System.out.println("Завершаем работу ... Пока!");
                break;
            }
            if (firstLetterUpperCase(input)) {
                name = input;
                if (maxName == null) {
                    maxName = name;
                    System.out.println("Это первое введённое имя!");
                    System.out.println(" ");
                } else {
                    maxName = compareStrings(maxName, name);
                    System.out.println("Самое длинное имя: " + maxName);
                    if ((maxName.length() - name.length()) == 0) {
                        System.out.println(" ");
                    } else {
                        System.out.println("Не хватило символов: " + (maxName.length() - name.length()));
                    }
                }
            } else {
                System.out.println("Имена нужно вводить с большой буквы!");
                System.out.println(" ");
            }
        }
    }
}
