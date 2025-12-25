import java.util.Scanner;
public class sumofnumber {
    public static void main(String []args){
        Scanner s1=new Scanner(System.in);

        int sum=0;
        System.out.println("ENTER N NUMBER: ");
        int n=s1.nextInt();

        int i=1;
        do{
            System.out.println(i);
            sum+=i;
            i++;
        }
        while(i<=n);
        System.out.println("ENTER THE SUM OF NUMBER:"+sum);
        s1.close();
    }
}
