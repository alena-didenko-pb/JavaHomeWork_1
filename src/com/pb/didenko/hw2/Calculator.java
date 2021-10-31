package com.pb.didenko.hw2;

import java.util.Scanner;

public class Calculator {static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int operand1 = nextInt();
        int operand2 = nextInt();
        char sing = getsing();
        int res = calc(operand1,operand2,sing);
        System.out.println("Результат = "+res);


    }

    public static int nextInt(){
        System.out.println("Введите число.");
        int operand;
        if(scan.hasNextInt()){
            operand = scan.nextInt();
        } else {
            System.out.println("Ошибка ввода, введены не числа");
            scan.next();
            operand = nextInt();
        }
        return operand;
    }

    public static char getsing(){
        System.out.println("Введите операцию.");
        char sing;
        if(scan.hasNext()){
            sing = scan.next().charAt(0);
        } else {
            System.out.println("Ошибка ввода");
            scan.next();
            sing = getsing();
        }
        return sing;
    }

    public static int calc(int operand1, int operand2, char sing){
        int res;
        if(sing=='+'){
            res = operand1+operand2;
        }else if(sing=='-'){
            res = operand1-operand2;
        }else if(sing=='*'){
            res = operand1*operand2;
        }else if(sing=='/'){
            if(operand2 == 0){
                System.out.println("На 0 делить нельзя");
                calc(operand1, operand2, getsing());
            }
            res = operand1/operand2;
        }else{
            System.out.println("Введены не математические операторы");
            res = calc(operand1, operand2, getsing());
        }
        return res;
    }

}
