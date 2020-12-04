package laba17-18;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Kelp {
    public void check(){

        String text = "abcdefghijklmnopqrstuv57845849454545454";
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        boolean found = Pattern.matches(text, in);
        if(found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");

    }
}
