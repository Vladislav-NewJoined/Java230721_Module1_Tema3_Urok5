import java.util.Random;
import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП
//  Пример взят отсюда: https://github.com/Taylor-McNeil/YouTubeTutorials-/blob/master/TicTacToe.java
//  В текстовом файле строка 55
public class Task1_3_5_10 {

    static int playerScore = 0;
    static int computerScore = 0;
    static Scanner input = new Scanner(System.in);
/*
    Notes:

        _ | _ | _
        _ | _ | _
          |   |

         Helpful indices

         [0][0] , [0][2] , [0][4]
         [1][0] , [1][2] , [1][4]
         [2][0] , [2][2] , [2][4]

        Player = 1
        Computer = 2

 */

    public static void main(String [] args){
        System.out.println("Задание: \n10. Напишите крестики-нолики, используя StringBuilder\n\nРешение: ");
        char [][] gameBoard = {{'_','|','_','|','_'},{'_', '|', '_','|','_'},{' ','|',' ','|',' '}};
        printBoard(gameBoard);
        boolean gameOver = false;
        boolean playAgain = true;

        while(playAgain) {
            while (!gameOver) {
                StringBuilder welcome = new StringBuilder("Добро пожаловать!");
                System.out.println(welcome.toString());
                playerMove(gameBoard);
                gameOver = isGameOver(gameBoard);
                if (gameOver) {
                    break;
                }

                computerMove(gameBoard);
                gameOver = isGameOver(gameBoard);
                if (gameOver) {
                    break;
                }
            }
            StringBuilder printPlayerScore = new StringBuilder("Счет игрока: ");
            System.out.println(printPlayerScore.toString() + playerScore);
            StringBuilder printComputerScore = new StringBuilder("Счет компьютера: ");
            System.out.println(printComputerScore.toString() + computerScore);
            StringBuilder offerPlayAgain = new StringBuilder("Хотите сыграть ещё раз? Клавиши Y/N");
            System.out.println(offerPlayAgain.toString());
            input.nextLine();
            String result = input.nextLine();

            switch (result){
                case "Y":
                case "y":
                    playAgain = true;
                    StringBuilder beginPlayAgain = new StringBuilder("ОК! Начинаем новую игру");
                    System.out.println(beginPlayAgain.toString());
                    resetBoard(gameBoard);
                    gameOver = false;
                    printBoard(gameBoard);
                    break;

                case "N":
                case "n":
                    playAgain = false;
                    StringBuilder thanks = new StringBuilder("Спасибо за игру");
                    System.out.println(thanks.toString());
                    break;
                default:
                    break;
            }

        }
    }
    public static void printBoard(char [][] gameBoard){

        for(char[] row : gameBoard){
            for( char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void updateBoard( int position, int player, char [][] gameBoard){

        char character;

        if(player==1){
            character = 'X';
        }else{
            character = 'O';
        }

        switch (position){

            case 1:
                gameBoard[0][0] = character;
                printBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = character;
                printBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4] = character;
                printBoard(gameBoard);
                break;
            case 4:
                gameBoard[1][0] = character;
                printBoard(gameBoard);
                break;
            case 5:
                gameBoard[1][2] = character;
                printBoard(gameBoard);
                break;
            case 6:
                gameBoard[1][4] = character;
                printBoard(gameBoard);
                break;
            case 7:
                gameBoard[2][0] = character;
                printBoard(gameBoard);
                break;
            case 8:
                gameBoard[2][2] = character;
                printBoard(gameBoard);
                break;
            case 9:
                gameBoard[2][4] = character;
                printBoard(gameBoard);
                break;
            default:
                break;
        }
    }
    public static void playerMove(char[][] gameBoard){

        StringBuilder playersMove = new StringBuilder("Пожалуйста, сделайте Ваш ход (клавиши 1-9): ");
        System.out.println(playersMove.toString());

        int move = input.nextInt();

        boolean result = isValidMove(move,gameBoard);

        while(!result){
            StringBuilder invalidMove = new StringBuilder("Некорректный ввод. Повторите попытку");
            System.out.println(invalidMove.toString());
            move = input.nextInt();
            result = isValidMove(move,gameBoard);
        }
        StringBuilder playersMoved = new StringBuilder("Вы сделали ход на позиции ");
        System.out.println(playersMoved.toString() + move);
        updateBoard(move,1,gameBoard);
    }
    public static boolean isValidMove(int move, char[][] gameboard){

        switch (move){
            case 1:
                if(gameboard[0][0] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 2:
                if(gameboard[0][2] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 3:
                if(gameboard[0][4] == '_'){
                    return true;
                } else{
                    return false;
                }

            case 4:
                if(gameboard[1][0] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 5:
                if(gameboard[1][2] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 6:
                if(gameboard[1][4] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 7:
                if(gameboard[2][0] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 8:
                if(gameboard[2][2] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 9:
                if(gameboard[2][4] == ' '){
                    return true;
                } else{
                    return false;
                }

            default:
                return false;
        }

    }

    public static void computerMove(char [][] gameBoard){

        Random rand = new Random();
        int move = rand.nextInt(9)+1;

        boolean result = isValidMove(move,gameBoard);

        while(!result){
            move = rand.nextInt(9)+1;
            result = isValidMove(move, gameBoard);
        }

        StringBuilder compMoved = new StringBuilder("Компьютер сделал ход на позиции ");
        System.out.println(compMoved.toString() + move);
        updateBoard(move,2,gameBoard);
    }
    public static boolean isGameOver(char [][] gameboard){

        //Horizontal Win
        if(gameboard[0][0] == 'X'&& gameboard[0][2] == 'X' && gameboard [0][4] == 'X' ){
            StringBuilder playerWins = new StringBuilder("Вы победили");
            System.out.println(playerWins.toString());
            playerScore++;
            return true;
        }
        if(gameboard[0][0] == 'O'&& gameboard[0][2] == 'O' && gameboard [0][4] == 'O' ){
            StringBuilder compWins = new StringBuilder("Компьютер победил");
            System.out.println(compWins.toString());
            computerScore++;
            return true;
        }
        if(gameboard[1][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [1][4] == 'X' ){
            StringBuilder playerWins = new StringBuilder("Вы победили");
            System.out.println(playerWins.toString());
//            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[1][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [1][4] == 'O' ){
            StringBuilder compWins = new StringBuilder("Компьютер победил");
            System.out.println(compWins.toString());
            computerScore++;
            return true;
        }
        if(gameboard[2][0] == 'X'&& gameboard[2][2] == 'X' && gameboard [2][4] == 'X' ){
            StringBuilder playerWins = new StringBuilder("Вы победили");
            System.out.println(playerWins.toString());
            playerScore++;
            return true;
        }
        if(gameboard[2][0] == 'O'&& gameboard[2][2] == 'O' && gameboard [2][4] == 'O' ) {
            StringBuilder compWins = new StringBuilder("Компьютер победил");
            System.out.println(compWins.toString());
            computerScore++;
            return true;
        }

        //Vertical Wins
        if(gameboard[0][0] == 'X'&& gameboard[1][0] == 'X' && gameboard [2][0] == 'X' ){
            StringBuilder playerWins = new StringBuilder("Вы победили");
            System.out.println(playerWins.toString());
            playerScore++;
            return true;
        }
        if(gameboard[0][0] == 'O'&& gameboard[1][0] == 'O' && gameboard [2][0] == 'O' ){
            StringBuilder compWins = new StringBuilder("Компьютер победил");
            System.out.println(compWins.toString());
            computerScore++;
            return true;
        }

        if(gameboard[0][2] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][2] == 'X' ){
            StringBuilder playerWins = new StringBuilder("Вы победили");
            System.out.println(playerWins.toString());
            playerScore++;
            return true;
        }
        if(gameboard[0][2] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][2] == 'O' ){
            StringBuilder compWins = new StringBuilder("Компьютер победил");
            System.out.println(compWins.toString());
            computerScore++;
            return true;
        }

        if(gameboard[0][4] == 'X'&& gameboard[1][4] == 'X' && gameboard [2][4] == 'X' ){
            StringBuilder playerWins = new StringBuilder("Вы победили");
            System.out.println(playerWins.toString());
            playerScore++;
            return true;
        }
        if(gameboard[0][4] == 'O'&& gameboard[1][4] == 'O' && gameboard [2][4] == 'O' ){
            StringBuilder compWins = new StringBuilder("Компьютер победил");
            System.out.println(compWins.toString());
            computerScore++;
            return true;
        }

        //Diagonal Wins
        if(gameboard[0][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][4] == 'X' ){
            StringBuilder playerWins = new StringBuilder("Вы победили");
            System.out.println(playerWins.toString());
            playerScore++;
            return true;
        }
        if(gameboard[0][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][4] == 'O' ){
            StringBuilder compWins = new StringBuilder("Компьютер победил");
            System.out.println(compWins.toString());
            computerScore++;
            return true;
        }

        if(gameboard[2][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [0][4] == 'X' ){
            StringBuilder playerWins = new StringBuilder("Вы победили");
            System.out.println(playerWins.toString());
            playerScore++;
            return true;
        }
        if(gameboard[2][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [0][4] == 'O' ){
            StringBuilder compWins = new StringBuilder("Компьютер победил");
            System.out.println(compWins.toString());
            computerScore++;
            return true;
        }

        if(gameboard[0][0] != '_' && gameboard[0][2] != '_' && gameboard[0][4] != '_' && gameboard[1][0] !='_'&&
                gameboard[1][2] != '_' && gameboard[1][4] != '_' && gameboard[2][0] != ' ' && gameboard[2][2] != ' ' && gameboard[2][4] != ' '){
            StringBuilder tie = new StringBuilder("Ничья");
            System.out.println(tie.toString());
            return true;
        }
        return false;}

    public static void resetBoard(char [][] gameBoard){
        gameBoard[0][0] = '_';
        gameBoard[0][2] = '_';
        gameBoard[0][4] = '_';
        gameBoard[1][0] = '_';
        gameBoard[1][2] = '_';
        gameBoard[1][4] = '_';
        gameBoard[2][0] = ' ';
        gameBoard[2][2] = ' ';
        gameBoard[2][4] = ' ';

    }
}
//        Конец Примера _ КККККККККККККККК








////        Пример 1 ППППППППППППППППППППППППППППППППППП
////  Пример взят отсюда: https://github.com/Taylor-McNeil/YouTubeTutorials-/blob/master/TicTacToe.java
////  В текстовом файле строка 55
//public class Task1_3_5_10 {
//
//    static int playerScore = 0;
//    static int computerScore = 0;
//    static Scanner input = new Scanner(System.in);
///*
//    Notes:
//
//        _ | _ | _
//        _ | _ | _
//          |   |
//
//         Helpful indices
//
//         [0][0] , [0][2] , [0][4]
//         [1][0] , [1][2] , [1][4]
//         [2][0] , [2][2] , [2][4]
//
//        Player = 1
//        Computer = 2
//
// */
//
//    public static void main(String [] args){
//
//        char [][] gameBoard = {{'_','|','_','|','_'},{'_', '|', '_','|','_'},{' ','|',' ','|',' '}};
//        printBoard(gameBoard);
//        boolean gameOver = false;
//        boolean playAgain = true;
//
//        while(playAgain) {
//            while (!gameOver) {
//                System.out.println("Welcome to Tic Tac Toe!!");
//                playerMove(gameBoard);
//                gameOver = isGameOver(gameBoard);
//                if (gameOver) {
//                    break;
//                }
//
//                computerMove(gameBoard);
//                gameOver = isGameOver(gameBoard);
//                if (gameOver) {
//                    break;
//                }
//            }
//            System.out.println("Player Score: " +playerScore);
//            System.out.println("Computer Score: "+ computerScore);
//            System.out.println("Would you like to play again? Y/N");
//            input.nextLine();
//            String result = input.nextLine();
//
//            switch (result){
//                case "Y":
//                case "y":
//                    playAgain = true;
//                    System.out.println("Dope! Let's play again");
//                    resetBoard(gameBoard);
//                    gameOver = false;
//                    printBoard(gameBoard);
//                    break;
//
//                case "N":
//                case "n":
//                    playAgain = false;
//                    System.out.println("Thanks for playing");
//                    break;
//                default:
//                    break;
//            }
//
//        }
//    }
//    public static void printBoard(char [][] gameBoard){
//
//        for(char[] row : gameBoard){
//            for( char c : row){
//                System.out.print(c);
//            }
//            System.out.println();
//        }
//    }
//    public static void updateBoard( int position, int player, char [][] gameBoard){
//
//        char character;
//
//        if(player==1){
//            character = 'X';
//        }else{
//            character = 'O';
//        }
//
//        switch (position){
//
//            case 1:
//                gameBoard[0][0] = character;
//                printBoard(gameBoard);
//                break;
//            case 2:
//                gameBoard[0][2] = character;
//                printBoard(gameBoard);
//                break;
//            case 3:
//                gameBoard[0][4] = character;
//                printBoard(gameBoard);
//                break;
//            case 4:
//                gameBoard[1][0] = character;
//                printBoard(gameBoard);
//                break;
//            case 5:
//                gameBoard[1][2] = character;
//                printBoard(gameBoard);
//                break;
//            case 6:
//                gameBoard[1][4] = character;
//                printBoard(gameBoard);
//                break;
//            case 7:
//                gameBoard[2][0] = character;
//                printBoard(gameBoard);
//                break;
//            case 8:
//                gameBoard[2][2] = character;
//                printBoard(gameBoard);
//                break;
//            case 9:
//                gameBoard[2][4] = character;
//                printBoard(gameBoard);
//                break;
//            default:
//                break;
//        }
//    }
//    public static void playerMove(char[][] gameBoard){
//
//        System.out.println("Please make a move. (1-9)");
//
//        int move = input.nextInt();
//
//        boolean result = isValidMove(move,gameBoard);
//
//        while(!result){
//            System.out.println("Sorry! Invalid Move. Try again");
//            move = input.nextInt();
//            result = isValidMove(move,gameBoard);
//        }
//
//        System.out.println("Player moved at position " + move);
//        updateBoard(move,1,gameBoard);
//    }
//    public static boolean isValidMove(int move, char[][] gameboard){
//
//        switch (move){
//            case 1:
//                if(gameboard[0][0] == '_'){
//                    return true;
//                } else{
//                    return false;
//                }
//            case 2:
//                if(gameboard[0][2] == '_'){
//                    return true;
//                } else{
//                    return false;
//                }
//            case 3:
//                if(gameboard[0][4] == '_'){
//                    return true;
//                } else{
//                    return false;
//                }
//
//            case 4:
//                if(gameboard[1][0] == '_'){
//                    return true;
//                } else{
//                    return false;
//                }
//            case 5:
//                if(gameboard[1][2] == '_'){
//                    return true;
//                } else{
//                    return false;
//                }
//            case 6:
//                if(gameboard[1][4] == '_'){
//                    return true;
//                } else{
//                    return false;
//                }
//            case 7:
//                if(gameboard[2][0] == ' '){
//                    return true;
//                } else{
//                    return false;
//                }
//            case 8:
//                if(gameboard[2][2] == ' '){
//                    return true;
//                } else{
//                    return false;
//                }
//            case 9:
//                if(gameboard[2][4] == ' '){
//                    return true;
//                } else{
//                    return false;
//                }
//
//            default:
//                return false;
//        }
//
//    }
//
//    public static void computerMove(char [][] gameBoard){
//
//        Random rand = new Random();
//        int move = rand.nextInt(9)+1;
//
//        boolean result = isValidMove(move,gameBoard);
//
//        while(!result){
//            move = rand.nextInt(9)+1;
//            result = isValidMove(move, gameBoard);
//        }
//
//        System.out.println("Computer moved at position "+ move);
//        updateBoard(move,2,gameBoard);
//    }
//    public static boolean isGameOver(char [][] gameboard){
//
//        //Horizontal Win
//        if(gameboard[0][0] == 'X'&& gameboard[0][2] == 'X' && gameboard [0][4] == 'X' ){
//            System.out.println("Player Wins");
//            playerScore++;
//            return true;
//        }
//        if(gameboard[0][0] == 'O'&& gameboard[0][2] == 'O' && gameboard [0][4] == 'O' ){
//            System.out.println("Computer Wins");
//            computerScore++;
//            return true;
//        }
//        if(gameboard[1][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [1][4] == 'X' ){
//            System.out.println("Player Wins");
//            playerScore++;
//            return true;
//        }
//        if(gameboard[1][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [1][4] == 'O' ){
//            System.out.println("Computer Wins");
//            computerScore++;
//            return true;
//        }
//        if(gameboard[2][0] == 'X'&& gameboard[2][2] == 'X' && gameboard [2][4] == 'X' ){
//            System.out.println("Player Wins");
//            playerScore++;
//            return true;
//        }
//        if(gameboard[2][0] == 'O'&& gameboard[2][2] == 'O' && gameboard [2][4] == 'O' ) {
//            System.out.println("Computer Wins");
//            computerScore++;
//            return true;
//        }
//
//        //Vertical Wins
//
//        if(gameboard[0][0] == 'X'&& gameboard[1][0] == 'X' && gameboard [2][0] == 'X' ){
//            System.out.println("Player Wins");
//            playerScore++;
//            return true;
//        }
//        if(gameboard[0][0] == 'O'&& gameboard[1][0] == 'O' && gameboard [2][0] == 'O' ){
//            System.out.println("Computer Wins");
//            computerScore++;
//            return true;
//        }
//
//        if(gameboard[0][2] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][2] == 'X' ){
//            System.out.println("Player Wins");
//            playerScore++;
//            return true;
//        }
//        if(gameboard[0][2] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][2] == 'O' ){
//            System.out.println("Computer Wins");
//            computerScore++;
//            return true;
//        }
//
//        if(gameboard[0][4] == 'X'&& gameboard[1][4] == 'X' && gameboard [2][4] == 'X' ){
//            System.out.println("Player Wins");
//            playerScore++;
//            return true;
//        }
//        if(gameboard[0][4] == 'O'&& gameboard[1][4] == 'O' && gameboard [2][4] == 'O' ){
//            System.out.println("Computer Wins");
//            computerScore++;
//            return true;
//        }
//
//        //Diagonal Wins
//        if(gameboard[0][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][4] == 'X' ){
//            System.out.println("Player Wins");
//            playerScore++;
//            return true;
//        }
//        if(gameboard[0][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][4] == 'O' ){
//            System.out.println("Computer Wins");
//            computerScore++;
//            return true;
//        }
//
//        if(gameboard[2][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [0][4] == 'X' ){
//            System.out.println("Player Wins");
//            playerScore++;
//            return true;
//        }
//        if(gameboard[2][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [0][4] == 'O' ){
//            System.out.println("Computer Wins");
//            computerScore++;
//            return true;
//        }
//
//        if(gameboard[0][0] != '_' && gameboard[0][2] != '_' && gameboard[0][4] != '_' && gameboard[1][0] !='_'&&
//                gameboard[1][2] != '_' && gameboard[1][4] != '_' && gameboard[2][0] != ' ' && gameboard[2][2] != ' ' && gameboard[2][4] != ' '){
//            System.out.println("Its a tie");
//            return true;
//        }
//        return false;}
//
//    public static void resetBoard(char [][] gameBoard){
//        gameBoard[0][0] = '_';
//        gameBoard[0][2] = '_';
//        gameBoard[0][4] = '_';
//        gameBoard[1][0] = '_';
//        gameBoard[1][2] = '_';
//        gameBoard[1][4] = '_';
//        gameBoard[2][0] = ' ';
//        gameBoard[2][2] = ' ';
//        gameBoard[2][4] = ' ';
//
//    }
//}
////        Конец Примера 1 КККККККККККККККК








