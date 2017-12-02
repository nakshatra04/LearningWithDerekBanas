package CommandPattern;

/**
 * Created by Sohrab-PC on 12/16/2016.
 */
public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.off();

    }

    // Used if you want to allow for undo
    // Do the opposite of execute()

    public void undo() {

        theDevice.on();

    }

}
