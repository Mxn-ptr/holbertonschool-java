package workflow;

public class Slack implements NotificationChannel {
	public void notify(Message message) {
		System.out.printf(("[Slack] %s - %s\n"), message.getMessageType().toString(), message.getText());
	}
}
