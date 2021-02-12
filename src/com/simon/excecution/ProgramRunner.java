package com.simon.excecution;

import com.simon.actions.Actions;
import com.simon.exceptions.InvalidInputException;
import com.simon.input.ConsoleInput;
import com.simon.input.InputHandler;
import com.simon.storage.Value;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ProgramRunner {

    public ProgramRunner() {
    }

    public void run() {
        ConsoleInput consoleInput = new ConsoleInput();
        InputHandler handler = new InputHandler();
        Value value = new Value();
        System.out.println("Enter value of your first number: ");
        String input = consoleInput.input();
        try {
            value.setFirst(handler.checkingOperand(input));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            tryAgain();
        }
        System.out.println("Enter one of these operators: ");
        System.out.println("( + , - , / , * , % )");
        input = consoleInput.input();
        try {
            value.setOperator(handler.checkAction(input));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            tryAgain();
        }
        System.out.println("Enter value of your second number: ");
        input = consoleInput.input();
        try {
            value.setSecond(handler.checkingOperand(input));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            tryAgain();
        }

        doTheMath(value.getFirst(), value.getSecond(), value.getOperator());

    }

    public void tryAgain() {
        System.out.println("Do you want to try again? (Y/N)?");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next().toLowerCase(Locale.ROOT);
        switch (answer) {
            case "y":
                run();
                break;
            case "n":
                System.out.println("Calculator is turned off... Good bye");
                System.exit(0);
                break;
            default:
                System.out.println("Unfortunately you typed in the wrong letter....");
                tryAgain();
                break;
        }
    }

    public void doTheMath(BigDecimal first, BigDecimal second, String operand) {
        System.out.println("The result of " + first.toString() + " " +
                operand + " " + second.toString() + " is: ");
        switch (operand) {
            case "+":
                System.out.println(Actions.addition(first, second));
                tryAgain();
                break;
            case "-":
                System.out.println(Actions.subtraction(first, second));
                tryAgain();
                break;
            case "*":
                System.out.println(Actions.multiplication(first, second));
                tryAgain();
                break;
            case "/":
                System.out.println(Actions.division(first, second));
                tryAgain();
                break;
            case "%":
                System.out.println(Actions.remainder(first, second));
                tryAgain();
                break;
            default:
                System.out.println("If this is printed out, this program has some issues...");
                tryAgain();
                break;

        }
    }


}
