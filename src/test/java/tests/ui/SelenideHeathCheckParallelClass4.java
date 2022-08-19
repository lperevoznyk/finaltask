package tests.ui;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SelenideHeathCheckParallelClass4 extends BaseClassUiTest {

    @Test
    public void selenideTest1() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 1")
                .pressEnter();
        System.out.println("test 1");
    }

    @Test
    public void selenideTest2() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 2")
                .pressEnter();
        System.out.println("test 2");
    }

    @Test
    public void selenideTest3() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 3")
                .pressEnter();
        System.out.println("test 3");
    }

    @Test
    public void selenideTest4() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 4")
                .pressEnter();
        System.out.println("test 4");
    }

    @Test
    public void selenideTest5() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 5")
                .pressEnter();
        System.out.println("test 5");
    }

    @Test
    public void selenideTest6() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 6")
                .pressEnter();
        System.out.println("test 6");
    }

    @Test
    public void selenideTest7() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 7")
                .pressEnter();
        System.out.println("test 7");
    }

    @Test
    public void selenideTest8() {
        $("[name='q']")
                .shouldBe(visible)
                .setValue("Selenide 8")
                .pressEnter();
        System.out.println("test 8");
    }
}