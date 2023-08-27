package com.company;

public class EvenNumberFilter extends IFilter {

    @Override
    public boolean isAccepted(Object object)
    {
        return (int) object % 2 == 0;
    }
}
