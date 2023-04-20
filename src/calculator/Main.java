package calculator;

import java.io.IOException;
import java.util.Observable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        UserActionLogger logger = new UserActionLogger("log.txt");

        Observable observableObject = new Observable();

        observableObject.addObserver(logger);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите действие пользователя: ");
            String userAction = scanner.nextLine();

// Сообщаем наблюдателям об изменении состояния объекта
            observableObject.notifyObservers(userAction);
        }
    }
}

