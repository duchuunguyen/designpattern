package learning.edu.designpattern.chapter06;

import learning.edu.designpattern.chapter06.command.CeilingFanOffCommand;
import learning.edu.designpattern.chapter06.command.CeilingFanHighCommand;
import learning.edu.designpattern.chapter06.command.GarageDoorDownCommand;
import learning.edu.designpattern.chapter06.command.GarageDoorUpCommand;
import learning.edu.designpattern.chapter06.command.LightOffCommand;
import learning.edu.designpattern.chapter06.command.LightOnCommand;
import learning.edu.designpattern.chapter06.command.StereoOffCommand;
import learning.edu.designpattern.chapter06.command.StereoOnWithCDCommand;
import learning.edu.designpattern.chapter06.vendor.CeilingFan;
import learning.edu.designpattern.chapter06.vendor.GarageDoor;
import learning.edu.designpattern.chapter06.vendor.Light;
import learning.edu.designpattern.chapter06.vendor.Stereo;

/**
 * Created by NguyDu01 on 6/29/2017.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
