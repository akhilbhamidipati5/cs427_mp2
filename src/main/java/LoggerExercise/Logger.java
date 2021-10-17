package LoggerExercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    /**
     * @TODO Add any necessary fields and variables.
     */
    private static File logFile;
    private static String logFileName;
    
    /**
     * The constructor for SingletonLogger. Set all necessary fields.
     *
     */
    //@TODO Add constructor here
    private Logger() {
        String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
        logFileName = "log"+today+".log";
        logFile = new File(logFileName);
    }

    /**
     * @return A Logger instance of this class.
     */
    public static Logger getInstance() {
        if (instance != null) {
            // can only have one instance
            return instance;
        } else {
            instance = new Logger();
            return instance
        }
    }


    /**
     *
     * @param log
     *            The Object that will be logged in the file.
     */
    public void logInFile(Object log) {
        //@TODO: implement me
        FileWriter myWriter = new FileWriter(logFileName);
        myWriter.write(log);
        myWriter.close();
    }
}