using System;
using Objects;

namespace ProgramMain{
    class Program
    {
        static void Main(string[] args)
        {
            Circle circulo1 = new Circle();
            Console.WriteLine("The circle has a radius of " + circulo1.GetRadius() +
            " cm and an area of " + circulo1.GetArea() + " cm2");
        }
    }
}
