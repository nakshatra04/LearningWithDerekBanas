package CommandPattern;

/**
 * Created by Sohrab-PC on 12/16/2016.
 */
public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.on();

    }

    public void undo() {

        theDevice.off();

    }

}