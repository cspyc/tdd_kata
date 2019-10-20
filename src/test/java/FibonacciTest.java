import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”，
 * 指的是这样一个数列：1、1、2、3、5、8、13、21、34、……
 * 在数学上，斐波那契数列以如下被以递推的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 */
public class FibonacciTest {

    @Test
    public void return_1_when_number_1() {
        checkNumberOfPosition(1,1);
        checkNumberOfPosition(2,3);
        checkNumberOfPosition(3,4);
        checkNumberOfPosition(8,6);
    }

    private void checkNumberOfPosition(int resultNumber,int position) {
        Fibonacci fibonacci = new Fibonacci();
        assertThat(resultNumber,equalTo(fibonacci.return_fibonacci_number(position)));
    }


}
