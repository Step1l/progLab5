package Comands;

import java.util.Map;

public class CommandMap {

    private static CommandMap instance;



    private Map<String,Command> map = Map.of("add",new Add(),"exit", new Exit(),"show",new Show(),"help", new Help());

    private CommandMap(){}

    public static CommandMap getInstance() {
        return instance==null? instance = new CommandMap() : instance;
    }

    public Command getCommand(String s){
        return map.get(s);
    }
    @Override
    public String toString(){
        String s = "";
        for (String i : map.keySet()){
            s += i +":"+ map.get(i).getDescription()+"\n";
        }
        return s;
    }
}
