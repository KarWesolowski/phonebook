import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean end = true;
        Management management = new Management();
        while(end){
        System.out.println("Wybierz opcję: ");
        System.out.println("1. Dodaj numer");
        System.out.println("2. Wyswietl numery");
        System.out.println("3. Zakończ");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                management.addPhoneNumber();
                break;
            case 2:
                management.displayPhoneBook();
                break;
            case 3:
                end = false;
                break;

                }

        }

    }
}
