import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int grade;
        int c=0;
        int sum=0;
        grade=in.nextInt();
        while(grade!=-1)
        {
            c+=1;
            sum=sum+grade;
            grade=in.nextInt();
        }
        if(c!=0)
            System.out.print(sum/c);
    }
}
