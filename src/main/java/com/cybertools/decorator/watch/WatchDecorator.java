package com.cybertools.decorator.watch;

public abstract class WatchDecorator implements IWatch {

	private IWatch watch;

	public WatchDecorator(IWatch watch) {
		this.watch = watch;
	}

	@Override
	public void createFunctionality() {
		this.watch.createFunctionality();
	}

}
