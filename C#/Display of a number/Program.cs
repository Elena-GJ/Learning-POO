using System;

/*12. Write a C# program to that takes a number as input and display it four
times in a row (separated by blank spaces), and then four times in the next 
row, with no separation. You should do it two times: Use Console*/
namespace Display_of_a_number
{
    public class Function
    {
        public static string StringChanger(int number, string spaces)
        {
            string num_string = "";
            for (int i = 1; i <= 4; i++)
            {
                if (spaces == "YES" & i < 4)
                {
                    num_string += number.ToString() + " ";
                }
                else
                {
                    num_string += number.ToString();
                }
            }
            return num_string;
        }


    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write(Function.StringChanger(2,"YES"));
            Console.WriteLine();
            Console.Write(Function.StringChanger(2,"NO"));
        }
    }
}
