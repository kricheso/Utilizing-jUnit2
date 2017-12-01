//USE THIS TO IMPORT ABSOLUTE VALUE
import java.lang.*;

public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{
   //SHOULD BE <= NOT <
   if (Math.abs(center.x - other.center.x) <= radius &&
       Math.abs(center.y - other.center.y) <= radius)
      return true;
   return false;
}

}

