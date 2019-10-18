package cn.lihongjie.gof.commnad;

public class ACommand implements Command {

    private Action action;
    private Object p1;
    private Object p2;


    @Override
    public void exec() {

        action.doAction(p1, p2);

    }
}
