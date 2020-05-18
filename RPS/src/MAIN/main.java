package MAIN;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;



public class main {
	Timer timer;
	Timer timer2;
	    public main(int seconds) {
	        timer = new Timer();
	        timer.schedule(new RemindTask(), seconds*1000);
		}
	    

	    class RemindTask extends TimerTask {
	        public void run() {
	            
	            timer.cancel(); //Terminate the timer thread
	            for(int i =0; i<1;i++) {
	            	JOptionPane.showMessageDialog(null, "Your time is up and Sid took every kids happiness forever");
	                System.exit(0);	
	            }
	            
	            
	            
	        }
	    }
	public static void main(String[] args) {
		
		hi();
		
	}
	static int tot = 0;
	static int yscore = 0;
	static String name1 = "";
	static String name2 = "";
	static int rscore = 0;
	static int pscore = 0;
	static int total = 0;
	static int ycnt=0;
	static int rcnt=0;
	static int pcnt = 0;
	static Object[] options4 = {"Yes","No","Highscores"};

	static Object[] options = {"Yes","No"};
	static Object[] options2= {"Player VS Computer","Player VS Player","Exit"};
	static Object[] options3= {"Rock","Paper","Scissors","Exit"};
	static Object[] options32= {"Rock","Paper","Scissors","Exit"};

	static ArrayList<Integer> p1 = new ArrayList<Integer>();
	static ArrayList<Integer> computer = new ArrayList<Integer>();
	static ArrayList<Integer> p2 = new ArrayList<Integer>();


