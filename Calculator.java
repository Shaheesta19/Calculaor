  import java.util.Scanner;
  public class Calculator{
        double num1,num2; //these variables are used to store input of two numbers
    Scanner scanner = new Scanner(System.in);
    public void getValues(){   // this function will take values from user
        
        System.out.println("Enter two numbers:");
        num1=scanner.nextDouble();
        num2=scanner.nextDouble();
    }
     // this function will add the numbers and return it
    public double add(){
        getValues();
       return num1+num2;
    }
    // it will subtract the numbers and return result
    public double subtract(){
            getValues();
            return(num1-num2);
       }
       // this function will multiply the numbers
      public double multiply(){
        getValues();
        return(num1*num2);
       }
       //this function will give result after division
      public double divide(){
        getValues();

          if(num2==0)  {     //this block of code will handle error of division by zero  
            System.out.println("Error: Division by zero!");
            System.exit(0);
         }
        
            return num1/num2;   
   }
    

 public static void main(String s[]){
       
    Calculator cal=new Calculator(); //here we have made the object of class calculator by which we call the desired function
        while (true) {
            
            System.out.println("\nOperation Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
             Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                     
                    System.out.println("your result is:"+cal.add());
                    break;

                case 2:
                     
                    System.out.println("your result is:"+cal.subtract());
                     break;
                case 3:
                      
                    System.out.println("your result is:"+cal.multiply());
                     break;
                case 4:
                      
                    System.out.println("Your result is:"+cal.divide());
                    break;
                case 5: //it will exit the coder
                      scanner.close();
                      System.exit(0);
                      
                default: //it will handle error if user will enter wrong choice
                   System.out.println("Invalid Choice!");
                   
                     
            }

    }
}
}
