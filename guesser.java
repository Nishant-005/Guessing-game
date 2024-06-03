// This is a guessing game programm
import java.util.*;
public class guesser{

    //making a function to repeat the process
    static void akinator(){
        Random Ran=new Random();
        System.out.println("Welcome to the game!");
        System.out.println("Please Guess the number between 1 To 10");
        Scanner sc=new Scanner(System.in);
        int no=Ran.nextInt(0,11);
        int i=0;
        for(i=0;i<3;i++){
            System.out.println("PLease Enter your Guess"+(i+1)+":");
            int imp=sc.nextInt();
            if(imp==no){
                System.out.println("You Win!!");
                break;
            }
            else{
                if(i<2){
                    System.out.println("Try Again");
                }
            }
        }
        if(i==3){
            System.out.println("Sorry! You Loose");
        }
        System.out.println("Do You Want to play again");
        System.out.println("If you want to play again then enter '1'\n Otherwise Enter another digit");
        int choise=sc.nextInt();
        if(choise==1){
            akinator();
        }
    }
    public static void main(String[] args){
        Random Ran=new Random();
        System.out.println("Welcome to the game!");
        System.out.println("Please Guess the number between 1 To 10");
        Scanner sc=new Scanner(System.in);
        int no=Ran.nextInt(0,11);
        int i=0;
        for(i=0;i<3;i++){
            System.out.println("PLease Enter your Guess"+(i+1)+":");
            int imp=sc.nextInt();
            if(imp==no){
                System.out.println("You Win!!");
                break;
            }
            else{
                if(i<2){
                    System.out.println("Try Again");
                }
            }
        }
        if(i==3){
            System.out.println("Sorry! You Loose");
        }
        System.out.println("Do You Want to play again");
        System.out.println("\nIf you want to play again then enter '1'\nOtherwise Enter another digit");
        int choise=sc.nextInt();
        if(choise==1){
            akinator();
        }
    }
}