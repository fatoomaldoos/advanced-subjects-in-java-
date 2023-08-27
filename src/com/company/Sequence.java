package com.company;
import java.util.ArrayList;
import java.util.List;
public abstract class Sequence<T> implements IFilterable<T> {
    protected List <T>elements=new ArrayList<T>();
    protected int startElement;
    protected T endElement;
    protected SequenceIterator sequenceIterator=new SequenceIterator();
    public abstract T generateList();
    public List<T> getElements()

    {
        return elements;
    }
    public abstract Sequence clone();
    @Override
    public String toString()
    {
        return elements.toString();
    }
    public void addElement(Object element)

    {
        elements.add((T) element);
    }

    protected abstract void add(String toString);
public Iterator getIterator()
{
    return new SequenceIterator();
}
    class SequenceIterator<T> implements Iterator
    {
        private int index =0;
        @Override
        public boolean hasNext()

        {
            return (elements != null && index<elements.size());
        }

        @Override
        public T next()
        {
            return (T) elements.get(this.index++);
        }
        @Override
        public void remove()
        {

            if (  !elements.isEmpty())
                elements.remove(index);
        }
    }
}
