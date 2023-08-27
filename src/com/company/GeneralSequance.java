package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class GeneralSequance<T> extends Sequence
{
    private Scanner scanner;
    GeneralSequance()
    {
        scanner=new Scanner(System.in);
                this.elements = new ArrayList<>();
    }
    @Override
    public Object generateList()
    {
        System.out.println("enter the number of elements: ");
        int n=scanner.nextInt();
        int x=0;
        for (int i=0;i<=n;i++)
        {
            x=scanner.nextInt();
            elements.add(x);
        }

        return this;
    }
    public void displaySequence(Sequence sequence)
    {
        Iterator iterator=sequence.getIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
    }
    public int howManyTimeForNumber(int number, Sequence sequence)
    {
        int count=0;
        Iterator iterator=sequence.getIterator();
        while (iterator.hasNext())
        {
            if ((int)iterator.next()==number)
                count++;
        }
        //System.out.println("fatoom");
        return count;
    }

    @Override
    public Sequence clone() {
        return null;
    }

    @Override
    protected void add(String toString) {

    }

    @Override
    public Sequence addFilter() {
        return null;
    }
}
