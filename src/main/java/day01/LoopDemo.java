
package day01;
//https://github.com/hunterhope/20220315_JavaOCP.git
//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
public class LoopDemo {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.printf("i= %d%n",i);
            sum+=i;
            System.out.printf("sum= %d%n",sum);
        }
        System.out.printf("total sum = %d%n",sum);
    }
}
