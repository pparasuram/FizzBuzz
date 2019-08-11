package edu.cscc;

public class FizzBuzz {

    int number;

    public FizzBuzz(int number) {
        this.number = number;
    }
    public String doFizzBuzz(){
        if (number % 3 == 0 & number % 5 == 0)
            return "fizz buzz";
        else
            if (number % 5 == 0)
                return "buzz";
            else
                if (number % 3 == 0)
                    return "fizz";
                else
                    return Integer.toString(number);
    }
}