	public static void hi2() {
    	ImageIcon icon = new ImageIcon(main.class.getResource("rps.png"));
    	ImageIcon pvp = new ImageIcon(main.class.getResource("p v p.JPG"));
    	ImageIcon pvr = new ImageIcon(main.class.getResource("p v r.JPG"));
    	ImageIcon pvs = new ImageIcon(main.class.getResource("p v s.JPG"));
    	ImageIcon rvr = new ImageIcon(main.class.getResource("rock v rock.JPG"));
    	ImageIcon rvs = new ImageIcon(main.class.getResource("r v s.JPG"));
    	ImageIcon rvp = new ImageIcon(main.class.getResource("r v p.JPG"));
    	ImageIcon svs = new ImageIcon(main.class.getResource("s vs s.JPG"));
    	ImageIcon svr = new ImageIcon(main.class.getResource("s v r.JPG"));
    	ImageIcon svp = new ImageIcon(main.class.getResource("s v p.JPG"));
    	UIManager.put("Button.background", Color.orange);
        UIManager.put("Panel.background", Color.YELLOW);
        UIManager.put("OptionPane.background", Color.CYAN);
       

  	  
			
			int a  = JOptionPane.showOptionDialog(null, "Select your game mode:" + " Total rounds played: "+tot,"Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options2,null);
			
			if(a==2) {
				System.exit(0);
			}
			if(a==0) {
				total = 0;
				yscore = 0;
				pscore = 0;
				rscore=0;				
				while(total <3) {
				if(yscore == 3 && rscore!=3) {
					p1.add(1);
					tot = tot+1;

					JOptionPane.showMessageDialog(null, "You won against the computer");
					ycnt = ycnt +1;
					int d  = JOptionPane.showOptionDialog(null,"Would you like to play another round of Rock, Paper, Scissors","Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
					if(d==0) {
						hi2();
						name1 = "";
						name2="";
					}
					if(d==1) {
						JOptionPane.showMessageDialog(null, "Thanks for playing, here are the scores of all the rounds youve played: " + name1 + ": " + ycnt + ". Computer: " + rcnt + ". Other Player: " + name2 + ": " + pcnt);
						
						System.exit(0);
					}
					if(d==2) {
						JOptionPane.showMessageDialog(null, name1 + "'s high score: "+ycnt + ", "+ " Computers high score: " +rcnt + ", Player two:"+name2 + "'s high score: " + pcnt);
						hi2();

					}
					
				}
				
				else if(rscore == 3 && yscore!=3) {
					JOptionPane.showMessageDialog(null, "You lost against the computer");
					computer.add(1);
					tot = tot+1;

					rcnt = rcnt+1;
					int d  = JOptionPane.showOptionDialog(null,"Would you like to play another round of Rock, Paper, Scissors","Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
					if(d==0) {
						name1 = "";
						name2="";
						hi2();
					}
					if(d==1) {
						JOptionPane.showMessageDialog(null, "Thanks for playing, here are the scores of all the rounds youve played: " + name1 + ": " + ycnt + ". Computer: " + rcnt + ". Other Player: " + name2 + ": " + pcnt);
						System.exit(0);
					}
					if(d==2) {
						JOptionPane.showMessageDialog(null, name1 + "'s high score: "+ycnt + ", "+ " Computers high score: " +rcnt + ", Player two:"+name2 + "'s high score: " + pcnt);
						hi2();

					}
				}
				int b  = JOptionPane.showOptionDialog(null, "Select what you want to play" + "Your score: " + yscore + " Computer score: " +  rscore,"Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options32,null);
if(b==4) {
	String f = JOptionPane.showInputDialog(null, "What do you want to change your name to, player1");
	if(f.contentEquals(f.substring(0))) {
		name1 = "";
		name1 = name1 + f.substring(0);
	}	
				}
else if(b==0) {
					JOptionPane.showMessageDialog(null, "The computer is choosing now...." );

					int c = (int)(Math.random()*3);
					if(b==c) {
						Window.msg2("The computer chose rock you tied",rvr);						
					}
					else if(c==1) {
						rscore = rscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose paper, you lost this round");
						Window.msg2("The computer chose paper, you lost this round", rvp);
					}
					else if(c==2) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose scissors, you won this round");
						Window.msg2("The computer chose scissors, you won this round", rvs);
					}
				}
				else if(b==1) {
					JOptionPane.showMessageDialog(null, "The computer is choosing now...." );

					int c = (int)(Math.random()*3);
					if(b==c) {
						Window.msg2("The computer chose paper, you tie this round",pvp);
					
						
					}
					else if(c==0) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose rock, you won this round");
						Window.msg2("The computer chose rock, you won this round",pvr);

					}
					else if(c==2) {
						rscore = rscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose scissors, you lost this round");
						Window.msg2("The computer chose scissors, you lost this round",pvs);

					}
				}
				else if(b==2) {
					JOptionPane.showMessageDialog(null, "The computer is choosing now...." );

					int c = (int)(Math.random()*3);
					if(b==c) {
						//JOptionPane.showMessageDialog(null, "The computer chose scissors, you tie this round");
						Window.msg2("The computer chose scissors, you tie this round",svs);

						
					}
					else if(c==1) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose paper, you won this round");
						Window.msg2("The computer chose paper, you won this round",svp);

					}
					else if(c==0) {
						rscore = rscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose rock, you lost this round");
						Window.msg2("The computer chose rock, you lost this round",svr);

					}
				}
				else if(b==3){
					System.exit(0);
				}
			}
			
			}
			
			if(a==1) {
				total = 0;
				yscore = 0;
				pscore = 0;
				rscore=0;String j= JOptionPane.showInputDialog(null, "What is your name, player2");
					if(j.contentEquals(j.substring(0))) {
						name2 = name2 + j.substring(0);
					}		
				while(total <3) {
						
				
				if(yscore == 3 && pscore!=3) {
					p1.add(1);
					tot = tot+1;

					JOptionPane.showMessageDialog(null, "You won against the other player");
					ycnt = ycnt +1;
					int d  = JOptionPane.showOptionDialog(null,"Would you like to play another round of Rock, Paper, Scissors","Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
					if(d==0) {
						hi2();
						name1 = "";
						name2="";
					}
					if(d==1) {
						JOptionPane.showMessageDialog(null, "Thanks for playing, here are the scores of all the rounds youve played: " + name1 + ": " + ycnt + ". Computer: " + rcnt + ". Other Player: " + name2 + ": " + pcnt);
						
						System.exit(0);
					}
					if(d==2) {
						JOptionPane.showMessageDialog(null, name1 + "'s high score: "+ycnt + ", "+ " Computers high score: " +rcnt + ", Player two:"+name2 + "'s high score: " + pcnt);
						hi2();

					}
					
				}
				
				else if(pscore == 3 && yscore!=3) {
					JOptionPane.showMessageDialog(null, "You lost against the other player");
					p2.add(1);
					tot = tot+1;

					pcnt = pcnt+1;
					int d  = JOptionPane.showOptionDialog(null,"Would you like to play another round of Rock, Paper, Scissors","Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
					if(d==0) {
						name1 = "";
						name2="";
						hi2();
					}
					if(d==1) {
						JOptionPane.showMessageDialog(null, "Thanks for playing, here are the scores of all the rounds youve played: " + name1 + ": " + ycnt + ". Computer: " + rcnt + ". Other Player: " + name2 + ": " + pcnt);
						System.exit(0);
					}
					if(d==2) {
						JOptionPane.showMessageDialog(null, name1 + "'s high score: "+ycnt + ", "+ " Computers high score: " +rcnt + ", Player two:"+name2 + "'s high score: " + pcnt);
						hi2();

					}
				}
				int b  = JOptionPane.showOptionDialog(null, "Select what you want to play" + "Your score: " + yscore + "Other players score: " +  pscore,"Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options32,null);
				if(b==4) {
					String f = JOptionPane.showInputDialog(null, "What do you want to change your name to player1");
					if(f.contentEquals(f.substring(0))) {
						name1 = "";
						name1 = name1 + f.substring(0);
					}
				}
				else if(b==3){
					System.exit(0);
				}
				int g = JOptionPane.showOptionDialog(null, "Other player selects what to play" + "Your score: " + yscore + "Other players score: " +  pscore,"Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options32,null);
if(g==4) {
	String f = JOptionPane.showInputDialog(null, "What do you want to change your name to, player2");
	if(f.contentEquals(f.substring(0))) {
		name2="";
		name2= name2 + f.substring(0);
	}
				}
				if(b==0) {
					if(b==g) {
						Window.msg2(name1 + " and "+ name2 + " chose rock, you both tied",rvr);						
						
					}
					else if(g==1) {
						pscore = pscore + 1;
						//JOptionPane.showMessageDialog(null, name1+ "chose rock"+ name2+" chose paper, you lost this round");
						Window.msg2(name1+ " chose rock. "+ name2+" chose paper, "+name1+ " lost this round",rvp);						

					}
					else if(g==2) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose scissors, you won this round");
						Window.msg2(name1+ " chose rock. "+ name2+" chose scissors, "+name2+ " lost this round",rvs);						

					}
				}
				else if(b==1) {

					if(b==g) {
						//JOptionPane.showMessageDialog(null, "The other player chose paper, you tie this round");
						Window.msg2(name1 + " and "+ name2 + " chose paper, you both tied",pvp);						

					}
					else if(g==0) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose rock, you won this round");
						Window.msg2(name1+ " chose paper. "+ name2+" chose rock, "+name2+ " lost this round",pvr);						

					}
					else if(g==2) {
						pscore = pscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose scissors, you lost this round");
						Window.msg2(name1+ " chose paper. "+ name2+" chose scissors, "+name1+ " lost this round",pvs);						

					}
				}
				else if(b==2) {

					if(b==g) {
						Window.msg2(name1 + " and "+ name2 + " chose scissors, you both tied",svs);						
						
					}
					else if(g==1) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose paper, you won this round");
						Window.msg2(name1+ " chose scissors. "+ name2+" chose paper, "+name2+ " lost this round",svp);						

					}
					else if(g==0) {
						pscore = pscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose rock, you lost this round");
						Window.msg2(name1+ " chose scissors. "+ name2+" chose rock, "+name1+ " lost this round",svr);						

					}
				}
				
			}
				
			}
		
		
	}
	public static void hi() {
    	ImageIcon icon = new ImageIcon(main.class.getResource("rps.png"));
    	ImageIcon pvp = new ImageIcon(main.class.getResource("p v p.JPG"));
    	ImageIcon pvr = new ImageIcon(main.class.getResource("p v r.JPG"));
    	ImageIcon pvs = new ImageIcon(main.class.getResource("p v s.JPG"));
    	ImageIcon rvr = new ImageIcon(main.class.getResource("rock v rock.JPG"));
    	ImageIcon rvs = new ImageIcon(main.class.getResource("r v s.JPG"));
    	ImageIcon rvp = new ImageIcon(main.class.getResource("r v p.JPG"));
    	ImageIcon svs = new ImageIcon(main.class.getResource("s vs s.JPG"));
    	ImageIcon svr = new ImageIcon(main.class.getResource("s v r.JPG"));
    	ImageIcon svp = new ImageIcon(main.class.getResource("s v p.JPG"));
    	UIManager.put("Button.background", Color.orange);
        UIManager.put("Panel.background", Color.YELLOW);
        UIManager.put("OptionPane.background", Color.CYAN);

  	  int s = Window.option1(options, "Would you like to play Rock, Paper, Scissors", icon);
		if(s==0) {
			String f = JOptionPane.showInputDialog(null, "What is your name, player1");
			if(f.contentEquals(f.substring(0))) {
				name1 = name1 + f.substring(0);
			}
			int a  = JOptionPane.showOptionDialog(null, "Select your game mode:"+ " Total rounds played: "+tot,"Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options2,null);
			if(a==2) {
				System.exit(0);
			}
			if(a==0) {
				total = 0;
				yscore = 0;
				pscore = 0;
				rscore=0;				
				while(total <3) {
				if(yscore == 3 && rscore!=3) {
					p1.add(1);
					tot = tot+1;

					JOptionPane.showMessageDialog(null, "You won against the computer");
					ycnt = ycnt +1;
					int d  = JOptionPane.showOptionDialog(null,"Would you like to play another round of Rock, Paper, Scissors","Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
					if(d==0) {
						hi2();
						name1 = "";
						name2="";
					}
					if(d==1) {
						JOptionPane.showMessageDialog(null, "Thanks for playing, here are the scores of all the rounds youve played: " + name1 + ": " + ycnt + ". Computer: " + rcnt + ". Other Player: " + name2 + ": " + pcnt);
						
						System.exit(0);
					}
					if(d==2) {
						JOptionPane.showMessageDialog(null, name1 + "'s high score: "+ycnt + ", "+ " Computers high score: " +rcnt + ", Player two:"+name2 + "'s high score: " + pcnt);
						hi2();

					}
					
				}
				
				else if(rscore == 3 && yscore!=3) {
					JOptionPane.showMessageDialog(null, "You lost against the computer");
					computer.add(1);
					tot = tot+1;

					rcnt = rcnt+1;
					int d  = JOptionPane.showOptionDialog(null,"Would you like to play another round of Rock, Paper, Scissors","Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
					if(d==0) {
						name1 = "";
						name2="";
						hi2();
					}
					if(d==1) {
						JOptionPane.showMessageDialog(null, "Thanks for playing, here are the scores of all the rounds youve played: " + name1 + ": " + ycnt + ". Computer: " + rcnt + ". Other Player: " + name2 + ": " + pcnt);
						System.exit(0);
					}
					if(d==2) {
						JOptionPane.showMessageDialog(null, name1 + "'s high score: "+ycnt + ", "+ " Computers high score: " +rcnt + ", Player two:"+name2 + "'s high score: " + pcnt);
						hi2();

					}
				}
				int b  = JOptionPane.showOptionDialog(null, "Select what you want to play" + "Your score: " + yscore + " Computer score: " +  rscore,"Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);

				if(b==0) {
					JOptionPane.showMessageDialog(null, "The computer is choosing now...." );

					int c = (int)(Math.random()*3);
					if(b==c) {
						Window.msg2("The computer chose rock you tied",rvr);						
					}
					else if(c==1) {
						rscore = rscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose paper, you lost this round");
						Window.msg2("The computer chose paper, you lost this round", rvp);
					}
					else if(c==2) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose scissors, you won this round");
						Window.msg2("The computer chose scissors, you won this round", rvs);
					}
				}
				else if(b==1) {
					JOptionPane.showMessageDialog(null, "The computer is choosing now...." );

					int c = (int)(Math.random()*3);
					if(b==c) {
						Window.msg2("The computer chose paper, you tie this round",pvp);
					
						
					}
					else if(c==0) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose rock, you won this round");
						Window.msg2("The computer chose rock, you won this round",pvr);

					}
					else if(c==2) {
						rscore = rscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose scissors, you lost this round");
						Window.msg2("The computer chose scissors, you lost this round",pvs);

					}
				}
				else if(b==2) {
					JOptionPane.showMessageDialog(null, "The computer is choosing now...." );

					int c = (int)(Math.random()*3);
					if(b==c) {
						//JOptionPane.showMessageDialog(null, "The computer chose scissors, you tie this round");
						Window.msg2("The computer chose scissors, you tie this round",svs);

						
					}
					else if(c==1) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose paper, you won this round");
						Window.msg2("The computer chose paper, you won this round",svp);

					}
					else if(c==0) {
						rscore = rscore + 1;
						//JOptionPane.showMessageDialog(null, "The computer chose rock, you lost this round");
						Window.msg2("The computer chose rock, you lost this round",svr);

					}
				}
				else if(b==3){
					System.exit(0);
				}
			}
			
			}
			
			if(a==1) {
				total = 0;
				yscore = 0;
				pscore = 0;
				rscore=0;String j= JOptionPane.showInputDialog(null, "What is your name, player2");
					if(j.contentEquals(j.substring(0))) {
						name2 = name2 + j.substring(0);
					}		
				while(total <3) {
						
				
				if(yscore == 3 && pscore!=3) {
					p1.add(1
							);
					tot = tot+1;

					JOptionPane.showMessageDialog(null, "You won against the other player");
					ycnt = ycnt +1;
					int d  = JOptionPane.showOptionDialog(null,"Would you like to play another round of Rock, Paper, Scissors","Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
					if(d==0) {
						hi2();
						name1 = "";
						name2="";
					}
					if(d==1) {
						JOptionPane.showMessageDialog(null, "Thanks for playing, here are the scores of all the rounds youve played: " + name1 + ": " + ycnt + ". Computer: " + rcnt + ". Other Player: " + name2 + ": " + pcnt);
						
						System.exit(0);
					}
					if(d==2) {
						JOptionPane.showMessageDialog(null, name1 + "'s high score: "+ycnt + ", "+ " Computers high score: " +rcnt + ", Player two:"+name2 + "'s high score: " + pcnt);
						hi2();

					}
					
				}
				
				else if(pscore == 3 && yscore!=3) {
					JOptionPane.showMessageDialog(null, "You lost against the other player");
					p2.add(1);
					tot = tot+1;

					pcnt = pcnt+1;
					int d  = JOptionPane.showOptionDialog(null,"Would you like to play another round of Rock, Paper, Scissors","Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
					if(d==0) {
						name1 = "";
						name2="";
						hi2();
					}
					if(d==1) {
						JOptionPane.showMessageDialog(null, "Thanks for playing, here are the scores of all the rounds youve played: " + name1 + ": " + ycnt + ". Computer: " + rcnt + ". Other Player: " + name2 + ": " + pcnt);
						System.exit(0);
					}
					if(d==2) {
						JOptionPane.showMessageDialog(null, name1 + "'s high score: "+ycnt + ", "+ " Computers high score: " +rcnt + ", Player two:"+name2 + "'s high score: " + pcnt);
						hi2();

					}				}
				int b  = JOptionPane.showOptionDialog(null, "Select what you want to play" + "Your score: " + yscore + "Other players score: " +  pscore,"Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				if(b==3){
					System.exit(0);
				}
				int g = JOptionPane.showOptionDialog(null, "Other player selects what to play" + "Your score: " + yscore + "Other players score: " +  pscore,"Rock,Paper,Scissors",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);

				if(b==0) {
					if(b==g) {
						Window.msg2(name1 + " and "+ name2 + " chose rock, you both tied",rvr);						
						
					}
					else if(g==1) {
						pscore = pscore + 1;
						//JOptionPane.showMessageDialog(null, name1+ "chose rock"+ name2+" chose paper, you lost this round");
						Window.msg2(name1+ " chose rock. "+ name2+" chose paper, "+name1+ " lost this round",rvp);						

					}
					else if(g==2) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose scissors, you won this round");
						Window.msg2(name1+ " chose rock. "+ name2+" chose scissors, "+name2+ " lost this round",rvs);						

					}
				}
				else if(b==1) {

					if(b==g) {
						//JOptionPane.showMessageDialog(null, "The other player chose paper, you tie this round");
						Window.msg2(name1 + " and "+ name2 + " chose paper, you both tied",pvp);						

					}
					else if(g==0) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose rock, you won this round");
						Window.msg2(name1+ " chose paper. "+ name2+" chose rock, "+name2+ " lost this round",pvr);						

					}
					else if(g==2) {
						pscore = pscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose scissors, you lost this round");
						Window.msg2(name1+ " chose paper. "+ name2+" chose scissors, "+name1+ " lost this round",pvs);						

					}
				}
				else if(b==2) {

					if(b==g) {
						Window.msg2(name1 + " and "+ name2 + " chose scissors, you both tied",svs);						
						
					}
					else if(g==1) {
						yscore = yscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose paper, you won this round");
						Window.msg2(name1+ " chose scissors. "+ name2+" chose paper, "+name2+ " lost this round",svp);						

					}
					else if(g==0) {
						pscore = pscore + 1;
						//JOptionPane.showMessageDialog(null, "The other player chose rock, you lost this round");
						Window.msg2(name1+ " chose scissors. "+ name2+" chose rock, "+name1+ " lost this round",svr);						

					}
				}
				
			}
				
			}
		}
		if(s==1) {
			JOptionPane.showMessageDialog(null, "Thanks for looking at my game, made by Angel Montenegro");
		}
	}
}
