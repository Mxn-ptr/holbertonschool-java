package workflow;

import java.util.ArrayList;

public class VideoProcessor {
	private ArrayList<NotificationChannel> channels;

	public VideoProcessor() {
		this.channels = new ArrayList<NotificationChannel>();
	}

	public void registerChannel(NotificationChannel channel) {
		this.channels.add(channel);
	}

	public void process(Video video) {
		for (NotificationChannel channel: this.channels) {
			channel.notify(new Message(String.format("%s - %s", video.getFile(), video.getFormat().toString()), MessageType.LOG));
		}
	}
}
