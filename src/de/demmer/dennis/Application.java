package de.demmer.dennis;


public class Application {

	public static void main(String[] args) {

//		GameConfig conf = new GameConfig(5, 8);
		GameConfigSerializer confSeri = new GameConfigSerializer();
		
		
//		confSeri.save(conf, "test.obj");		
		
		GameConfig conf2 = confSeri.load("test.obj");
		
		System.out.println(conf2.toString());
		
		
		
		

	}

}
