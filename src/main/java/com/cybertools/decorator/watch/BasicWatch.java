package com.cybertools.decorator.watch;

public class BasicWatch implements IWatch{
	
	private void addTimer() {
		System.out.println(" Temporizador");
	}
	
	@Override
	public void createFunctionality() {
        System.out.println("Reloj básico con: ");
        this.addTimer();
    }
	

}
