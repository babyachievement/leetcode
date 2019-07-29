/**
 * date: 2019/7/29 16:13
 */

public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        int[] count = new int[3];

        for (int bill : bills) {
            if (bill == 5) {
                count[0]++;
            } else if (bill == 10) {
                if (count[0] > 0) {
                    count[0]--;
                    count[1]++;
                } else {
                    return false;
                }
            } else {
                if (count[0] == 0) {
                    return false;
                }

                if (count[1] > 0) {
                    count[1]--;
                    count[0]--;
                    count[2]++;
                } else if (count[0] >= 3) {
                    count[0] -= 3;
                    count[2]++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
