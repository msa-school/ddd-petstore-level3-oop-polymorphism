package com.demo.petstore;

public abstract class Pet {
    int appearance;
    int energy;

    public abstract String speak();


	public void eat(){
		energy = energy + 1;
	}

	public void sleep(){
		energy = energy + 1;
	}


}
