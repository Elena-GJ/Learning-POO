using System;

namespace CodeTestsforKatas
{
    public class Kata
    {
        public static string[] TowerBuilder(int nFloors)
        {
            // Initiate the array of strings
            string[] pyramid = new string[nFloors];
            // Initiate the base of the pyramid
            string pyramid_level = "";
            int base_asterisc = 2 * (nFloors - 1) + 1;
            for (int i = 1; i <= base_asterisc; i++)
            {
                pyramid_level += "*";
            }
            // Store it on the array of strings
            pyramid[nFloors - 1] = pyramid_level;
            // Do the rest of the levels
            // For each level, from the first to the total levels minus 1
            for (int j = 0; j <= nFloors - 2; j++)
            {
                // Copy the string of the previous level
                pyramid_level = pyramid[nFloors - 1 -j];
                // Determine the first and last position to change "*" by " "
                int last_position = base_asterisc - 1 - j;
                // Change it at the copy of the string
                pyramid_level = pyramid_level.Remove(j, 1).Insert(j, " ");
                pyramid_level = pyramid_level.Remove(last_position, 1).Insert(last_position, " ");
                // Store the result at the adequate position in the array of strings
                pyramid[nFloors-2-j] = pyramid_level;
                // Return the result
            }
            return pyramid;
        }

        public static string ImprimirLista(string[] array)
        {
            string resultados = "";
            foreach (string element in array)
            {
                resultados += element;
            }
            return resultados;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            string[] result = Kata.TowerBuilder(5);
            Console.WriteLine(Kata.ImprimirLista(result));
        }
    }
}
