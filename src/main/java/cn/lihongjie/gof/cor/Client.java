package cn.lihongjie.gof.cor;

public class Client {


    public static void main(String[] args) {


        FilterChain filterChain = new FilterChain();


        filterChain.add((req, chain) -> {
            System.out.println("filter1 run");
            chain.doFilter(req, chain);
            System.out.println("filter1 finish");

        }).add((req, chain) -> {
            System.out.println("filter2 run");
            chain.doFilter(req, chain);
            System.out.println("filter2 finish");

        }).add((req, chain) -> {
            System.out.println("filter3 run");
            System.out.println("filter3 finish");

        });



        filterChain.doFilter(new Request(), filterChain);




    }
}
