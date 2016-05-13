package be.cegeka.principles.dependencyInversion.noDI;

public class Lamp {

    public void turnOn() {
        System.out.println("Lamp has been turned on");
    }

    public void turnOff() {
        System.out.println("Lamp has been turned off");
    }

}


//        ---------buttonImp.h-------------
//class ButtonImplementation
//: public Button
//        {
//public:
//        ButtonImplementaton(
//        ButtonClient&);
//        virtual bool GetState();
//        };