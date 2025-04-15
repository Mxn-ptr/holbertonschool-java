package workflow;

public class Video {
	private String file;
	private FormatVideo format;

	public Video(String file, FormatVideo format) {
		this.file = file;
		this.format = format;
	}

	public String getFile() {
		return this.file;
	}

	public FormatVideo getFormat() {
		return this.format;
	}
}
