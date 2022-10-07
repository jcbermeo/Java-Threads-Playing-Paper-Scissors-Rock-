
public class Player1 extends Thread{
	
	private String name = "Juan";
	private int objectNumber;
	private String gameObject;
	private int turn;
	
	
	
	

	public String getGameObject() {
		return gameObject;
	}




	public void setGameObject(String gameObject) {
		this.gameObject = gameObject;
	}




	public String getName(String name) {
		return name;
	}
	


	
	///////////////////////////////////////////////////// Thread Methods /////////////////////////////////////////////////////
	
	@Override
	public synchronized void start() {
		System.out.println(this.name + " is Awake!");
		super.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

	@Override
	public void interrupt() {
		// TODO Auto-generated method stub
		super.interrupt();
	}

	@Override
	public boolean isInterrupted() {
		// TODO Auto-generated method stub
		return super.isInterrupted();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	
}
