public class Main {
    public static void main(String[] args) {
        IMotor motor = new MotorElectrico(); // O MotorElectrico()
        Carro car1 = new Carro(motor);    // Inyección aquí
        car1.arrancar();                  // 🚀
    }
}