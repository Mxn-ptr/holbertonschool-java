package workflow;

public class Teams implements NotificationChannel {
	public void notify(Message message) {
		System.out.printf(("[TEAMS] %s - %s\n"), message.getMessageType().toString(), message.getText());
	}
}
