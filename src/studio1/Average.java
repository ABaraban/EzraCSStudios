package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("What's the first number to be averaged?");
        int n2 = ap.nextInt("What's your second number to be averaged");
        double solution = (n1 + n2)/ (double) 2;
        System.out.println(solution);
    }
}
