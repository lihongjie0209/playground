package cn.lihongjie.gof.state;

public class StopState implements State {
    @Override
    public void start(final Game game) {

        throw new RuntimeException("比赛已经结束了！！");
    }

    @Override
    public void stop(final Game game) {

        throw new RuntimeException("比赛已经结束了！！");
    }
}
