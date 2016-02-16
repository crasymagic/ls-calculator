package com.example.leo.app1;

/**
 * Created by leo on 15/02/2016.
 */
public class Operations {
    //region SIMPLE OPS
    public static int addition(int x, int y)
    {
        return x+y;
    }
    public static int less(int x, int y)
    {
        return x-y;
    }
    public static int multiplication(int x, int y)
    {
        return x*y;
    }
    public static int division(int x, int y)
    {
        return x/y;
    }
    public static int power_of_y(int x, int n) {
        int tmp_x = x;
        while(n != 1)
        {
            tmp_x *= x;
            n--;
        }
        return tmp_x;
    }
    public static int modulo(int x, int y)
    {
        return x%y;
    }
    //endregion

    //region ECONOMIC
    public static float TVA_20(float x)
    {
        return x-(x*20/100);
    }
    //endregion
}
