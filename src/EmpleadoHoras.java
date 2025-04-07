public class EmpleadoHoras extends Empleado{
    private double pago;
    private  double horas;

    public EmpleadoHoras(String nombre, int edad, double horas) {
        super(nombre, edad);
        this.horas = horas;
    }

    public EmpleadoHoras() {
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void calcularSalario(){
        pago=horas*98000;
    }

    @Override
    public String toString() {
        calcularSalario();
        return "\nEmpleado Horas" + super.toString()+
                "\nPago:" + pago +
                "\nHoras:" + horas;
    }
}
