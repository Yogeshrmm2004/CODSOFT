import java.util.*;
/**
 * GRADECAL
 */
public class GRADECAL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float tot=0,temp;
        float aver=0;
        System.out.println("Enter the number of Subjects: ");
        int nos=sc.nextInt();
        for(int i=1;i<=nos;i++){
            System.out.println("Mark of Subject "+i+" : ");
            temp=sc.nextInt();
            tot=tot+temp;
        }
        float totalmark=nos*100;
        aver=(tot/totalmark)*100;
        System.out.println("You got "+tot+" out of "+totalmark);
        System.out.println("Your Average percentage "+aver+" %");
        System.out.println("Your Grade is:");
        if (aver>95) {
            System.out.println("O");
        }
        else if (aver>90) {
            System.out.println("A+");
        }
        else if (aver>80) {
            System.out.println("A");
        }
        else if (aver>70) {
            System.out.println("B+");
        }
        else if (aver>60) {
            System.out.println("B");
        }
        else if (aver>=50) {
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }

    }
}