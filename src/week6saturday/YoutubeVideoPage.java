package week6saturday;

import java.util.ArrayList;

public class YoutubeVideoPage {
	public String videoName;
	public int likeNumber;
	public int dislikeNumber;
	public ArrayList<String> relatedVideos;
	public ArrayList<String> comments = new ArrayList<>();

	public YoutubeVideoPage(String videoName) {
		this.videoName = videoName;
	}

	public void likeVideo() {
		likeNumber++;
	}

	public void dislikeVideo() {
		dislikeNumber++;
	}

	public void addComments(String comment) {
		comments.add(comment);
	}
	public static void main(String[] args) {
		YoutubeVideoPage video1 = new YoutubeVideoPage("Java Programming Tutorial");
		video1.addComments("I love this video!");
		video1.addComments("Great content!");

		for (int i = 0; i < 5; i++) {
			video1.likeVideo();
		}
		System.out.println(video1.likeNumber);
		System.out.println(video1.comments);


	}

}
