package cn.lihongjie.gof.prototype;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        cn.lihongjie.gof.prototype.ComplexObject complexObject = new cn.lihongjie.gof.prototype.ComplexObject(1,
                2,
                10.00,
                0,
                1,
                " ddd",
                null,
                Arrays.asList(1, 2, 3),
                1,
                null);


        ComplexObject copy = complexObject.copy();




        List part8 = (List) copy.getPart8();

        part8.add(1);
        for (Object o : part8) {
            System.out.println(o);

        }

    }
}
