package com.company;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FibonacciSequence<T> extends Sequence<T>
{
    
    public FibonacciSequence(T endNumber)
    {
        this.startElement = 1;
        this.endElement = endNumber;
        this.elements = new ArrayList<>();
    }


    @Override
    public List<T> getElements() {
        return super.getElements();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void addElement(Object element)
    {
        super.addElement(element);
    }

    @Override
    protected void add(String toString) {

    }


    @Override
    public T generateList()
    {
        if (elements == null)
        {
            elements = new ArrayList();
        }
        elements.clear();
        addElement(1);
        addElement(1);
        while (true)
        {
            Object newItem =(Integer)  elements.get(elements.size() - 1) +(Integer)  elements.get(elements.size() - 2);
            if ((Integer)newItem <=(Integer) endElement)
                addElement(newItem);
            else break;
        }
        return (T) this;
    }
    public void display()
    {
        Sequence sequence= (Sequence) new FibonacciSequence(4000).generateList();
        Iterator iterator=sequence.getIterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+ " ");
        }
        //System.out.println(sequence);
    }
    public void EvenFibonacciPrint(Sequence sequence)
    {
        Iterator iterator=sequence.getIterator();
        while (iterator.hasNext())
        {
            Object object=iterator.next();
              if (new EvenNumberFilter().isAccepted(object))
            System.out.print(object+" ");
           // System.out.println("\n");
        }
    }
    /*public void removeOddFibonacciNumbers(Sequence sequence)
    {
        Iterator iterator=sequence.getIterator();
        int i=0;
        while(iterator.hasNext())
            {
            Object object=iterator.next();
            if (new OddNumberFilter().isAccepted(object))
            {
                System.out.println(new OddNumberFilter().isAccepted(object));
                iterator.remove();
            }

            }
        System.out.println(sequence);
    }
*/
    @Override
    public Sequence clone()
    {
        FibonacciSequence newSequence = new FibonacciSequence((Integer) endElement);
        newSequence.startElement = this.startElement;
        newSequence.elements = new ArrayList<>(this.elements);
        return newSequence;
    }

    @Override
    public Sequence addFilter() {
        return null;
    }


}
