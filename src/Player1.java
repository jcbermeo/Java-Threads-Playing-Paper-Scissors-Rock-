
public class Player1 extends Thread{
	
	private String name;
	private int objectNumber;
	private String gameObject;
	private boolean turn;
	
	
	public Player1() {
		super();
		this.name = this.name;
	}


	public String getGameObject() {
		return gameObject;
	}

	public void setGameObject(String gameObject) {
		this.gameObject = gameObject;
	}
	public String getName(String name) {
		return name;
	}
	
	
	public boolean getTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	


	///////////////////////////////////////////////////// Thread Methods /////////////////////////////////////////////////////
	
	@Override
	public synchronized void start() {
		System.out.println(getName() + " is Ready! (Thread is Awake)");
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
