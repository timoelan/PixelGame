package ch.timo.physics;

public class Physics {
   public static double parabolicThrowing(int x ,int v0, int angle){
       double y = -(9.81/(2*v0*v0*Math.cos(Math.toRadians(angle))*Math.cos(Math.toRadians(angle))))*x*x+Math.tan(Math.toRadians(angle))*x;

       return y;
    }

}
