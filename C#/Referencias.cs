using System;
using System.Collections.Generic;
using System.Linq;

namespace LINQ_test
{
    class Program
    {
        static void Main(string[] args)
        {
            TiposDeVariables();
        }

        #region TiposDeVariables

        // Tipos de Variables
        static void TiposDeVariables()
        {
            // Hay 2 tipos de variables, tipo valor y tipo referenciado
            // https://www.tutorialsteacher.com/csharp/csharp-data-types
            // https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/language-specification/conversions

            // Como declarar una variable de tipo valor
            int numero = 3;

            // Declarar varias variables en una linea
            int numero1, numero2, numero3 = 4;

            // Como declarar un array
            // Tipo[] nombre = new Tipo[NumeroElementos];
            int[] arrayNumeros = new int[3];

            // Como declarar un array con elementos
            int[] arrayConElementos = new int[] { 1, 2, 3 };

            // Como declarar una variable de tipo referenciado
            // Tipo nombre = new Tipo();
            List<int> lista = new List<int>();

            // Como declarar una lista con elementos
            List<int> listaConElementos = new List<int> { 1, 2, 3 };

            // Como meter un elemento en una lista
            lista.Add(3);
            lista.RemoveAt(2);
        }

        // Como declarar una clase
        class Monster
        {
            // Esto es un atributo
            private int aserga;

            // Esto es una Property, se diferencia de un atributo porque tiene unos metodos de acceso get y de modificacion set
            public int LifePoints { get; set; }

            // Esto es un metodo
            public void Daño()
            {
                if (LifePoints > 0)
                {
                    LifePoints--;
                }
            }
        }

        static void Conversiones()
        {

        }

        #endregion
    }


}
