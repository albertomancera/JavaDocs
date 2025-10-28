package correcionJose;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo coche1 = new Vehiculo();
		
		try {
		coche1.arrancar();
		} catch (IllegalStateException e) {
	            System.out.println(e.getMessage());
	    } catch (IllegalArgumentException e1) {
	    		System.out.println(e1.getMessage());
	    }
		
		
		try {
		coche1.repostar(25);
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		coche1.apagar();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(coche1.getCombustibleConsumido());
		System.out.println(coche1.getCombustibleConsumidoTotal()); 
		System.out.println(coche1.getDistanciaRecorrida()); 
		System.out.println(coche1.getDistanciaRecorridaTotal()); 
		System.out.println(coche1);
	

	Vehiculo coche2 = new Vehiculo(60, 40);
	
	try {
	coche2.arrancar();
	} catch (IllegalStateException e) {
            System.out.println(e.getMessage());
    } catch (IllegalArgumentException e1) {
    		System.out.println(e1.getMessage());
    }
	
	
	try {
	coche2.repostar(100);
	} catch (IllegalStateException e) {
		System.out.println(e.getMessage());
	}
	
	try {
	coche2.apagar();
	} catch (IllegalStateException e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println(coche2.getCombustibleConsumido());
	System.out.println(coche2.getCombustibleConsumidoTotal()); 
	System.out.println(coche2.getDistanciaRecorrida()); 
	System.out.println(coche2.getDistanciaRecorridaTotal()); 
	System.out.println(coche2.getNivelCombustible());
	System.out.println(coche2);
	
		
	Vehiculo coche3 = new Vehiculo(60, 40);
	
	try {
		coche3.repostar(10);
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
	
	try {
	coche3.arrancar();
	} catch (IllegalStateException e) {
            System.out.println(e.getMessage());
    } catch (IllegalArgumentException e1) {
    		System.out.println(e1.getMessage());
    }
	
	
	try {
	coche3.repostar(20);
	} catch (IllegalStateException e) {
		System.out.println(e.getMessage());
	}
	
	try {
	coche3.arrancar();
	} catch (IllegalStateException e) {
            System.out.println(e.getMessage());
    } catch (IllegalArgumentException e1) {
    		System.out.println(e1.getMessage());
    }
	
	
	System.out.println(coche3.getCombustibleConsumido());
	System.out.println(coche3.getCombustibleConsumidoTotal()); 
	System.out.println(coche3.getDistanciaRecorrida()); 
	System.out.println(coche3.getDistanciaRecorridaTotal()); 
	System.out.println(coche3.getNivelCombustible());
	System.out.println(coche3);
	
		
	}
}


