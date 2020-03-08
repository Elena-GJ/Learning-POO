using System;
using System.Collections.Generic;

//using System;

/*namespace C_
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }
    }

} */

/*namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            var c1 = new MyClass();
            Console.WriteLine($"Hello World! {c1.ReturnMessage()}");
        }
    }
}
*/

public static class Kata
{
    public static List<string> TowerBuilder(int nFloors)
    {
        string[] cadena = new string[nFloors];
        List<string> fill = new List<string>();
        int base_num = 2 * (nFloors - 1) + 1;
        // Fill of first line
        for (int j = 1; j <= base_num; j++)
        {
            fill.Add("*");
        }
        // Change it to string
        cadena[nFloors - 1] = ImprimirLista(fill); // '* por nFloors'
        
        // Complete the rest of levels of the pyramid
        for (int i = 0; i < nFloors - 1; i++)
        {
            int final_position = base_num - 1 - i;
            fill[i] = " ";
            fill[final_position] = " ";
            cadena[nFloors - 1 - i] = fill[i];
        }
        return fill;
    }
    
    public static string ImprimirLista(List<string> lista)
    {
        string resultados = "";
        foreach(string element in lista)
        {
            resultados += element;
        }
        return resultados;
    }
}


public class Program
{
    static void Main()
    {
        List<string> a = Kata.TowerBuilder(3);
        Console.WriteLine(Kata.ImprimirLista(a));
    }
}
