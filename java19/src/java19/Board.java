package java19;

public class Board {

	String title;
	String content;
	String writer;
	String pw;
	
	public Board(String title, String content, String writer, String pw) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + ", pw=" + pw + "]";
	}
}
