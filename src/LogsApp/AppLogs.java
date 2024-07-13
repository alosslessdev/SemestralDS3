package LogsApp;

import org.apache.log4j.Logger;

public class AppLogs {
    private Logger logger;

    public AppLogs(Class nombreClase) {
        this.logger =  Logger.getLogger(nombreClase);
    }

    public void infoLogs (String mensaje) {
        logger.info(mensaje);
    }
    public void errorLogs (Exception mensaje) {
        logger.error(mensaje);
    }
}

