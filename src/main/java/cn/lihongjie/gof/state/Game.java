package cn.lihongjie.gof.state;

public class Game {

    State state;

    public Game() {

        this.state = new InitState();
    }

    public void start() {



        state.start(this);

    }



    public void stop() {

        state.stop(this);
    }


    public static void main(String[] args) {


        Game game = new Game();

        game.start();
        game.stop();

    }
}
