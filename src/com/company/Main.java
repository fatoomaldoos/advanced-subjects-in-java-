package com.company;
public class Main <T>{


    public static void main(String[] args)
    {


        FibonacciSequence fibonacciSequence=new FibonacciSequence(4000);

        System.out.println("print fibonacci sequence using Iterator:");
        fibonacciSequence.display();
        System.out.println();
        System.out.println("print Even fibonacci sequence using Filter and Iterator:");
        fibonacciSequence.EvenFibonacciPrint( (Sequence) new FibonacciSequence(4000).generateList());
        System.out.println();
        System.out.println("generate another sequence using Iterator: ");
        GeneralSequance generalSequance=new GeneralSequance();
       Object object=(Sequence) generalSequance.generateList();
        generalSequance.displaySequence((Sequence) object);
        System.out.println("\n"+"Count times of appearing number 5:");
        System.out.print("Five number appeared :");
        System.out.print(generalSequance.howManyTimeForNumber(5,(Sequence) object));
    }

}
