package cn.lihongjie.gof.flyweight;

import java.util.HashMap;

/**
 * 封装对象的创建过程， 提供缓存功能， 使用场景是 大量小对象 + 不可变对象
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}