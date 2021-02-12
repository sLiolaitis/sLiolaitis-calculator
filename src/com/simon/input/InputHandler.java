package com.simon.input;

import com.simon.exceptions.InvalidInputException;

import java.math.BigDecimal;

public class InputHandler {

    private ConsoleInput consoleInput;

    public InputHandler() {
    }

    public BigDecimal checkingOperand(String operand) throws InvalidInputException {
        try {
            BigDecimal number = new BigDecimal(operand);
        } catch (Exception e) {
            throw new InvalidInputException("Your input is probably not a number");
        }

        return new BigDecimal(operand);
    }

    public String checkAction(String operator) throws InvalidInputException {
        String trimmedOperator = operator.trim();
        if ((trimmedOperator.equals("+")) || (trimmedOperator.equals("-")) ||
                (trimmedOperator.equals("/")) || (trimmedOperator.equals("*")) || (trimmedOperator.equals("%"))) {
            return operator;
        } else {
            throw new InvalidInputException("You entered invalid operator...");
        }
    }

}
