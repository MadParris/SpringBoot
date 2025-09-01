public class Carro {

    private IMotor motor;

    public Carro (IMotor motor){
        this.motor = motor;
    }

    public void arrancar(){
        motor.encender();
    }
}
