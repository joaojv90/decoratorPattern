package com.cybertools.decorator.watch;

public class SportWatchDecorator extends WatchDecorator{
	
	public SportWatchDecorator(IWatch watch) {
		super(watch);
	}
	
	private void addPedometer() {
		System.out.println(" Podómetro");
    }

    private void addGPS() {
        System.out.println(" GPS");
    }
    
    @Override
    public void createFunctionality(){
        super.createFunctionality();
        System.out.println(" más características (Sport Watch): ");
        this.addPedometer();
        this.addGPS();
    }

}
