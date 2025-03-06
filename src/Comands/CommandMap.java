package Comands;

import java.util.Map;

public class CommandMap {

    private static CommandMap instance;
    private Map<String,Command> map = Map.of("add",new Add());

    private CommandMap(){}

    public static CommandMap getInstance() {
        return instance==null? instance = new CommandMap() : instance;
    }

    public Command getCommand(String command){
        return map.get(command);
    }
}
