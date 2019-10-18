package cn.lihongjie.gof.commnad;

import java.util.LinkedList;
import java.util.List;

public class Invoker {

    List<Command> history = new LinkedList<>();

    public void invoke(Command command) {


        command.exec();

        history.add(command);

    }
}
