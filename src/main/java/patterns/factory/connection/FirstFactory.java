package patterns.factory.connection;

public class FirstFactory {
    protected String type;

    public FirstFactory(String t) {
        this.type = t;
    }

    public Connection getConnection() {
        if (type.equals("Oracle")) {
            return new OracleConnection();
        } else {
            return new SqlServerConnection();
        }
    }
}
