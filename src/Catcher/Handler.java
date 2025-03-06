package Catcher;

import Comands.CommandMap;
import IO.Console;
import Models.Movie;
import Transfer.Request;

public class Handler {
    private Console console;

    public Handler (Console console){
        this.console = console;
    }

    public void run(){
        console.printMessage("Здарова меченый");

        try{
            String line = console.ask("");
            while (line != null){
                console.printMessage(Executer.getInstance().doRequest(parse(line)).toString());
            }
        }catch(Exception e){
            console.printMessage(e.getMessage());
        }
    }


    private Request parse(String line){
        String[] parses = line.split(" ");
        String command = parses[0];
        String args = parses.length>1?parses[1]:null;
        Movie movie;
        if (CommandMap.getInstance().getCommand(parses[0]).getArgIsMovie()){
            movie = MovieBuilder.getInstance().build(console);
        }

    }

}
