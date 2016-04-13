package ejercicio55;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Empleado[] empleados = new Empleado[4];
		String nombre;
		String telefono;
		for (int i = 0; i < empleados.length; i++)
		{
			System.out.print("Introduce nombre empleado: ");
			nombre = sc.nextLine();
			System.out.print("Introduce el telefono: ");
			telefono = sc.nextLine();
			empleados[i] = new Empleado(nombre, telefono);
		}
		sc.close();
		System.out.println("Número de empleados: " + Empleado.getNumeroEmpleados());
		for (int i = 0; i < empleados.length; i++)
		{
			System.out.println("Empleado " + (i + 1) + ":");
			System.out.println("Nombre: " + empleados[i].getNombre());
			System.out.println("Teléfono: " + empleados[i].getTelefono());
		}
	}

}
