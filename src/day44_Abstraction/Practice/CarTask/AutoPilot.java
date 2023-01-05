package day44_Abstraction.Practice.CarTask;

import day44_Abstraction.Practice.CarTask.AutoPark;

public interface AutoPilot extends AutoPark {
    boolean hasAutoPilot = true;
    void selfDrive();
}
