package demo_dao_jdbc.exceptions;

public class DbException extends RuntimeException {
    public DbException(String message) {
        super(message);
    }

}
