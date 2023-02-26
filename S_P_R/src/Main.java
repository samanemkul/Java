import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //take user input
        //S,P,R

        //make computer to make move either S,P,R

        //computer = user->DRAW
        //Computer "S"
        //User "P" -> user wins
        //Computer wins

        //computer "P"
        //user "S" ->user wins
        // Computer wins

        //computer "R"
        // user"P" ->user wins
        // Computer wins

        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter S, P,or R");
        char userMove = inputObj.next().charAt(0);
        System.out.println("User input" +userMove);


        char[] maxMove ={'S','P','R'};
        Random random = new Random();
        int number = random.nextInt(2);//bound number from 0 to given number
        char computerMove = maxMove[number];
        System.out.println("Computer Move " +computerMove);
        if(computerMove == 'R'&& userMove == 'P'|| computerMove == 'P'&& userMove == 'S'|| computerMove == 'S'&& userMove == 'R'){
            System.out.println("User Wins");
        }
        else if(computerMove == userMove){
            System.out.println("Draw");
        }

        else {
            System.out.println("Computer Wins");
        }
//        if(computerMove == 'P'&& userMove == 'S'){
//            System.out.println("User Wins");
//        }
//        else {
//            System.out.println("Computer Wins");
        }
//        if(computerMove == userMove){
//            System.out.println("Draw");
        }


