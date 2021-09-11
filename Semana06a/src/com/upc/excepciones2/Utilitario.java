package com.upc.excepciones2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Utilitario {
    public static int dividir(int m, int n)  throws Exception{
        int divide;
        if (n==0){
            throw new Exception("no es posible dividir entre cero");
        }
        divide = m /n;
        return divide;
    }
}
