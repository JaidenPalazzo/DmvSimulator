package DmvSimulator;

import java.util.Random;

public class DmvSimulator {
    public static void main(String [] args){
        System.out.println("Welcome to the DMV!!"); 
        
        Random random = new Random(); 
        int num = random.nextInt(200) +1; 
        System.out.println("Your number is " + num + ". Please wait until your number is called. "); 

        for (int i = num + 1; i <= 200; i++) {
            System.out.println("Number " + i + " Please come up to the front"); 
        }

        for (int i = 1; i < num; i ++) {
            System.out.println("Number "+ i+ " Please come to the front"); 
        }

        if (num == 2 || num == 102){
            System.out.println("you have all the required paperwork, your all set!!"); 
        }
        else {
        System.out.println("you do not have the required paperwork, go to hell"); 
        }

    }
}
