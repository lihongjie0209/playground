package cn.lihongjie.gof.cor;

public interface Filter {

    public void doFilter(Request request, FilterChain chain);
}
