package calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class UserActionLogger implements Observer {

    private FileWriter logFileWriter;

    public UserActionLogger(String logFileName) throws IOException {
        this.logFileWriter = new FileWriter(logFileName);
    }

    @Override
    public void update(Observable o, Object arg) {
// Получаем строку с действием пользователя
        String userAction = (String) arg;

        try {
// Записываем строку в лог-файл
            logFileWriter.write(userAction);
            logFileWriter.write("n");
            logFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
