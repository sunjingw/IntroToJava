package Chapter13.Chapter13_06;

import java.util.*;

public class Circle {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

    }
