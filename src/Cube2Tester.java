import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Cube2Tester {

    @Test
    public void TestNoArgumentConstructorNoException() {
        Cube2 cube = new Cube2();
        assertTrue(cube.getSide() == 1, "Ensure that your no argument constructor has been implemented correctly!");
    }

    @Test
    public void TestSingleArgumentConstructorNoException() {
        Cube2 cube = new Cube2(5);
        assertTrue(cube.getSide() == 5, "Ensure that your single argument constructor has been implemented correctly!");
    }

    @Test
    public void TestSingleArgumentConstructorNegative() {
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ new Cube2(-1);});
    }

    @Test
    public void TestSingleArgumentConstructorZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ new Cube2(0);});
    }

    @Test
    public void TestSetter() {
        Cube2 cube = new Cube2(5);
        cube.setSide(7);
        assertTrue(cube.getSide() == 7, "Ensure that your setter method has been implemented correctly!");
    }

    @Test
    public void TestSetterNegative() {
        Cube2 cube = new Cube2(5);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube.setSide(-1);});
    }

    @Test
    public void TestSetterZero() {
        Cube2 cube = new Cube2(5);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube.setSide(0);});
    }

    @Test
    public void TestVolume() {
        Cube2 cube = new Cube2(5);
        int volume = cube.calculateVolume();
        assertTrue(volume == 125, "Ensure that your calculateVolume method has been implemented correctly!");
    }

    @Test
    public void TestVolumeTwo() {
        Cube2 cube = new Cube2(7);
        int volume = cube.calculateVolume();
        assertTrue(volume == 343, "Ensure that your calculateVolume method has been implemented correctly!");
    }

    @Test
    public void TestSurfaceArea() {
        Cube2 cube = new Cube2(5);
        int surfaceArea = cube.calculateSurfaceArea();
        assertTrue(surfaceArea == 150, "Ensure that your calculateSurfaceArea method has been implemented correctly!");
    }

    @Test
    public void TestSurfaceAreaTwo() {
        Cube2 cube = new Cube2(7);
        int surfaceArea = cube.calculateSurfaceArea();
        assertTrue(surfaceArea == 294, "Ensure that your calculateSurfaceArea method has been implemented correctly!");
    }

    @Test
    public void TestToString() {
        Cube2 cube = new Cube2(5);
        String cubeString = cube.toString();
        assertTrue(cubeString.equals("Cube{side=5, color=\"black\"}"), "Ensure that your toString method has been implemented correctly!");
    }
    @Test
    public void TestToString2() {
        Cube2 cube = new Cube2(6, "yellow");
        String cubeString = cube.toString();
        assertTrue(cubeString.equals("Cube{side=6, color=\"yellow\"}"), "Ensure that your toString method has been implemented correctly!");
    }

    @Test
    public void TestAdd() {
        Cube2 cube1 = new Cube2(5);
        Cube2 cube2 = new Cube2(12);
        Cube2 cube3 = cube1.add(cube2);
        assertTrue(cube3.getSide() == 13, "Ensure that your add method has been implemented correctly!");
    }
    @Test
    public void TestAdd2() {
        Cube2 cube1 = new Cube2(5);
        Cube2 cube2 = new Cube2(11);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube1.add(cube2);});
    }


    @Test
    public void TestMinus() {
        Cube2 cube1 = new Cube2(5);
        Cube2 cube2 = new Cube2(13);
        Cube2 cube3 = cube2.minus(cube1);
        assertTrue(cube3.getSide() == 12, "Ensure that your minus method has been implemented correctly!");
    }
    @Test
    public void TestMinus2() {
        Cube2 cube1 = new Cube2(5);
        Cube2 cube2 = new Cube2(11);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube2.minus(cube1);});
    }

}
