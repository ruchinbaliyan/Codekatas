package Diversion15;

public class Diversion {
        static int findNumber(int n)
        {
           return  Diversion.fib(n+2);
        }

        static int fib(int n)
        {
            if (n <= 1)
                return n;
            return fib(n - 1) + fib(n - 2);
        }


    }

