package Catcher;

import Builders.MovieBuilder;
import Comands.CommandMap;
import IO.Console;
import Models.Movie;
import Transfer.Request;

import java.util.Arrays;
import java.util.List;

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
                line = console.ask("Команда:");
            }
        }catch(Exception e){
            console.printMessage(e.getMessage());
        }
    }


    private Request parse(String line){
        String[] parses = line.split(" ");
        String command = parses[0];
        List<String> args = Arrays.asList(Arrays.copyOfRange(parses,1,parses.length));
        Movie movie= null;
        if (CommandMap.getInstance().getCommand(parses[0]).getArgIsMovie()){
            movie = MovieBuilder.getInstance().build(console);
        }
        return new Request(command,args,movie);

    }

}
