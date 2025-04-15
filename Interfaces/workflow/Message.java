package workflow;

public class Message {
	private String text;
	private MessageType messageType;

	public Message(String text, MessageType messageType) {
		this.text = text;
		this.messageType = messageType;
	}

	public String getText() {
		return this.text;
	}

	public MessageType getMessageType() {
		return this.messageType;
	}
}
