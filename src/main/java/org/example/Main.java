package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть своє (або не своє) ім'я!\n"+
                "Можеш ввести ім'я Oksana...\n"+
                "Можеш ввести його ангійською....\n");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(Spain(name));
        System.out.println(Germany(name));
        System.out.println(IsOksana(name));
    }

    public static String Spain (String a) {
        String s = "Hola," + a;
        return s;
    }

    public static String Germany (String a) {
        String s = "Halo," + a;
        return s;
    }

    public static String IsOksana (String a) {
        String s = new String();
        if(a.equals("Oksana")){
            s = "Wow! You are Oksana!";
        }
        else{
            s = "Meh... You are not Oksana...";
        }
        return s;
    }

}
