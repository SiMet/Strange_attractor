import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Random;






class settings{

	static HashMap<Integer,settings> samples;
	
	static{
		samples = new HashMap<Integer,settings>();
		for(int i=0;i<15;i++)
			samples.put(i, new settings(i));
	}
	static settings get(int i) throws CloneNotSupportedException{
		return (settings) samples.get(i).clone();
				
	}
	protected settings clone(){
		settings s = new settings();
		for(int i=0;i<12;++i)
			s.wsp[i]=wsp[i];
		for(int i=0;i<4;i++)
			s.size[i]=size[i];
		s.iter=new Integer(iter);
		return s;
	}
	static settings random(){
		settings s = new settings();
		Random rand = new Random();
		for(int i=0;i<12;i++)
			s.wsp[i]=rand.nextDouble()*2.4-1.2;
		
		s.size[0]=-3.0; s.size[1]=3.0; s.size[2]=-3.0; s.size[3]=3.0;
		s.iter = 1000000;
		return s;
	}
	
	Integer iter;
    Double wsp[];
    Double size[];
    
    settings(){
    	wsp = new Double[12];
    	size = new Double[4];
    }
    
    settings(int i){
    	this();
    	switch(i){
    		case 0:
    			wsp[0]=0.2; wsp[1]=-0.9; wsp[2]=-0.6; wsp[3]=0.4; wsp[4]=-1.0; wsp[5]=0.1; wsp[6]=1.1; wsp[7]=0.2; wsp[8]=-0.9; wsp[9]=0.1; wsp[10]=1.2; wsp[11]=-1.2; size[0]=-1.05; size[1]=0.65; size[2]=-0.1; size[3]=1.44; iter=1000000; 
    		break;	
    		case 1:
    			wsp[0]=-0.1; wsp[1]=0.8; wsp[2]=-0.7; wsp[3]=-1.1; wsp[4]=-1.1; wsp[5]=-0.7; wsp[6]=-0.4; wsp[7]=0.6; wsp[8]=-0.6; wsp[9]=-0.3; wsp[10]=1.2; wsp[11]=0.6; size[0]=0.1; size[1]=2.1; size[2]=-1.7; size[3]=-0.25; iter=250000; 
    		break;
    		case 2:
    			wsp[0]=1.0; wsp[1]=0.0; wsp[2]=-1.4; wsp[3]=0.0; wsp[4]=1.0; wsp[5]=0.0; wsp[6]=0.0; wsp[7]=0.3; wsp[8]=0.0; wsp[9]=0.0; wsp[10]=0.0; wsp[11]=0.0; size[0]=-1.4; size[1]=1.4; size[2]=-0.45; size[3]=0.45; iter=50000; 
    		break;
    		case 3:
    			wsp[0]=1.0; wsp[1]=0.0; wsp[2]=-1.0; wsp[3]=0.0; wsp[4]=1.0; wsp[5]=0.0; wsp[6]=0.0; wsp[7]=0.542; wsp[8]=0.0; wsp[9]=0.0; wsp[10]=0.0; wsp[11]=0.0; size[0]=-2.0; size[1]=1.8; size[2]=-1.0; size[3]=1.0; iter=100000; 
    		break;
    		case 4:
    			wsp[0]=-1.2; wsp[1]=0.0; wsp[2]=0.7; wsp[3]=0.0; wsp[4]=0.1; wsp[5]=0.4; wsp[6]=0.4; wsp[7]=1.1; wsp[8]=0.8; wsp[9]=1.2; wsp[10]=-0.6; wsp[11]=-1.2; size[0]=-1.25; size[1]=-0.05; size[2]=-1.5; size[3]=0.8; iter=500000; 
    		break;

    		case 5:
    			wsp[0]=-1.1451230657280833; wsp[1]=0.06939708960723912; wsp[2]=-0.2493128262387131; wsp[3]=0.9560195802528695; wsp[4]=-0.5124752764931397; wsp[5]=0.6323701432242739; wsp[6]=-0.513691747463212; wsp[7]=-1.1180920771731644; wsp[8]=-0.636414811137721; wsp[9]=-1.0852065249324512; wsp[10]=-0.4875226940656493; wsp[11]=0.9765339081336839; size[0]=-1.8; size[1]=-0.1; size[2]=-0.7; size[3]=0.3; iter=400000; 
    		break; 
    		case 6: 
    			wsp[0]=-1.115211462916893; wsp[1]=0.7424245056605341; wsp[2]=0.4125049983667717; wsp[3]=0.4691975839623155; wsp[4]=0.5490951772379193; wsp[5]=0.33696426049269035; wsp[6]=0.4266331063945519; wsp[7]=0.18601267787907094; wsp[8]=-0.9164376801011744; wsp[9]=0.9276650652896132; wsp[10]=1.1140415271969448; wsp[11]=0.5644034483053486; size[0]=-3.0; size[1]=1.0; size[2]=-2.5; size[3]=1.2; iter=100000; //////////////////////////////////////////////////////////////////
    		break; 
    		case 7:
    			wsp[0]=1.1670816425463373; wsp[1]=-0.28397828539706227; wsp[2]=-1.0941940662396201; wsp[3]=0.1632670806374057; wsp[4]=0.1928148626698465; wsp[5]=-0.43277674205520056; wsp[6]=0.6637482694746559; wsp[7]=-0.9439554352689297; wsp[8]=0.2013270927534938; wsp[9]=-0.7884345378617503; wsp[10]=-0.6803068497471002; wsp[11]=-0.17683290115065065; size[0]=-3.0; size[1]=3.0; size[2]=-3.25; size[3]=2.25; iter=1000000; 
    		break; 
    		case 8:
    			wsp[0]=-0.1285301942922168; wsp[1]=0.871911941483636; wsp[2]=-0.6412794510350659; wsp[3]=-0.07127750233182084; wsp[4]=-0.06340370587368094; wsp[5]=0.5853038062060811; wsp[6]=-0.8339558764981878; wsp[7]=-0.6336478074227624; wsp[8]=0.8058401784426745; wsp[9]=1.0127595858679352; wsp[10]=-1.1590989275659034; wsp[11]=0.6399125645455541; size[0]=-1.5; size[1]=2.0; size[2]=-2.0; size[3]=1.5; iter=1000000; 
    		break; 
    		case 9:
    			wsp[0]=0.9229986706404867; wsp[1]=-0.0352903544617269; wsp[2]=-0.42951698717455256; wsp[3]=-0.05647609538791265; wsp[4]=-0.3025440292088115; wsp[5]=-0.6432793251889626; wsp[6]=-0.5507843961690061; wsp[7]=1.132102941918659; wsp[8]=0.9980280895177402; wsp[9]=0.6466387241165636; wsp[10]=-0.13107215905311476; wsp[11]=0.636606795882479; size[0]=-2.2; size[1]=1.2; size[2]=-1.5; size[3]=2.0; iter=1000000; 
    		break; 
    		case 10:
    			wsp[0]=0.5647594364542792; wsp[1]=-0.1811091915223364; wsp[2]=0.7414159597385277; wsp[3]=-1.141135697741246; wsp[4]=-0.6474582829184446; wsp[5]=0.10644510770372984; wsp[6]=-0.22614136387167905; wsp[7]=-0.44074107561290443; wsp[8]=0.7917470769840229; wsp[9]=0.6030840860324482; wsp[10]=-0.9254723577758663; wsp[11]=-0.7211639258863936; size[0]=-0.5; size[1]=1.6; size[2]=-0.8; size[3]=1.0; iter=1200000; 
    		break;
    		case 11:
    			wsp[0]=0.5604373288711066; wsp[1]=0.7169716129512371; wsp[2]=-0.47004284581011524; wsp[3]=-1.0625257569277806; wsp[4]=-1.093472980177119; wsp[5]=0.5430674652579528; wsp[6]=0.0028096595786575307; wsp[7]=-1.1659071171253244; wsp[8]=0.8960763731574792; wsp[9]=0.36847399559541927; wsp[10]=-0.7635518851889538; wsp[11]=0.31336137082540616; size[0]=-1.5; size[1]=2.0; size[2]=-0.9; size[3]=2.2; iter=600000;
    		break;
    		case 12:
    			wsp[0]=-1.016536188798188; wsp[1]=0.47903638168399243; wsp[2]=0.9119786702284245; wsp[3]=1.1567157998381823; wsp[4]=-0.4131940340780066; wsp[5]=0.4654062378065422; wsp[6]=-0.7039554401584929; wsp[7]=0.2086005546837637; wsp[8]=0.1165498269473384; wsp[9]=-0.6304650006755189; wsp[10]=-0.10489537544636796; wsp[11]=0.20886955773891613; size[0]=-1.5; size[1]=1.5; size[2]=-1.5; size[3]=1.5; iter=100000; 
    		break;
    		case 13:
    			wsp[0]=0.562077149311925; wsp[1]=0.4679449578977768; wsp[2]=-0.44731716081850503; wsp[3]=-0.3417190348105593; wsp[4]=-0.9004375818771004; wsp[5]=-0.08815369930322481; wsp[6]=0.7676255076324792; wsp[7]=0.9790767732476817; wsp[8]=-0.4174628756266767; wsp[9]=1.105847231406292; wsp[10]=-0.5524330422419773; wsp[11]=-0.6815160593061547; size[0]=-2.0; size[1]=2.0; size[2]=-2.2; size[3]=2.0; iter=250000; 
    		break;
    	}
    	
    }
}
@SuppressWarnings("serial")
public class StrangeAttractor extends Applet implements ActionListener, ItemListener {
	
