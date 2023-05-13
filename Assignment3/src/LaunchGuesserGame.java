import java.util.*;
 class Guesser{
    int guessNum;
    int guessNum(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser please guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
 class Player{
    int guessNum;
    int guessNum(){
    Scanner scan=new Scanner(System.in);
        System.out.println("Player please guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

 class Umpire{
    int numFromGueser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){
        Guesser g1=new Guesser();
        numFromGueser=g1.guessNum();
    }
    void collectNumFromPlayers(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessNum();
        numFromPlayer2=p2.guessNum();
        numFromPlayer3=p3.guessNum();
    }
    void compare(){
        if(numFromGueser==numFromPlayer1){
            if(numFromGueser==numFromPlayer2 && numFromGueser==numFromPlayer3){
                System.out.println("All players won");
            }
            else if(numFromGueser==numFromPlayer2){
                System.out.println("Player 1 & player 2 won");
            }
            else if(numFromGueser==numFromPlayer3){
                System.out.println("Player 1 & 3 won");
            }
            else{
            System.out.println("Player 1 won");
            }

        }
        else if(numFromGueser==numFromPlayer2){
            if(numFromGueser==numFromPlayer2 && numFromGueser==numFromPlayer3){
                System.out.println("Player 2 & player 3 won");
            }
            else{
            System.out.println("Player 2 won ");
            }
        }
        else if(numFromGueser==numFromPlayer3){
            System.out.println("Player 3 won");
        }
        else{
            System.out.println("Game lost try again");
        }
    }
}
public class LaunchGuesserGame{
    public static void main(String[] args) {
        Umpire u1=new Umpire();
        u1.collectNumFromGuesser();
        u1.collectNumFromPlayers();
        u1.compare();
        
    }
}