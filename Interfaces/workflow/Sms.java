public class Sms implements NotificationChannel {
	public void notify(Message message) {
		System.out.printf(("[SMS] {%s} - %s\n"), message.getMessageType().toString(), message.getText());
	}
}
