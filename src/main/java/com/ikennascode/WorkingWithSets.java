package com.ikennascode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("white"));
        balls.remove(new Ball("red"));

        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }
            static class Ball{
            String color;
                public Ball (String color){
                this.color = color;
            }


                @Override
                public boolean equals(Object obj) {
                    if (this == obj) return true;
                    if (obj == null || getClass() != obj.getClass()) return false;
                    Ball ball = (Ball) obj;
                    return Objects.equals(color, ball.color);
                }

                @Override
                public int hashCode() {
                    return Objects.hash(color);
                }

                @Override
                public String toString() {
                    return "Ball{" +
                            "color='" + color + '\'' +
                            '}';
                }
            }
}
