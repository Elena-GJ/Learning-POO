using System;
using System.Collections.Generic;

namespace Roman_to_Indian_nums
{

    public class RomanDecode
    {
        private static Dictionary<string, int> dictionary_roman_nums = new Dictionary<string, int>() { { "I", 1 }, { "V", 5 }, { "X", 10 }, { "L", 50 }, { "C", 100 }, { "D", 500 }, { "M", 1000 } };

        private static int Sumation(string roman)
        {
            int sumation = 0;
            foreach (char character in roman)
            {
                sumation += dictionary_roman_nums[character.ToString()];
            }
            return sumation;
        }
        private static int Substraction(string roman)
        {
            int substraction = 0;
            for (int i = 0; i < roman.Length - 1; i++)
            {
                if (roman[i] is 'C' & (roman[i + 1] is 'M' | roman[i + 1] is 'D'))
                {
                    substraction += 2 * dictionary_roman_nums["C"];
                }
                if (roman[i] is 'X' & (roman[i + 1] is 'C' | roman[i + 1] is 'L'))
                {
                    substraction += 2 * dictionary_roman_nums["X"];
                }
                if (roman[i] is 'I' & (roman[i + 1] is 'X' | roman[i + 1] is 'V'))
                {
                    substraction += 2 * dictionary_roman_nums["I"];
                }
            }
            return substraction;
        }
        public static int romanToIndian(string roman_num){
            return RomanDecode.Sumation(roman_num) - RomanDecode.Substraction(roman_num);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(RomanDecode.romanToIndian("MIII"));
        }
    }
}