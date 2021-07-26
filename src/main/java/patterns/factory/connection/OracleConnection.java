package patterns.factory.connection;

public class OracleConnection extends Connection {

    @Override
    public String description() {
        return "Oracle";
    }
}
