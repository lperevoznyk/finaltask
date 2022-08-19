package tests.ui;

import org.testng.annotations.Test;
import utils.SomeConstants;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SelenideParallelMethod extends BaseMethodUiTest {

    @Test
    public void selenideTest1() throws InterruptedException {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 1")
                .pressEnter();
        SomeConstants.integerThreadLocal.set(1);
        SomeConstants.i = 1;
        Thread.sleep(1000);
        System.out.println("test 1 integerThreadLocal = '" + SomeConstants.integerThreadLocal.get() + "'");
        System.out.println("test 1 i = '" + SomeConstants.i + "'");
    }

    @Test
    public void selenideTest2() throws InterruptedException {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 2")
                .pressEnter();
        Thread.sleep(500);
        SomeConstants.integerThreadLocal.set(2);
        SomeConstants.i = 2;
        System.out.println("test 2 integerThreadLocal = '" + SomeConstants.integerThreadLocal.get() + "'");
        System.out.println("test 2 i = '" + SomeConstants.i + "'");
    }

    @Test
    public void selenideTest3() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 3")
                .pressEnter();
        SomeConstants.integerThreadLocal.set(3);
        SomeConstants.i = 3;
        System.out.println("test 3 integerThreadLocal = '" + SomeConstants.integerThreadLocal.get() + "'");
        System.out.println("test 3 i = '" + SomeConstants.i + "'");
    }

    @Test
    public void selenideTest4() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 4")
                .pressEnter();
        SomeConstants.integerThreadLocal.set(4);
        SomeConstants.i = 4;
        System.out.println("test 4 integerThreadLocal = '" + SomeConstants.integerThreadLocal.get() + "'");
        System.out.println("test 4 i = '" + SomeConstants.i + "'");
    }

    @Test
    public void selenideTest5() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 5")
                .pressEnter();
        SomeConstants.integerThreadLocal.set(5);
        SomeConstants.i = 5;
        System.out.println("test 5 integerThreadLocal = '" + SomeConstants.integerThreadLocal.get() + "'");
        System.out.println("test 5 i = '" + SomeConstants.i + "'");
    }

    @Test
    public void selenideTest6() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 6")
                .pressEnter();
        SomeConstants.integerThreadLocal.set(6);
        SomeConstants.i = 6;
        System.out.println("test 6 integerThreadLocal = '" + SomeConstants.integerThreadLocal.get() + "'");
        System.out.println("test 6 i = '" + SomeConstants.i + "'");
    }

    @Test
    public void selenideTest7() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 7")
                .pressEnter();
        SomeConstants.integerThreadLocal.set(7);
        SomeConstants.i = 7;
        System.out.println("test 7 integerThreadLocal = '" + SomeConstants.integerThreadLocal.get() + "'");
        System.out.println("test 7 i = '" + SomeConstants.i + "'");
    }

    @Test
    public void selenideTest8() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 8")
                .pressEnter();
        SomeConstants.integerThreadLocal.set(8);
        SomeConstants.i = 8;
        System.out.println("test 8 integerThreadLocal = '" + SomeConstants.integerThreadLocal.get() + "'");
        System.out.println("test 8 i = '" + SomeConstants.i + "'");
    }
}