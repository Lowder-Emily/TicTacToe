/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author emilylowder
 */
public class TicTacToe {
    
    String name;
    String instructions = "This is how to play Tic-Tac-Toe. \n\n"
            + "You will be playing against a computer. \n"
            +"You will be \"X\" and the computer will be \"O\". The object \n"
            +"of the game is to get three of your \"X\'s in a line, either vertically \n"
            +"horizontally, or diagonally. You go first. \n\n"
            +"Good Luck!";
    
    public static void main(String[] args) {
        TicTacToe myGame = new TicTacToe();
        myGame.getName();
        myGame.displayHelp();
        // TODO code application logic here
    }
    
    public void getName()   {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        
        
    }
    
    public void displayHelp()   {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
    
}
