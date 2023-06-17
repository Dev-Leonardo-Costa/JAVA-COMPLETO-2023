package demo_dao_jdbc.exceptions;

public class DbIntegrityException extends RuntimeException {

    public DbIntegrityException(String message) {
        super(message);
    }

}
