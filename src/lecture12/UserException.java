/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/02/2024
 * Time : 11:33
 * Project Name : lecture12
 */
package lecture12;

public class UserException extends Exception {
    public UserException() {
        super();
    }

    public UserException(Throwable t) {
        super(t);
    }

    public UserException(String msg) {
        super(msg);
    }
}
