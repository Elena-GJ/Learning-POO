using System;
using System.Collections.Generic;
using System.Linq;

namespace ResumenCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            TiposDeVariables();
        }

        // Tipos de Variables
        static void TiposDeVariables()
        {
            // Hay 2 tipos de variables, tipo valor y tipo referenciado
            // https://www.tutorialsteacher.com/csharp/csharp-data-types

            // Conversiones entre tipos
            // https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/language-specification/conversions

            // Convertir de string a int, vale para los demas tipos como double, etc.
            // https://www.tutorialsteacher.com/articles/convert-string-to-int

            // Como declarar una variable de tipo valor
            int numero = 3;

            // Declarar varias variables en una linea
            int numero1, numero2, numero3 = 4;

            // Se puede declarar una variable usando var para que el compilador infiera el tipo,
            // de esta manera te ahorras escribir el tipo pero la variable sigue teniendo un tipo concreto.
            var variable = "esta variable es un string";

            // Para evitar errores de tipo NullReferenceException puedes usar el operador .? para que en caso
            // de que una variable sea nula no acceda al atributo y pete sino que devuelva null
            List<int> listaNull = null;

            // Esta instruccion daria error de NullReferenceException porque listaNull tiene un valor null y no
            // se puede acceder a los atributos o metodos del objeto
            listaNull.Add(3);

            // Para evitar errores usa el operador .? que lo que hace es comprobar antes de acceder al atributo o metodo
            // si la variable tiene valor null y en tal caso devuelve null
            var listaCopia = listaNull?.First();

            // El operador .? te ahorra hacer un if para comprobar si la variable es null
            if (listaNull == null)
            {
                listaCopia = null;
            }
            else
            {
                listaCopia = listaNull.First();
            }

            // Como declarar una variable de tipo valor que pueda aceptar un valor nulo,
            // usas el simbolo ? detras del tipo para decir que esa variable es nulable
            bool? variableNulable = null;

            // Sin embargo para usarla en un if o para convertirla de nuevo en un bool no nulable
            // tienes que gestionarlo. Para ello usa HasValue que te dice si la variable tiene un valor distinto de null
            // y usa Value para coger el valor que tiene la variable si no tiene valor null
            bool variableBool = variableNulable.HasValue ? variableNulable.Value : false;

            // Puedes usar el operador ?? que lo que hace es devolver el valor que tenga la variable si es distinto de null
            // o en caso de que sea null devuelve el valor que pongas a la derecha de ??
            variableBool = variableNulable ?? false;

            // Como concatenar string
            string string1 = "aserga" + "bonita";

            // Como interpolar string, usando el simbolo $ delante de un string y usando llaves para insertar valores de variables
            string string2 = $"camaron {string1}";

            // Como agregar elementos en un string
            List<int> lista = new List<int> { 1, 2, 3 };
            string acumulador = "";
            foreach (int elemento in lista)
            {
                acumulador += elemento + ", ";
            }

            // Como coger una parte de un string
            acumulador = acumulador.Substring(0, acumulador.Length - 2);
        }

        static void Collecciones()
        {
            // https://www.tutorialsteacher.com/csharp/array-csharp
            // https://www.tutorialsteacher.com/csharp/csharp-list
            // https://www.tutorialsteacher.com/csharp/csharp-dictionary

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

            // Eliminar un elemento con un index concreto
            lista.RemoveAt(2);

            // Eliminar un elemento, mira en la documentacion si borra el primer elemento que coincide,
            // o borra todos los elementos que coinciden, etc
            lista.Remove(3);

            // Añadir un conjunto de elementos a una lista
            List<int> lista2 = new List<int>() { 7, 8, 9 };
            lista.AddRange(lista2);

            // Mirar si una lista contiene un elemento
            bool existElement = lista.Contains(3);
            existElement = lista.Exists(n => n == 3);

            // Metodos de LINQ
            // Los metodos de LINQ son accesibles para aquellas colecciones que implementen las interfaces IEnumerable o IQueryable
            // Los metodos de LINQ son accesibles importando el namespace: using System.Linq;
            // Hay que convertir a list con ToList() porque los metodos de LINQ devuelven IEnumerable
            // Cada lenguaje tiene sus propios metodos. En javascript son map, filter, some, etc. En Java esta la Stream API.

            // Filtrar una lista.
            lista2 = lista.Where(n => n % 2 == 0).ToList();

            // El metodo Map. Transformar los elementos de una lista.
            List<string> listaString = lista.Select(n => n.ToString()).ToList();

            // El metodo Aggregate de LINQ se conoce como metodo Reduce. Como reducir una lista. El primer argumento de Aggregate es el valor inicial
            // de la variable que hace de acumulador, el segundo argumento es una funcion lambda que recibe como 
            // parametro (acumulador, elemento) y su return es el valor que se le asigna al acumulador en esa iteracion.
            string listaImprimible = listaString.Aggregate("", (acumulador, elemento) => elemento + ", " + acumulador);
        }

        static void Conversiones()
        {

        }

        static void POO()
        {
            // Envolturas (wrapper)
            // https://www.tutorialsteacher.com/articles/boxing-unboxing-in-csharp
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

        static void TiposGenericos()
        {

        }

        static void Delegados()
        {

        }

        static void MetodosDeExtension()
        {

        }
    }
}
