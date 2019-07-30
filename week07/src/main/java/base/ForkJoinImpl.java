/**
 * date: 2019/7/30 10:45
 */

package base;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinImpl extends RecursiveTask<Long> {
    //临界值，就是结束值减开始值的结果如果小于这个值那么就不拆分了，大于这个值才会拆分
    private final int MEDIAN_NUM = 10;
    //从多少计算
    private       int start_num  = 0;
    //计算到多少
    private       int end_num    = 0;

    public ForkJoinImpl(int start_num, int end_num) {
        this.start_num = start_num;
        this.end_num = end_num;

    }

    @Override
    protected Long compute() {

        int temp = end_num - start_num;
        if (temp < MEDIAN_NUM) {
            return process();
        }

        int mid = (start_num + end_num) / 2;

        ForkJoinImpl left = new ForkJoinImpl(start_num, mid);
        left.fork();
        ForkJoinImpl right = new ForkJoinImpl(mid+1, end_num);
        right.fork();
        Long leftResult  = left.join();
        Long rightResult = right.join();
        return leftResult + rightResult;
    }

    private Long process() {
        long sum = 0;
        for (int i = start_num; i <= end_num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        final ForkJoinImpl forkJoin = new ForkJoinImpl(0, 2000);
        final Long         result   = new ForkJoinPool().invoke(forkJoin);
        System.out.println(result);

        long sum = 0;
        for (int i = 0; i <= 2000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
