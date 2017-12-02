package CommandPattern;

/**
 * Created by Sohrab-PC on 12/16/2016.
 */
public class TVRemote {

    public static ElectronicDevice getDevice(){

        return new Television();

    }

}