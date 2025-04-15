public class Email implements NotificationChannel {
	public void notify(Message message) {
		System.out.printf(("[EMAIL] {%s} - %s\n"), message.getMessageType().toString(), message.getText());
	}
}
