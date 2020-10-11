package up.mi.sgbdr;
import java.util.ArrayList;
import java.util.Arrays;

public class DBInfo {
    int count;
    public ArrayList<RelationInfo> list = new ArrayList<>();

    private static DBInfo INSTANCE;
    private String info = "Initial info class";

    private DBInfo() {
    }

    public static DBInfo getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DBInfo();
        }

        return INSTANCE;
    }

    public void Init() {

    }

    public void Finish() {

    }

    /*public void getList(){
        String liste = Arrays.toString(list.toArray());
        System.out.println(liste);
    }*/
}
