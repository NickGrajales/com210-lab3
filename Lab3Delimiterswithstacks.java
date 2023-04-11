
package lab3delimiterswithstacks;
import java.util.Scanner;

public class Lab3Delimiterswithstacks 
{//start class
    public static int maxSize; //size of stack array
    public static char[] stack; //stack
    public static int top; //top of stack
           
    public static void main(String[] args)
    {//start main
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphanumeric/symbols plaintext with parentheses as a delimiter");
        String input = sc.nextLine();
        maxSize = input.length();
        stack = new char[maxSize];
        top = -1; //no items yet
       
        if(isBalanced(input))
        {
            System.out.println("The parentheses in your input: " + input + "  are balanced");

        }
        else
        {
            System.out.println("The parentheses in your input: " + input + "  are not balanced");
        }
    }//end main
   
    public static void push(char parenthesis) //puts parenthesis on top of stack
    {//start push method
            stack[++top] = parenthesis; //increment top, insert item
    }//end push method
   
    public static void pop()
    {//start pop method
            top--;
    }//end pop method
   
    public static boolean isEmpty() //true if stack is empty
    {
        return (top == -1);
    }
   
    public static boolean isBalanced(String input)
    {//start isBalanced method
        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
           
            if(c == '(')
            {
                push(c);
            }
            else if (c == ')')
            {
                if(isEmpty())
                {
                    return false;
                }
                pop();
            }
        }
        return isEmpty();
    }//end isBalanced method
}//end class
