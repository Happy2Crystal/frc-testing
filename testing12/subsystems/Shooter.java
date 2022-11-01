package testing12.subsystem;
import java.util.Subsystembase;
import java.util.BobTalonFX;
public class Shooter {
    private MotorControllerGroup shooter = new MotorControllerGroup(leftShooterMotor, righhShooterMotor);
    leftShooterMotor = 16;
    rightShooterMotor = 15;
    private void lowerShoot() {
        MotorControllerGroup.set(-0.5, 0.5);
    }
    private void upperShoot() {
        MotorControllerGroup.set(-1, 1);
    }

}
static class Shooter {

}

final class Shooter {

}