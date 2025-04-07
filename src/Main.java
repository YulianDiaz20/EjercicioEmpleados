import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Empleado> lstEmpleado=new ArrayList<>();
        Scanner dato = new Scanner(System.in);
        int opc,edad;
        String nombre;
        double horas;
        boolean m=true;

        do{
        System.out.println(
                "==================="+"\n        MENÚ        "+"\n===================="
                +"\nRegistrar empleado planta ->(1)"
                +"\nRegistrar empleado horas ->(2)"
                +"\nMostrar empleados ->(3)"
                +"\nFinalizar ->(4)"
        );
        opc = dato.nextInt();
        switch (opc){
            case 1->{
                dato.nextLine();
                System.out.println("Ingrese nombre:");
                nombre=dato.nextLine();
                System.out.println("Ingrese edad:");
                edad=dato.nextInt();
                lstEmpleado.add(new EmpleadoPlanta(nombre,edad,2100000));
            }
            case 2->{
                dato.nextLine();
                System.out.println("Ingrese nombre:");
                nombre=dato.nextLine();
                System.out.println("Ingrese edad:");
                edad=dato.nextInt();
                System.out.println("Ingrese horas trabajadas");
                horas=dato.nextDouble();
                lstEmpleado.add(new EmpleadoHoras(nombre,edad,horas));
            }
            case 3->{
                for(Empleado e: lstEmpleado){
                    if(e instanceof EmpleadoPlanta){
                        System.out.println("--->| PLANTA |<---");
                        System.out.println(e);
                    }else{
                        System.out.println("\n--->| HORAS |<---");
                        System.out.println(e);
                    }
                }
            }
            case 4->{
                m=false;
            }
            default -> {
                System.out.println("Ingresa una opción valida....");
            }
        }}while(m==true);
    }
}