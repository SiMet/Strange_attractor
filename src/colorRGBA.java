public class colorRGBA extends colorRGB{
		int A;
	colorRGBA(){
		super(0,0,0);
		A=255;
	}
	colorRGBA(int r, int g, int b, int a) {
		super(r, g, b);
		A=a;
	}
	colorRGBA(int RGBA){
		super(RGBA);
		A=RGBA/(256*256*256);
	}
	int getRGBA(){
		return super.getRGB() + 256*256*256*A;
	}
	public colorRGBA add(colorRGBA col){
		int r=(int)((R*A+col.R*col.A)/256.0);
		int g=(int)((G*A+col.G*col.A)/256.0);
		int b=(int)((B*A+col.B*col.A)/256.0);
		int a=(int)((A+col.A)*1.5);
		if(r>255)r=255;
		if(g>255)g=255;
		if(b>255)b=255;
		if(a>255)a=255;
		return new colorRGBA(r,g,b,a);
	}
	static public void main(String args[]){
		colorRGBA a = new colorRGBA(128,0,0,0);
		colorRGBA b = new colorRGBA(128,128,128,128);
		a=a.add(b);
	}
}



