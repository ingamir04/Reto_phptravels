package reto.phptravels.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction{

	private long milisegundos;


	public Wait(long milisegundos) {
		this.milisegundos = milisegundos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Wait por(long milisegundos) {
		return Tasks.instrumented(Wait.class, milisegundos);
	}
	
	

}
