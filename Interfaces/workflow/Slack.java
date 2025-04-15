public class Slack implements NotificationChannel {
	public void notify(Message message) {
		System.out.printf(("[SLACK] {%s} - %s\n"), message.getMessageType().toString(), message.getText());
	}
}
