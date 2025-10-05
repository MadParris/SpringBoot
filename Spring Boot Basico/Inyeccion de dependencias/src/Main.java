public class Main {
    public static void main(String[] args) {
        IMotor motor = new MotorElectrico(); //
        IMotor motor2 = new MotorGasolina();
        Carro car1 = new Carro(motor);  // Inyeccion aqui
        Carro car2 = new Carro(motor2);// Inyección aquí
        car1.arrancar();
        car2.arrancar();
    }
}