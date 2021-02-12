package com.simon.input;

import java.util.Scanner;

public class ConsoleInput implements Input {

    @Override
    public String input() {
        Scanner scan = new Scanner(System.in);
        String value = scan.next();

        return value;
    }
}

