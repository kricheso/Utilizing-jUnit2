
/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;
    
   //WE NEED A NEW TO MAKE A NEW OBJECT TO TEST THIS
    private Circle1 testCircle;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
   //ADDED THIS:
   testCircle = new Circle1(2,4,6);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
    System.out.println(p.x + " " + p.y);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}
    
    
//WE NEED TO TEST THE INTERSECTIONS:
@Test
public void testIntersects()
{
    System.out.println("Running test testIntersect.");
    Assert.assertTrue(circle1.intersects(testCircle));
}
    
//WE NEED TO TEST A SCALE
@Test
public void testScale()
{
    double r = 2;
    r = circle1.scale(r);
    Assert.assertTrue(r == 6);
}

    
//WE NEED TO TEST A MOVE THAT IS 0:
@Test
public void testMoveZero()
{
    Point p;
    p = circle1.moveBy(0,0);
    Assert.assertTrue(p.x == 1 && p.y == 2);
}

    

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

