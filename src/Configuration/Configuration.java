package Configuration;

import java.nio.file.Path;

public class Configuration {
    public Path getPATH_ID() {
        return PATH_ID;
    }

    public Path getPATH_COLLECTION() {
        return PATH_COLLECTION;
    }

    private  Path PATH_ID;

    public void setPATH_COLLECTION(Path PATH_COLLECTION) {
        this.PATH_COLLECTION = PATH_COLLECTION;
    }

    public void setPATH_ID(Path PATH_ID) {
        this.PATH_ID = PATH_ID;
    }

    private Path PATH_COLLECTION;


    private static Configuration instance;
    private Configuration(){}


    public static Configuration getInstance(){
        return instance == null ? instance = new Configuration() : instance;
    }

}
