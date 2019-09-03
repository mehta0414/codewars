import Challenges.Challenge1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Challenge1Test {

    @Test(priority = 1)
    public void test1() {
        Assert.assertEquals("abcdefklmopqwxy", Challenge1.longest1("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    @Test(priority = 2)
    public void test2() {
        Assert.assertEquals("aehrsty", Challenge1.longest1("aretheyhere", "yestheyarehere"));
    }

    @Test(priority = 3)
    public void test3() {
        Assert.assertEquals("abcdefklmopqwxy", Challenge1.longest2("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    @Test(priority = 4)
    public void test4() {
        Assert.assertEquals("aehrsty", Challenge1.longest2("aretheyhere", "yestheyarehere"));
    }

    @Test(priority = 5)
    public void test5() {
        Assert.assertEquals("abcdefklmopqwxy", Challenge1.longest3("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    @Test(priority = 6)
    public void test6() {
        Assert.assertEquals("aehrsty", Challenge1.longest3("aretheyhere", "yestheyarehere"));
    }

    @Test(priority = 7)
    public void test7() {
        Assert.assertEquals("abcdefklmopqwxy", Challenge1.longest4("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    @Test(priority = 8)
    public void test8() {
        Assert.assertEquals("aehrsty", Challenge1.longest4("aretheyhere", "yestheyarehere"));
    }

    @Test(priority = 9)
    public void test9() {
        Assert.assertEquals("abcdefklmopqwxy", Challenge1.longest5("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    @Test(priority = 10)
    public void test10() {
        Assert.assertEquals("aehrsty", Challenge1.longest5("aretheyhere", "yestheyarehere"));
    }

    @Test(priority = 11)
    public void test11() {
        Assert.assertEquals("abcdefklmopqwxy", Challenge1.longest6("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    @Test(priority = 12)
    public void test12() {
        Assert.assertEquals("aehrsty", Challenge1.longest6("aretheyhere", "yestheyarehere"));
    }

    @Test(priority = 13)
    public void test13() {
        Assert.assertEquals("abcdefklmopqwxy", Challenge1.longest7("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    @Test(priority = 14)
    public void test14() {
        Assert.assertEquals("aehrsty", Challenge1.longest7("aretheyhere", "yestheyarehere"));
    }

}
