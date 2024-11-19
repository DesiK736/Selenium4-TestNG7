package HW1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GeneralCounter {
    public String type;
    public String model;

    public GeneralCounter(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

class UltimateCounter extends GeneralCounter  {
    public UltimateCounter(String type, String model) {
        super(type, model);
    }

    @Override
    public int add(int a, int b) {
        System.out.println("Ultimate counter:  adding numbers");
        return super.add(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println("Ultimate counter:  subtracting numbers");
        return super.subtract(a, b);
    }

    public boolean isEven(int randomNum) {
        if(randomNum % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean getTheBoolean() {
        return false;
    }

    public boolean containsDigit(String word)  {
        if (word == null  ||  word.isEmpty())  {
            return false;
        }
        for (char ch :  word.toCharArray())  {
            if (Character.isDigit(ch))  {
                return true;
            }
        }
        return false;
    }
}


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UltimateCounterTest  {
//5 Tests, using assertEquals methods
    @Test
    public void testAdd()  {
        UltimateCounter counter = new UltimateCounter("ultra", "extreme");
        int result = counter.add(25, 15);
        Assert.assertEquals(40, 40);
    }

    @Test
    public void testSubtract()  {
        UltimateCounter counter = new UltimateCounter("ultra", "extreme");
        int result = counter.subtract(12, 5);
        Assert.assertEquals(5, 7);
    }

    @Test
    public void testAddGeneralCounter()  {
GeneralCounter counter = new UltimateCounter("ultra", "extreme");
int result = counter.add(45, 4);
Assert.assertEquals(50, 49);
    }

    @Test
    public void  testSubtractGeneralCounter()  {
        GeneralCounter counter = new UltimateCounter("ultra", "extreme");
        int result = counter.subtract(95, 15);
        Assert.assertEquals(80, 80);
    }

    @Test
    public void testNewSubtract()  {
        GeneralCounter counter = new UltimateCounter("ultra", "extreme");
        int result = counter.subtract(12, 11);
        Assert.assertEquals(1, 1);
    }
    //5 Tests, using assertFalse methods
    @Test
    public void testIsEven()  {
        int randomNum = 3;
        UltimateCounter counter = new UltimateCounter("ultra", "extreme");
        Assert.assertFalse(counter.isEven(randomNum));
    }

    @Test
    public void newTestIsEven()  {
        int oddNum = 4;
        UltimateCounter counter = new UltimateCounter("ultra", "extreme");
        Assert.assertFalse(counter.isEven(oddNum));
    }

    @Test
    public void getTheBoolean()  {
        UltimateCounter counter = new UltimateCounter("ultra", "extreme");
        Assert.assertFalse(counter.getTheBoolean());
    }

    @Test
    public void testContainsDigit() {
        UltimateCounter counter = new UltimateCounter("ultra", "extreme");
        String withoutDigits = "wonderful day";
        Assert.assertFalse(counter.containsDigit(withoutDigits));
    }

        @Test
        public void newTestContainsDigit()  {
        UltimateCounter counter1 = new UltimateCounter("ultra", "extreme");
        String emptyString = "";
        Assert.assertFalse(counter1.containsDigit(emptyString));
    }
    //5 Tests, using assertNotSame methods
    @Test
    public void testCompareObjects()  {
        GeneralCounter firstCounter = new GeneralCounter("basic", "classic");
        GeneralCounter secondCounter = new GeneralCounter("basic", "classic");
        Assert.assertNotSame(firstCounter, secondCounter); //GeneralCounter creates unique object instances, even with the same values, two instances won’t be identical.
    }

    @Test
    public void testCompareNewObjects()  {
        GeneralCounter nextObject1 = new GeneralCounter("silent", "brilliant");
        GeneralCounter nextObject2 = new GeneralCounter("silent", "brilliant");
        Assert.assertNotSame(nextObject1, nextObject2);
    }
    @Test
    public void testCompareNewObjects3()  {
        GeneralCounter nextObject3 = new GeneralCounter("vivid", "ultimate");
        GeneralCounter nextObject4 = new GeneralCounter("vivid", "ultimate");
        Assert.assertNotSame(nextObject3, nextObject4);
    }
    @Test
    public void testCompareNewObjects4()  {
        GeneralCounter newGen1 = new GeneralCounter("strong", "best version");
        GeneralCounter newGen2 = new GeneralCounter("strong", "best version");
        Assert.assertNotSame(newGen1, newGen2);
    }
    @Test
    public void testCompareNewObjects5()  {
        GeneralCounter lastVersion1 = new GeneralCounter("premium", "spectacular");
        GeneralCounter lastVersion2 = new GeneralCounter("premium", "spectacular");
        Assert.assertNotSame(lastVersion1, lastVersion2);
    }
    //5 Tests, using Soft Assert methods
    @Test
    public void testSoftAssertion1()  {
        UltimateCounter counter = new UltimateCounter("1", "extra");
        SoftAssert softAssertions = new SoftAssert();
        softAssertions.assertEquals(counter.subtract(15, 6) ,  5, "Subtraction failed");
        softAssertions.assertAll();
    }
    @Test
    public void testSoftAssertion2()  {
        UltimateCounter counter = new UltimateCounter("perfect", "solid");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(counter.add(2, 3), 5, "Addition correct");
        softAssert.assertAll();
    }
    @Test
    public void testSoftAssertions3()  {
        UltimateCounter counter = new UltimateCounter("2", "relevant");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(counter.add(5, 5), 11, "Addition failed");
        softAssert.assertAll();
    }
    @Test
    public void testSoftAssertions4()  {
        UltimateCounter counter = new UltimateCounter("private", "main class");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(counter.subtract(47, 12), 35, "Subtraction correct");
        softAssert.assertAll();
    }
    @Test
    public void testSoftAssertions5()  {
        UltimateCounter counter = new UltimateCounter("B", "expensive");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(counter.isEven(5), 4, "Not correct");
        softAssert.assertAll();
    }
}
