package utils;


public class FunctionalityClient {
	
	public static void handleCommand(String command) {
		
		if (command.contains("STOR")) {

			
		}
		else if (command.contains("RETR")) {

			
		}
		else if (command.contains("LIST")) {


		}
		//ETC

	}
	
	public static boolean sendFile(String filename) {
				
		try {
			
			// Abrir conexi�n de datos
			
			// Coger input y output
			
			// Pasar datos con el buffer
			
			// Cerrar input, output y conexi�n
			
			// Ojo con las comprobaciones: cosas que ya existen, posibles errores, etc.
			
			return true;
			
		}
		catch (Exception e) {
			
		}
		return false;
	}
	
	public static boolean receiveFile(String filename){
		
		try {
			
			// Abrir conexi�n de datos
			
			// Coger input y output
			
			// Pasar datos con el buffer
			
			// Cerrar input, output y conexi�n
			
			// Ojo con las comprobaciones: cosas que ya existen, posibles errores, etc.
			
			return true;
		
		} catch (Exception e) {
			
		}
		return false;
	}
	

	public static boolean printFileList() {
		try {
			
			// Cuando invocamos LIST, el servidor nos deber�a mandar la lista de archivos
			// (b�sicamente, un string bien construido)
			// Habr� que llamar a este m�todo para imprimirlo bien
			// (es leer l�nea a l�nea...)
			// �Y si le pasamos el BufferedReader?
			
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}



	

}
