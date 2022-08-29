package almeida.adenilson.uno.morintegraocomjava.utils_app;

import androidx.room.Database;

public class UtilsApp {
private static final String TAG = "UtilsApp";
    private static UtilsApp.DataBaseCrudOperations dataBaseCrudOperations;

    public enum DataBaseCrudOperations {
        CREATE,
        READ,
        UPDATE,
        DELETE,
        NONE
    }
}
