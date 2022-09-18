package interview.stuff;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationClass {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream filestream = new FileOutputStream("C:\\Users\\nisch\\ser.ser");

		ObjectOutputStream obs = new ObjectOutputStream(filestream);
		Car car = new Car(29);
		car.setVar(88);
		obs.writeObject(car);
		obs.close();
		deserializerr();
	}

	private static void deserializerr() throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("C:\\\\Users\\\\nisch\\\\ser.ser");
		ObjectInputStream obs = new ObjectInputStream(fileInputStream);
		Car car = (Car)obs.readObject();
		System.out.println(car.getId());
		System.out.println("printing");
		System.out.println(car.getVar());
	}

	
	
	
}

class Car implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -332692412277193358L;
	private int id;
	private transient int var;
	
	public Car(int r)
	{
		this.id = r;
	}
	
	
	
	public int getVar() {
		return var;
	}



	public void setVar(int var) {
		this.var = var;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
