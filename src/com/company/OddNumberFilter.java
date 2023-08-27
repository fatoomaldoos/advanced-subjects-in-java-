package com.company;

public class OddNumberFilter extends IFilter
{
    @Override
    public boolean isAccepted(Object object)
    {
        return (int) object % 2 != 0;
    }
}
