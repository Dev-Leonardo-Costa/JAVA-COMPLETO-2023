package projeto_com_jdbc.db.exceptions;

public class DbIntegrityException extends RuntimeException {

    public DbIntegrityException(String message) {
        super(message);
    }

}
