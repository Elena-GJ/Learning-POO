using System;
using System.Collections.Generic;
using System.Linq;

namespace LINQ_test
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
            List<int> lista = new List<int>(array);
            lista = lista.Where(n => n % 2 == 0).ToList();
            string listaImprimible = lista.Select(n => n.ToString()).Aggregate("", (result, n) => n + ", " + result);
            listaImprimible = listaImprimible.Substring(0, listaImprimible.Length - 2);
            Console.WriteLine(listaImprimible);
        }
    }
}
