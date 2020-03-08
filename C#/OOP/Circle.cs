using System;

namespace Objects
{
    class Circle
    {
        private double radius;
        private string color;
        public Circle(){
            radius = 1.0;
            color = "red";
        }
        public Circle(double radius){
            this.radius = radius;
        }
        public double GetRadius(){
            return radius;
        }
        public double GetArea(){
            return 2*Math.PI*(radius*radius);
        }
    }
}
