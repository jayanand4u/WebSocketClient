package demo;
 
import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

 
public class TestClient{
 
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private final String webSocketAddress = "ws://localhost:8080/systemstatus";

public TestClient() {
	try {
		initializeWebSocket();
	} catch (URISyntaxException e) {
		e.printStackTrace();
	}
}

public static void main(String[] args) {
	boolean loop = true;
	new TestClient();
	while(loop){
		
	}
}

 
private void initializeWebSocket() throws URISyntaxException {
	System.out.println("Open websocket client at " + webSocketAddress);
	new TestSocketClient(new URI(webSocketAddress));
}


}

