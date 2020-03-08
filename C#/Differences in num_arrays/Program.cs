using System;
using System.Collections.Generic;
using System.Linq;

namespace Differences_in_num_arrays
{
    public class Kata
    {
        public static int[] ArrayDiff(int[] a, int[] b)
        {
            // List to return
            List<int> resultado = a.OfType<int>().ToList();

            // You run though all the elements in a
            foreach (int number in a)
            {
                // You run thorugh all the elements in b
                foreach (int integer in b)
                {
                    // If the element in a is the same as the element in b, remove the element in a
                    if (number == integer) 
                    {
                        int length_resultado = resultado.Count(); 
                        for(int i = 1; i <= length_resultado; i++)
                        {
                            resultado.RemoveAll(n => n == number);
                        }
                    }
                }
            }
            // Return a
            return resultado.ToArray();
        }

        public static string ImprimirResultado(int[] a)
        {
            string resultados = "";
            // You run though all the elements in a
            foreach (int number in a)
            {
                resultados += number;
            }
            return resultados;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            int[] aserga = Kata.ArrayDiff(new int[] { 2, 3, 4 }, new int[] { 1, 2 });
            Console.WriteLine(Kata.ImprimirResultado(aserga));
        }
    }
}
