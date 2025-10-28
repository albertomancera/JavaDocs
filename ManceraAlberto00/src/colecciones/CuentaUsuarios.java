package colecciones;

import java.util.HashSet;
import java.util.Set;

public class CuentaUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cl1 = new Cliente("Antonio", "0001", 20000);
		Cliente cl2 = new Cliente("Fermin", "0002", 203400);
		Cliente cl3 = new Cliente("Penelope", "0003", 520000);
		Cliente cl4 = new Cliente("Paca", "0004", 10000);
		Cliente cl5 = new Cliente("Antonio", "0001", 20000);
		
		//Crear coleccion
		Set <Cliente> clientesBanco = new HashSet<Cliente>();
		 //Agregar clientes
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		//Recorrer clientes
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " "
		+ cliente.getN_cuenta() + " "+ cliente.getSaldo());
		}
	}

}
