package src.main.java.com.apollo247.phr.dto.healthrecord;

public class PDFWordPosition {

	public float x;
	public float y;
	public String text;
	
	public PDFWordPosition(float f,float g,String text ) {
		this.x=f;
		this.y=g;
		this.text=text;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + ", text=" + text + "]";
	}

}
