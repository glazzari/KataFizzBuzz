package main.guila.zenvia;

public class Main {

    public static void main(String[] args) {
        KataFizzBuzz kfb = new KataFizzBuzz();

        for (int i = 1; i <= 100; i++) {
            System.out.println(kfb.run(i));
        }
    }
}
