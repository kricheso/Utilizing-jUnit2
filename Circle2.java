//USE THIS TO IMPORT MATH
import java.lang.*;

public class Circle2 extends Circle
{

public Circle2(double x, double y, double radius)
{
    //THIS IS WRONG
    //super(y,x,radius);
    super(x,y,radius);
}

public boolean intersects(Circle other)
{
   double d;
   d = Math.sqrt(Math.pow(center.x - other.center.x, 2) + 
                 Math.pow(center.y - other.center.y, 2));
   if (d < radius)
      return true;
   else
      return false;
}

}

