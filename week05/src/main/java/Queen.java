import java.io.Serializable;

/**
 * 2019/7/19
 */

public class Queen implements Serializable, Cloneable {

    /**
     *
     */
    private static final long serialVersionUID = 7354459222300557644L;
    //皇后的位置
    private              int  position;

    public Queen() {

    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
