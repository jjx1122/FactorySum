public class FactorialSum {
    public static void main(String[] args) {
        int n = 10; // 要计算阶乘的最大值
        int sum = 0; // 保存结果的变量

        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
        }

        System.out.println("1到10的阶乘和为：" + sum);
    }
}
