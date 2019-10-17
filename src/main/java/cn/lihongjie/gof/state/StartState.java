package cn.lihongjie.gof.state;

public class StartState implements State {
    @Override
    public void start(final Game game) {

        throw new RuntimeException("比赛已经开始");
    }

    @Override
    public void stop(final Game game) {

        game.state = new StartState();
    }
}
