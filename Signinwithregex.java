
import java.util.Scanner;
import java.util.regex.*;


class Signinwithregex
{

      public static void main(String args[])
    
      {

           Scanner as=new Scanner(System.in);
           String username,pwd,mob;
           System.out.println("-.-.-.-.-.-Sign in Page-.-.-.-.-.-.-");
           System.out.println("Enter username : ");
           username=as.nextLine();
           System.out.println("Enter Password : ");
           pwd=as.nextLine();
           System.out.println("Enter Mobile number : ");
           mob=as.nextLine();

           if(Pattern.matches("[a-zA-Z@]{4,}",username))
           {
              if(Pattern.matches("[a-zA-Z0-9]{6,}",pwd))
                {
                   if(Pattern.matches("[0-9]{10}",mob))
                     {
                        if(pwd.equals("123456789"))
                          {
                             System.out.println("Sign in success");
                          }
                          else{
                                System.out.println("wrong password");
                              }
                }
                else{
                System.out.println("password is not valid");
                }
          }
          else{

                System.out.println("username is not valid");
             }
       }
   }



}
   

      
    






