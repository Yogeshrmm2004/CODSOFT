import java.util.*;
public class main{
    public static void main(String[] args) {
        Random ra=new Random();
        Scanner sc=new Scanner(System.in);
        int t=1;
        int rounds=0;
        while(t==1){
            int ra1=ra.nextInt(100);
        
            for(int i=3;i>0;i--){
                int user=sc.nextInt();
                if(ra1==user){
                    System.out.println("you guessed correct");
                    rounds++;
                }
                else if(ra1>user){
                    System.out.println("you guessed too low");
                }
                else{
                    System.out.println("you guessed too high");
                }
                System.out.println("You have "+(i-1)+" out of 3");
            }
            System.out.println("The random number is "+ra1);
            System.out.println("If you want to play again enter 1");
            t=sc.nextInt();
        }
        System.out.println("your score is "+rounds);
    }
}