package cn.lihongjie.gof.builder;

public class ComplexObjectBuilder {
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

    public ComplexObjectBuilder setPart1(final Object part1) {
        this.part1 = part1;
        return this;
    }

    public ComplexObjectBuilder setPart2(final Object part2) {
        this.part2 = part2;
        return this;
    }

    public ComplexObjectBuilder setPart3(final Object part3) {
        this.part3 = part3;
        return this;
    }

    public ComplexObjectBuilder setPart4(final Object part4) {
        this.part4 = part4;
        return this;
    }

    public ComplexObjectBuilder setPart5(final Object part5) {
        this.part5 = part5;
        return this;
    }

    public ComplexObjectBuilder setPart6(final Object part6) {
        this.part6 = part6;
        return this;
    }

    public ComplexObjectBuilder setPart7(final Object part7) {
        this.part7 = part7;
        return this;
    }

    public ComplexObjectBuilder setPart8(final Object part8) {
        this.part8 = part8;
        return this;
    }

    public ComplexObjectBuilder setPart9(final Object part9) {
        this.part9 = part9;
        return this;
    }

    public ComplexObjectBuilder setPart10(final Object part10) {
        this.part10 = part10;
        return this;
    }

    public ComplexObject createComplexObject() {
        return new ComplexObject(part1, part2, part3, part4, part5, part6, part7, part8, part9, part10);
    }
}