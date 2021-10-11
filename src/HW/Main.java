package HW;

public class Main {

    public static void main(String[] args) {

        Randoms randoms = new Randoms(30, 100);

        int counter = 0;

        while (true) {
            if (randoms.addNumber() == 100) {
                System.out.println("Выпало число 100, цикл завершен!");
                break;
            }
        }

        for (Integer j: randoms.getList()) {
            System.out.println(j + "\r");
        }
    }
}
