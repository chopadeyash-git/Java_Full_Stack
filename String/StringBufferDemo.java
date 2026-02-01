package cfs;

public class StringBufferDemo {

    static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Yash");
        sb.append(" cfl");

        System.out.println(sb);

        StringBuilder builder=new StringBuilder("cfl");
        builder.append(" code for Learn");
        System.out.printf(builder.toString());
    }
}
