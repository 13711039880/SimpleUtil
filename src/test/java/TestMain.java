import org.a8043.simpleUtil.runnable.Parameter2Runnable;
import org.a8043.simpleUtil.util.ConsoleColor;
import org.a8043.simpleUtil.util.ListUtil;
import org.a8043.simpleUtil.util.ThreadUtil;
import org.a8043.simpleUtil.util.Timing;
import org.junit.Test;

import java.util.List;

public class TestMain {
    static {
        System.out.println("Start test");
    }

    @Test(timeout = 1100)
    public void sleep() {
        ThreadUtil.sleep(1000);
    }

    @Test
    public void coloringString() {
        System.out.println(ConsoleColor.coloring("Hello World", ConsoleColor.RED));
    }

    @Test
    public void randomElement() {
        String element = ListUtil.randomElement(List.of("a", "b", "c"));
        System.out.println(element);
    }

    @Test
    public void runTiming() {
        long time = Timing.runTime(new Parameter2Runnable<String, String>() {
            @Override
            public void run(String string1, String string2) {
                System.out.println(string1 + " " + string2);
            }
        }, "Hello", "World");

        System.out.println(time);
    }
}
