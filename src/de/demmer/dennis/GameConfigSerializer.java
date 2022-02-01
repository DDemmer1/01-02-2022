package de.demmer.dennis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameConfigSerializer {

	public void save(GameConfig conf, String path) {

		File file = new File(path);

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(conf);
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	public GameConfig load(String path) {

		File file = new File(path);

		GameConfig conf = new GameConfig();

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			conf = (GameConfig) ois.readObject();
			ois.close();
			
			return conf;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conf;

	}

}
