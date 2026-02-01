package cfs;

import genie.StringMethods;

public class MethodDemo {
    static void main(String[] args) {
        print();
        Utility m=new Utility();

        int a=30;
        int b=20;
        System.out.println(a+b);

        int c=10;
        int d=20;
        System.out.println(c+d);

        m.sum(a,b);
        m.sum(c,d);

       String res= m.stringAppend("Yash","Chopade"); 
        System.out.println(res);

        StringMethods stringMethods=new StringMethods();
        int sub = stringMethods.sub(10, 5);
        System.out.println(sub);


    }

    public static void print()
    {
        System.out.println("Code for Learn");
    }

}
