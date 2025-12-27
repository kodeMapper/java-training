package modularProgramming;

public class Interface {
    public static void main(String[] args) {
        message m = () -> "Hello";
        System.out.println(m.print());
    }
}

interface message {
    String print();
}


/*
    1. lamba to convert a string to uppercase and lowercase
    2. To find maximum of 2 numbers, create lambda function
    3. input num --> num*2 using lambda function
 */