package cn.lihongjie.gof.prototype;

public class ComplexObject implements ProtoType<ComplexObject>{


    private Object part1;
    private Object part2;
    private Object part3;
    private Object part4;
    private Object part5;
    private Object part6;
    private Object part7;
    private Object part8;
    private Object part9;
    private Object part10;

    public ComplexObject() {
    }

    public ComplexObject(final Object part1,
                         final Object part2,
                         final Object part3,
                         final Object part4,
                         final Object part5,
                         final Object part6,
                         final Object part7,
                         final Object part8,
                         final Object part9,
                         final Object part10) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
        this.part5 = part5;
        this.part6 = part6;
        this.part7 = part7;
        this.part8 = part8;
        this.part9 = part9;
        this.part10 = part10;
    }

    public Object getPart1() {
        return part1;
    }

    public void setPart1(final Object part1) {
        this.part1 = part1;
    }

    public Object getPart2() {
        return part2;
    }

    public void setPart2(final Object part2) {
        this.part2 = part2;
    }

    public Object getPart3() {
        return part3;
    }

    public void setPart3(final Object part3) {
        this.part3 = part3;
    }

    public Object getPart4() {
        return part4;
    }

    public void setPart4(final Object part4) {
        this.part4 = part4;
    }

    public Object getPart5() {
        return part5;
    }

    public void setPart5(final Object part5) {
        this.part5 = part5;
    }

    public Object getPart6() {
        return part6;
    }

    public void setPart6(final Object part6) {
        this.part6 = part6;
    }

    public Object getPart7() {
        return part7;
    }

    public void setPart7(final Object part7) {
        this.part7 = part7;
    }

    public Object getPart8() {
        return part8;
    }

    public void setPart8(final Object part8) {
        this.part8 = part8;
    }

    public Object getPart9() {
        return part9;
    }

    public void setPart9(final Object part9) {
        this.part9 = part9;
    }

    public Object getPart10() {
        return part10;
    }

    public void setPart10(final Object part10) {
        this.part10 = part10;
    }
}
