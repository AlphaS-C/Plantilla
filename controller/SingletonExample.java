package controller;


import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.ObservableList;
import persistencia.Persistencia;

public class SingletonExample // implements IModelFactoryService
{

	// Aqui va la variable que queremos que sea global
	//Banco banco;
	
	
	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static SingletonExample eINSTANCE = new SingletonExample();
	}

	// Método para obtener la instancia de nuestra clase
	public static SingletonExample getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	
	public SingletonExample() {
		
		
		//1. inicializar datos y luego guardarlo en archivos
//		iniciarSalvarDatosPrueba();
		
		//2. Cargar los datos de los archivos
//		cargarDatosDesdeArchivos();
		
		
		//3. Guardar y Cargar el recurso serializable binario
//		guardarResourceBinario();
//		cargarResourceBinario();
		
		//4. Guardar y Cargar el recurso serializable XML
//		guardarResourceXML();
		cargarResourceXML();

		
//		//Siempre se debe verificar si la raiz del recurso es null
//		if(banco == null)
//		{
//			System.out.println("es null");
//			inicializarDatos();
////			guardarResourceSerializable();
//			guardarResourceXML();
//		}
		
		//Registrar la accion de incio de sesión
//		Persistencia.guardaRegistroLog("Inicio de sesión del usuario:pedro", 1, "inicioSesion");
		
		
	}

	
	
	private void iniciarSalvarDatosPrueba() throws IOException {
		
		inicializarDatos();
	}
	
	
	private void cargarDatosDesdeArchivos() {
		
//		banco = new Banco();
//		
//		try {
//
//			Persistencia.cargarDatosArchivos(getBanco());
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public void cargarResourceBinario() {
		
		//banco = Persistencia.cargarRecursoBancoBinario();
	}


	public void guardarResourceBinario() {
		
	    //Persistencia.guardarRecursoBancoBinario(banco);
	}


	public void cargarResourceXML() {
		
	//	banco = Persistencia.cargarRecursoBancoXML();
	}


	public void guardarResourceXML() {
		
	  //  Persistencia.guardarRecursoBancoXML(banco);
	}

	
	
	private void inicializarDatos() {

//		banco = new Banco();
//		
//		
//		Cliente cliente = new Cliente();
//		cliente.setNombre("juan");
//		cliente.setApellido("arias");
//		cliente.setCedula("125454");
//		cliente.setDireccion("Armenia");
//		cliente.setCorreo("uni1@");
//		cliente.setFechaNacimiento("12454");
//		cliente.setTelefono("125444");
//
//		banco.getListaClientes().add(cliente);
//
//		cliente = new Cliente();
//		cliente.setNombre("Pedro");
//		cliente.setApellido("Perez");
//		cliente.setCedula("77787");
//		cliente.setDireccion("Pererira");
//		cliente.setCorreo("uni2@");
//		cliente.setFechaNacimiento("12454");
//		cliente.setTelefono("125444");
//
//		banco.getListaClientes().add(cliente);
//		
//		cliente = new Cliente();
//		cliente.setNombre("Alberto");
//		cliente.setApellido("Arias");
//		cliente.setCedula("12555");
//		cliente.setDireccion("Pererira");
//		cliente.setCorreo("uni3@");
//		cliente.setFechaNacimiento("12454");
//		cliente.setTelefono("125444");
//
//		banco.getListaClientes().add(cliente);
//		
//		
//		Empleado empleado = new Empleado();
//		empleado.setNombre("juan");
//		empleado.setApellido("arias");
//		empleado.setCedula("125454");
//		empleado.setFechaNacimiento("12454");
//		banco.getListaEmpleados().add(empleado);
//		
//		
//		empleado = new Empleado();
//		empleado.setNombre("Ana");
//		empleado.setApellido("alzate");
//		empleado.setCedula("125454");
//		empleado.setFechaNacimiento("12454");
//		banco.getListaEmpleados().add(empleado);
//		
//		empleado = new Empleado();
//		empleado.setNombre("Pedro");
//		empleado.setApellido("perez");
//		empleado.setCedula("125454");
//		empleado.setFechaNacimiento("12454");
//		banco.getListaEmpleados().add(empleado);
//		
//		System.out.println("Banco inicializado "+banco );
		
	}

//	public Banco getBanco() {
//		return banco;
//	}

//	public void setBanco(Banco banco) {
//		this.banco = banco;
//	}


//	@Override
//	public Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento) {
//		
//		
//		Empleado empleado = null;
//		
//		try {
//			empleado = getBanco().crearEmpleado(nombre, apellido, cedula, fechaNacimiento);
//		} catch (EmpleadoException e) {
//			e.getMessage();
//		}
//		
//		return empleado;
//		
//	}

//  @Override
//	public boolean actualizarEmpleado(String cedulaActual, String nombre, String apellido, String cedula, String fechaNacimiento) {
//		
//		return getBanco().actualizarEmpleado(cedulaActual, nombre, apellido, cedula, fechaNacimiento);
//	}

//  @Override
//	public Boolean eliminarEmpleado(String cedula) {
//		
//		boolean flagEmpleadoExiste = false;
//		
//		try {
//			flagEmpleadoExiste = getBanco().eliminarEmpleado(cedula);
//		} catch (EmpleadoException e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		}
//		return flagEmpleadoExiste;
//	}

//	@Override
//	public Empleado obtenerEmpleado(String cedula) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	@Override
//	public ArrayList<Empleado> obtenerEmpleados() {
//		
//		return banco.getListaEmpleados();
//	}


	
	
	
}