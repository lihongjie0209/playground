package cn.lihongjie.gof.cor;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{

    List<Filter> filters = new ArrayList<>();
    int index = 0;
    public FilterChain add(Filter filter) {

        filters.add(filter);
        return
        this;
    }


    @Override
    public void doFilter(final Request request,
                         final FilterChain chain) {


        filters.get(index++).doFilter(request, chain);

    }


}
