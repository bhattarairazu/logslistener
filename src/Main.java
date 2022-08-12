import service.ServerListener;

public class Main {

	public static void main(String[] args) {
		//514 is a port no				
		new ServerListener(514).start();;

	}

}
