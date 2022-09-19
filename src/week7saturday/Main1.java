package week7saturday;

class YoutubePage extends Video {
	// Video video = new Video();

	void open() {
		System.out.println("Opening " + super.name);
	}

}

class Video extends Comment {
	String name;
	int duration, likes, dislikes;
	// Comment comment = new Comment();
	SuggestedVideo sv = new SuggestedVideo();
	
	void play() {
		System.out.println("Playing " + name);
	}

	void like() {
		likes++;
	}

	void dislike() {
		dislikes++;
	}

	void makeComment(String comment) {
		// this.comment.commentText = comment;
		super.commentText = comment;
	}
}

class Comment {
	String commentText;
	int like, dislike;
}

class SuggestedVideo {
	
	
	
}

public class Main1 {

	public static void main(String[] args) {
		YoutubePage youtubePage = new YoutubePage();
//		youtubePage.video.name = "Java in 30 minutes";
//		youtubePage.open();
//		youtubePage.video.play();
//		youtubePage.video.like();
//		youtubePage.video.makeComment("I love that video");
	}

}
