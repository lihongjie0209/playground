package cn.lihongjie.gof.state;

public class InitState implements State {
    @Override
    public void start(final Game game) {
        game.state = new StartState();
    }

    @Override
    public void stop(final Game game) {

        throw new RuntimeException("比赛还没开始");
    }
}
