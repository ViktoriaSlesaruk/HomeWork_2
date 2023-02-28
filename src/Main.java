import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String correctpass = "Vika";

        while (true) {
            System.out.println("Введите пароль");
            Scanner scanner = new Scanner(System.in);
            String inputpass = scanner.nextLine();

            if (inputpass.equals("Exit"))
            {
                break;
            }
            else if(!inputpass.equals(correctpass)) {
                System.out.println("Неверный пароль, попробуйте еще раз");
            }
            else if (inputpass.equals(correctpass))
             {
                System.out.println("Вы вошли в систему");
                break;
            }
             else {
                 break;
            }
        }
    }
}