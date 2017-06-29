package learning.edu.designpattern.chapter06;

import learning.edu.designpattern.chapter06.command.GarageDoorUpCommand;
import learning.edu.designpattern.chapter06.command.LightOnCommand;
import learning.edu.designpattern.chapter06.vendor.GarageDoor;
import learning.edu.designpattern.chapter06.vendor.Light;

/**
 * Created by duchuunguyen up 6/28/17.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(new LightOnCommand(new Light("")));

        remote.buttonWasPressed();

        remote.setCommand(new GarageDoorUpCommand(new GarageDoor("")));
        remote.buttonWasPressed();
    }
}
