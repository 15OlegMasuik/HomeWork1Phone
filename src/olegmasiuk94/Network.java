package olegmasiuk94;

/**
 * Created by Marta on 16.11.2017.
 */
public class Network {
    private  String operator;
    private int nomer;

    public Network() {

    }

    public Network(String operator, int nomer) {

        this.operator = operator;
        this.nomer = nomer;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
