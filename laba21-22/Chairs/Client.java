package laba21-22;

import java.util.Scanner;

public class Client implements Chair {
    private Chair chair;

    public Client() {
        System.out.println("Выберите стул:");
        System.out.println("1.Викторианский стул");
        System.out.println("2.Многофункциональный стул;");
        System.out.println("3.Магический стул");
        int i;
        Scanner scanner = new Scanner(System.in);
        i=scanner.nextInt();
        if (i==1){
            Factory factory = new VictorianChairFactory();
            chair= factory.createChair();
        }
        else  if (i==2){
            Factory factory = new MultyfunctionChairFactory();
            chair= factory.createChair();
        }
        else  if (i==3){
            Factory factory = new MagicChairFactory();
            chair= factory.createChair();
        }
    }

    @Override
    public void sit() {
        chair.sit();
    }
}
