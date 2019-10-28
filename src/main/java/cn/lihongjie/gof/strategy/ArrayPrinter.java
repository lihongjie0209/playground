package cn.lihongjie.gof.strategy;

import java.util.List;

public class ArrayPrinter {



    interface DataProcessor<F, T>{

        T process(F from);


    }

    // 逻辑抽离 + 逻辑传入
    public <F, T> void print(List<F> data,
                             DataProcessor<F, T> processor) {



        data.stream().map(processor::process).forEach(System.out::println);

    }
}
