package Catcher;

import Comands.CommandMap;
import Transfer.Request;
import Transfer.Response;

public class Executer {
    private static Executer instance;

    private Executer(){}

    public static Executer getInstance(){
        return instance == null ? instance=new Executer():instance;
    }

    public Response doRequest(Request req){
        return CommandMap.getInstance().getCommand(req.command()).execute(req);
    }


}
