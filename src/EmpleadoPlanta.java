public class EmpleadoPlanta extends Empleado{
    private double salario;

    public EmpleadoPlanta(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public EmpleadoPlanta() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nEmpleado Planta" + super.toString()+
                "\nSalario:" + salario;
    }
}