	static HashMap<String, Integer> kolors = new HashMap<String, Integer>();
	static{
		
	kolors.put("DarkBlue",0x055555DD);
	kolors.put("DarkRed",0x05DD5555);
	kolors.put("DarkGreen",0x0555DD55);
	kolors.put("DarkPurple", 0x05DD55DD);
	kolors.put("DarkOrange",0x05DD9955);
	kolors.put("DarkYellow",0x05DDDD55);
		
	kolors.put("Blue",0x058888FF);
	kolors.put("Red",0x05FF8888);
	kolors.put("Green",0x0588FF88);
	kolors.put("Purple", 0x05FF88FF);
	kolors.put("Orange",0x05FFAA88);
	kolors.put("Yellow",0x05FFFF88);
	kolors.put("White",0x05BBBBBB);
	}
	
	settings s;
    Point p;
    colorRGBA kolor;
    
    Choice chKolor;
    Choice choice;
	TextField TFiter;
	Label Liter;
	
    TextField TFsize[];
    Label Lsize[];
    
    TextField La;
    
    TextField TFwsp[];
    Label labels[];
    ImagePanel ip=null;
    BufferedImage bi;
	Button button;
	Button rnd = new Button();
	
	void myInit() throws CloneNotSupportedException{
		TFsize = new TextField[4];
		Lsize = new Label[4];
		
		TFwsp = new TextField[12];
		labels = new Label[12];
		s = (settings) settings.get(0);
	}
    public void init(){
    	
    	this.p = new Point(0,0);
    	try {
			myInit();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
    	
    	this.setSize(900, 650);
    	this.setBackground(Color.gray);
    	
    	setLayout(null);
    	

        
    	for(int i=0;i<12;i++){
    		labels[i]=new Label();
    		labels[i].setText("Wsp "+i);
    		labels[i].setBounds(10, 10+i*22, 50, 20);
    		add(labels[i]);
    		
    		TFwsp[i]= new TextField();
    		TFwsp[i].setText(s.wsp[i].toString());
    		TFwsp[i].setBounds(60, 10+i*22, 70, 20);
    		add(TFwsp[i]);
    	}
    	for(int i=0;i<4;++i){
    		TFsize[i]=new TextField();
    		Lsize[i]=new Label();
    		TFsize[i].setText(s.size[i].toString());
    		TFsize[i].setBounds(60, 290 +22*i, 50,20);
    		Lsize[i].setBounds(10, 290 +22*i, 50,20);
    		add(TFsize[i]);
    		
    	}
    	Lsize[0].setText("Min X");
    	Lsize[1].setText("Max X");
    	Lsize[2].setText("Min Y");
    	Lsize[3].setText("Max Y");
    	for(int i=0;i<4;i++)
    		add(Lsize[i]);
    	
    	TFiter = new TextField();
    	TFiter.setText(s.iter.toString());
    	TFiter.setBounds(60, 380, 60, 20);
    	add(TFiter);
    	
    	Liter = new Label();
    	Liter.setText("il iteracji");
    	Liter.setBounds(10,380,50,20);
    	add(Liter);
    	
    	
    	chKolor = new Choice();
    	chKolor.setBounds(10,420,120,20);
    	for(String kolor: kolors.keySet())
    		chKolor.add(kolor);
    	add(chKolor);
    	chKolor.addItemListener((ItemListener)this);
    	
    	Label przyk = new Label();
    	przyk.setText("Przyk³ady:");
    	przyk.setBounds(10,475,100,20);
    	add(przyk);
    	choice = new Choice();
    	choice.setBounds(10, 500, 120, 20);
    	choice.addItem("ODGQCNXODNYA");
    	choice.addItem("LUFBBFISGJYS");
    	choice.addItem("Henon");
    	choice.addItem("Henon2");
    	choice.addItem("AMTMNQQXUYGA");
    	choice.addItem("5 atraktorów");
    	choice.addItem("Dominiki01");
    	choice.addItem("Dominiki02");
    	choice.addItem("Dominiki03");
    	choice.addItem("Dominiki04");
    	choice.addItem("Helikopter");
    	choice.addItem("Sample 1");
    	choice.addItem("Sor 01");
    	choice.addItem("Sor 02");
    	choice.addItemListener((ItemListener) this);
    	add(choice);
    	
    	button = new Button();
    	
    	button.setLabel("Rysuj");
    	add(button);
        button.setBounds(10,530, 100, 25);
    	button.addActionListener(this);
        
    	rnd.setLabel("Random");
    	rnd.setBounds(10,570,100,25);
    	add(rnd);
    	rnd.addActionListener(this);
    	
		La = new TextField();
		String a="";
		for(int i=0;i<12;++i){
			a+="wsp["+i+"]="+s.wsp[i]+"; ";
		}
		for(int i=0;i<4;++i){
			a+="size["+i+"]="+s.size[i]+"; ";
		}
		a+="iter="+s.iter+"; ";
		La.setText(a);
		La.setBounds(10, 600, 100, 20);
		add(La);
    	
    	

    	
    	ip = new ImagePanel(null);
    	ip.setBounds(140, 5, 760 , 650);
    	add(ip); 
    	ip.setVisible(true);

    	
    	this.setVisible(true);
    	
    }
    void nextPoint(){
    	//this.p.y=Math.sin(p.x);
    	//this.p.x=p.x+0.001;
    	double tmpX;
    	double tmpY;
    	tmpX=s.wsp[0]+s.wsp[1]*p.getX()+s.wsp[2]*p.getX()*p.getX()+s.wsp[3]*p.getX()*p.getY()+s.wsp[4]*p.getY()+s.wsp[5]*p.getY()*p.getY();
    	tmpY=s.wsp[6]+s.wsp[7]*p.getX()+s.wsp[8]*p.getX()*p.getX()+s.wsp[9]*p.getX()*p.getY()+s.wsp[10]*p.getY()+s.wsp[11]*p.getY()*p.getY();
    	p.setPoint((float)tmpX,(float)tmpY);
    }
    void createImg(int imageWidth, int imageHeight){
    	
    	p = new Point(0,0);
    	bi = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB_PRE);
    	colorRGBA kol[][]=new colorRGBA[imageWidth][imageHeight];
    	for(int i=0;i<imageWidth;++i)
    		for(int j=0;j<imageHeight;++j)
    				kol[i][j] = new colorRGBA(1,1,1,255);
    	
    //	colorRGBA kolor = new colorRGBA(0x05FFAA88);


    	
    	//System.out.println(kolor);
    	for(int i=0; i<s.iter; ++i){
    			nextPoint();
    			
    			int X=(int)(((p.getX()-s.size[0])/(s.size[1]-s.size[0]))*imageWidth);
    			int Y=(int)(((p.getY()-s.size[2])/(s.size[3]-s.size[2]))*imageHeight);
    			//System.out.println(X+" "+Y);
    			if(X>0 && X<imageWidth && Y>0 && Y <imageHeight && s.iter > 100){
    				if(i%1000==0)
    				if(kolor==null) kolor = new colorRGBA(kolors.get(chKolor.getSelectedItem()));
    				kol[X][Y] = (kol[X][Y]).add( kolor );
    			
    				bi.setRGB(X, -Y+imageHeight,kol[X][Y].getRGBA());
    			}
    	}    
    }
    

    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==button){
    		for(int i=0;i<12;++i){
    			s.wsp[i]=new Double(TFwsp[i].getText());
    		}
    		for(int i=0;i<4;i++){
    			s.size[i]=new Double(TFsize[i].getText());
    		}
    		s.iter=new Integer(TFiter.getText());
    		
    		createImg(ip.getWidth(),ip.getHeight());
    		ip.update(bi);
    		}
    	else if(e.getSource()==rnd){
    		La.setText("Obliczam...");
    		boolean flag=false;
    		
    		n:
   			
				do {
					flag=false;
					p.setPoint(0,0);
					s = settings.random();
					int kol[][]=new int[800][600];
					//La.setText("Ok");
					for(int i=0;i<16000;i++){
						nextPoint();
						if((double)Math.abs(p.getX())>20.0 || (double)Math.abs(p.getY())>20.0){
							flag=true;
							continue n;
						}
		    			int X=(int)-(((p.getX()-3.0)/(s.size[1]-s.size[0]))*800.0);
		    			int Y=(int)(((p.getY()-3.0)/(s.size[2]-s.size[3]))*600.0);
		    			//System.out.println(X+" "+Y);
				    	if(X>0 && X<800 && Y>0 && Y <600){
				    		
				    		if(++kol[X][Y]>=60){
				    			//System.out.println("Odrzucam");
				    			//La.setText("Odrzucony");
				    			flag=true;
								continue n;
				    		}
				    	}			
					}
				}while( flag ) ;
    		
    		double size[] = new double[4];
    		for(int i=0;i < 5000; ++i){
    			nextPoint();
    			if(i>100){
	    			if(p.getX()<size[0] || Math.abs(size[0])<0.000001 )size[0]=p.getX();
	    			else if(p.getX()>size[1] || Math.abs(size[1])<0.000001)size[1]=p.getX();
	    			if(p.getY()<size[2] || Math.abs(size[2])<0.000001)size[2]=p.getY();
	    			else if(p.getY()>size[3] || Math.abs(size[3])<0.000001)size[3]=p.getY();
    			}
    		}
    		for(int i=0;i<4;i++){
    			s.size[i]=size[i]*1.1;
    			TFsize[i].setText(s.size[i].toString());
    		}
			for(int i=0;i<12;i++)
				TFwsp[i].setText(s.wsp[i].toString());
			for(int i=0;i<4;i++)
				TFsize[i].setText(s.size[i].toString());
			TFiter.setText(s.iter.toString());
			    		
    		createImg(ip.getWidth(),ip.getHeight());
    		ip.update(bi);
    		

    	}
		String a="";
		for(int i=0;i<12;++i){
			a+="wsp["+i+"]="+s.wsp[i]+"; ";
		}
		for(int i=0;i<4;++i){
			a+="size["+i+"]="+s.size[i]+"; ";
		}
		a+="iter="+s.iter+"; ";
		La.setText(a);
        }
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==chKolor){
			kolor = new colorRGBA(kolors.get(chKolor.getSelectedItem()));	
    		createImg(ip.getWidth(),ip.getHeight());
    		ip.update(bi);
		}
    	if(e.getSource()==choice){
    		if(choice.getSelectedIndex()!=-1){
    				s = settings.samples.get(choice.getSelectedIndex());
    			for(int i=0;i<12;i++)
    				TFwsp[i].setText(s.wsp[i].toString());
    			for(int i=0;i<4;i++)
    				TFsize[i].setText(s.size[i].toString());
    			TFiter.setText(s.iter.toString());
        		createImg(ip.getWidth(),ip.getHeight());
        		ip.update(bi);
    		}
    	}
	}
}

@SuppressWarnings("serial")
class ImagePanel extends Panel {
	
    private BufferedImage backgroundImage;
    
    public ImagePanel(BufferedImage bi){
    	super(); // wywoluje konstruktor klasy nadrzednej
    	this.init(bi);
    }
    public void init(BufferedImage bi){
    	backgroundImage = bi;
    }
    public void paint(Graphics g){ // wolana przy imegePanel.setVisible(true);
    	if(backgroundImage!=null){  
    	    g.drawImage(backgroundImage, 0, 0, this);
    	}
    	else{
    	    this.setBackground(Color.black);
    	}
    }
    public void update(BufferedImage bi){
    	backgroundImage = bi;
    	this.setSize(backgroundImage.getWidth(), backgroundImage.getHeight());
    	this.repaint();
    }
	
}