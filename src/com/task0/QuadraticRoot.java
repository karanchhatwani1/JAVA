package com.task0;

public class QuadraticRoot {
    public static void main(String[] args) {
        /*Let us suppose we are given a quadratic equation ax^2+bx+c
          then we first calculate the value of determinant which is
          equal to b^2-4ac
          if determinant > 0 then,
             first root = (-b + sqrt(determinant))/(2*a)
             second root = (-b - sqrt(determinant))/(2*a)
          if determinant < 0 then,
             real root = -b/(2*a)
             imaginary root = sqrt(-determinant)/(2*a)
          if determinant = 0
             first root = second root = -b/(2*a)
         */
        int a=2,b=5,c=6;
        double r1,r2; //r1,r2 are roots of equation
        double determinant = b*b - 4*a*c;

        if(determinant == 0){
            r1 = r2 = -b/(2*a);
            System.out.println("first root is : "+r1);
            System.out.println("second root is : "+r2);
        }
        else if(determinant > 0){
            r1 = (-b + Math.sqrt(determinant))/(2*a);
            r2 = (-b - Math.sqrt(determinant))/(2*a);
            System.out.println("first root is : "+r1);
            System.out.println("second root is : "+r2);
        }
        else{
            double real = -b/(2*a);
            double imaginary = Math.sqrt(-determinant)/(2*a);
            System.out.println("real root is : "+real);
            System.out.println("imaginary root is : "+imaginary);

        }
    }
}
