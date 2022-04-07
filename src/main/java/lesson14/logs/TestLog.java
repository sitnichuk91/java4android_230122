package lesson14.logs;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class TestLog {

    protected static final Logger logger = Logger.getLogger("testLog");

    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.ALL);

        Handler handler = new FileHandler("src/main/resources/logs/logFromLogger.log");

        logger.addHandler(handler);
//        handler.setFormatter(new SimpleFormatter());
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return String.format("%s\t%s\t%s\n", record.getLevel(), new Date(record.getMillis()), record.getMessage());
            }
        });
        handler.setLevel(Level.ALL);

        logger.log(Level.SEVERE, "Логгирование S");
        logger.finer("Логгирование F");
        logger.info("Логгирование I");
        logger.warning("Логгирование W");
        logger.config("Логгирование C");

    }


    //OFF
    //SEVERE
    //WARNING
    //INFO
    //---------- УРОВЕНЬ ПО УМОЛЧАНИЮ
    //CONFIG
    //FINE(3)
    //ALL
}
