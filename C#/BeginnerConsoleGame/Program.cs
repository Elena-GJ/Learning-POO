using System;

namespace BeginnerConsoleGame
{
    class Program
    {
        static void Main(string[] args)
        {
            Monster cyclop = new Monster()
            {
                Type = "Cyclop",
                HitPoints = 20,
                Attack = 0.5,
                Defense = 0.1,
                Armor = 10,
                Damage = 15
            };
            Player player = new Player()
            {
                Name = "Jelka",
                HitPoints = 25,
                Attack = 0.5,
                Defense = 0.1,
                Armor = 10,
                Damage = 15
            };

            Console.WriteLine($"Monster: {cyclop.Type}, {cyclop.HitPoints} HP");
            Console.WriteLine($"Player: {player.Name}, {player.HitPoints} HP");

            Console.WriteLine("Player attacks monster");
            Combat.Attack(player, cyclop);

            Console.WriteLine($"Monster: {cyclop.Type}, {cyclop.HitPoints} HP");
            Console.WriteLine($"Player: {player.Name}, {player.HitPoints} HP");
        }
    }
    class Creature
    {
        public int HitPoints { get; set; }
        public double Attack { get; set; }
        public double Defense { get; set; }
        public int Armor { get; set; }
        public int Damage { get; set; }
    }
    class Monster : Creature
    {
        public string Type { get; set; }
    }
    class Player : Creature
    {
        public string Name { get; set; }
    }
    static class Combat
    {
        public static void Attack(Creature attacker, Creature defender)
        {
            defender.HitPoints--;
        }
    }
}

