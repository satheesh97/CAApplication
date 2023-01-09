package com.ExpectedData;

import java.util.Scanner;

public class QADemo {
    public static void main(String arg[]){
        //if condition
        // ui contion 10
        String phone ="13423435544";
        Scanner scan = new Scanner(System.in) ;
       /* String home_Phone =scan.next();
        if(home_Phone.length()>=7 && home_Phone.length()<10 ){
            System.out.println("Expected reslut");
        }else{
            System.out.println("Invalid data");
        }

        if(true){
            System.out.println("Hi i am if 1");
            if(!true){//-->false
                System.out.println("Hi i am false Statement ");//log1()!!=t
                //if
            }else{
                System.out.println("Hi i am true Statement ");
            }

        }else{
            System.out.println("Hi i am else 1");
        }*/

        //************************while Loop
       /* int count =1;
        int subCount=2;

        while(count <=8){
            while(subCount<=7){
                System.out.println("Hi i am Sub count"+ subCount);
                subCount++;
            }
            count++;
        }*/
//nested if

        //*******for loop
        int [] arr ={1,3,4,5,6};
        int count =0;

      /*  for(int i=0;i<=arr.length;i++){
            count= count+arr[i];
            System.out.println("i am  For lopp  "+ count);
        }*/
        do{
            System.out.println("this is Do while "+ count);
            count++;
        }while (count<=4);

    }
}
