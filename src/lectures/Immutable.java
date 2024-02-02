package lectures;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 13:53
 * Project Name : PACKAGE_NAME
 */

public final class Immutable {
    private final String value;
    private final int num;
    Immutable(String value, int num){
        this.value = value;
        this.num = num;
    }

    public String getValue(){return value;}
    public int getNum(){return num;}
}
