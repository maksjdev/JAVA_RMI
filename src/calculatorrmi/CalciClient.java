package calculatorrmi;

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import java.util.Scanner;

public class CalciClient {
    public static void main(String[] args)throws NotBoundException,MalformedURLException,RemoteException{
        Scanner sc = new Scanner(System.in);
            try {

                CalculatorInterface c = (CalculatorInterface) Naming.lookup("rmi://localhost:1099/Calculator");
                System.out.println("Client is connected to server");

                System.out.println("Выберите команду :\n"
                        + "1. Суммировать\n"
                        + "2. Вычесть\n"
                        + "3. Умножить\n"
                        + "4. Поделить\n"
                        + "5 - Выход");
                do {
                int choice = sc.nextInt();
                int x, y;

                switch (choice) {

                        case 1: {
                            System.out.println("Enter x and y");
                            x = sc.nextInt();
                            y = sc.nextInt();
                            System.out.println(x + "+" + y + "=" + c.add(x, y));
                            break;
                        }
                        case 2: {
                            System.out.println("Enter x and y");
                            x = sc.nextInt();
                            y = sc.nextInt();
                            System.out.println(x + "-" + y + "=" + c.sub(x, y));
                            break;

                        }
                        case 3: {
                            System.out.println("Enter x and y");
                            x = sc.nextInt();
                            y = sc.nextInt();
                            System.out.println(x + "*" + y + "=" + c.mul(x, y));
                            break;
                        }
                        case 4: {
                            System.out.println("Enter x and y");
                            x = sc.nextInt();
                            y = sc.nextInt();
                            System.out.println(x + "/" + y + "=" + c.div(x, y));
                            break;
                        }
                        case 5: {
                            System.exit(0);
                        }

                    }
                }while (!sc.equals(5));
            } catch (Exception e) {
            }

    }
}
