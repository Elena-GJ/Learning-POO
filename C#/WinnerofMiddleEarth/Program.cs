using System;

namespace WinnerofMiddleEarth
{
    using System;

    public class Kata
    {
        private static int[] goodBuddies = {1, 2, 3, 3, 4, 10};

        private static int[] badBuddies = {1, 2, 2, 2, 3, 5, 10};

        public static string GoodVsEvil(string good, string evil)
        {
            string [] componentsGoodBuddies = good.Split(" ");
            string [] componentsBadBuddies = evil.Split(" ");
            int pointsGoodBuddies = 0;
            int pointsBadBuddies = 0;
            for(int position = 0; position < componentsGoodBuddies.Length; position++)
            {
                pointsGoodBuddies += goodBuddies[position] * Int32.Parse(componentsGoodBuddies[position]);
                pointsBadBuddies += badBuddies[position] * Int32.Parse(componentsBadBuddies[position]);
            }
            // Add the wizards values to pointsBadBuddies
            pointsBadBuddies += badBuddies[componentsBadBuddies.Length-1] * Int32.Parse(componentsBadBuddies[componentsBadBuddies.Length-1]); 
            if(pointsBadBuddies > pointsGoodBuddies)
            {
                return "Battle Result: Evil eradicates all trace of Good";
            }
            else if (pointsBadBuddies < pointsGoodBuddies)
            {
                return "Battle Result: Good triumphs over Evil";
            }
            else
            {
                return "Battle Result: No victor on this battle field";
            }
        }
        public static string Print(string[] whateverHere)
        {
            string results = "";
            foreach(string thing in whateverHere)
            {
                results += thing + " ";
            }
            return results;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            string a = Kata.GoodVsEvil("1 1 100 1 1 1", "10 1 1 1 1 1 1");
            Console.WriteLine(a);
        }
    }
}
