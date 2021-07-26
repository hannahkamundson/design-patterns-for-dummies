package patterns.factory.connection;

public class SqlServerConnection extends Connection {

    @Override
    public String description() {
        return "SQL Server";
    }
}
