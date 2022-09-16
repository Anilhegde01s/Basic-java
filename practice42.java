import java.util.*;

class practice42{
     
    public static void main(String args[]){
        
        int count=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number ");
        int a=sc.nextInt();

        for(int i=2; i<=a; i++){
            if(a%i==0){
               count++;
            }
            }
            if(count>1){
                System.out.println("its not a prime number");
            }else{
                System.out.println("its prime number");
            }
        
        
          
        

        


    }
}