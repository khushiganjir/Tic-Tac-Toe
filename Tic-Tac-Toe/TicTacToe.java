//Program to make tic-tac-toe

import java.awt.*;
import java.awt.event.*;

class TicTacToe extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	int t=1,c1=0,c2=0;
	Label l1,l2,l3,l4;
	
	TicTacToe()
	{
		b1=new Button();
		b2=new Button();
		b3=new Button();

		b4=new Button();
		b5=new Button();
		b6=new Button();

		b7=new Button();
		b8=new Button();
		b9=new Button();

		l1=new Label();

		l2=new Label();
		l3=new Label();

		l4=new Label();

		


		setLayout(null);

		b1.setBounds(100,100,40,40);
		b2.setBounds(150,100,40,40);
		b3.setBounds(200,100,40,40);

		b4.setBounds(100,150,40,40);
		b5.setBounds(150,150,40,40);
		b6.setBounds(200,150,40,40);

		b7.setBounds(100,200,40,40);
		b8.setBounds(150,200,40,40);
		b9.setBounds(200,200,40,40);

		l1.setBounds(300,300,300,40);

		l2.setBounds(100,50,70,40);

		l3.setBounds(300,50,70,40);

		l4.setBounds(300,400,300,40);




		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);

		add(l1);
		add(l2);
		add(l3);
		add(l4);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);


	}	

		void restart()
		{

			b1.setLabel("");
			b2.setLabel("");
			b3.setLabel("");
			b4.setLabel("");
			b5.setLabel("");
			b6.setLabel("");
			b7.setLabel("");
			b8.setLabel("");
			b9.setLabel("");

			t=1;
		}


	// t is used to change the value * and 0
	public void actionPerformed(ActionEvent e)
	{

		if(e.getSource()==b1)
		{
			if(b1.getLabel().length()==0)
			{
			if(t%2==1)
			{
				b1.setLabel("*");
			}
			else
			{
				b1.setLabel("0");
			}
			t=t+1;
		}
		}
		if(e.getSource()==b2)
		{
			if(b2.getLabel().length()==0)
			{
			if(t%2==1)
			{
				b2.setLabel("*");
			}
			else
			{
				b2.setLabel("0");
			}
			t=t+1;
		}
		}
		if(e.getSource()==b3)
		{
			if(b3.getLabel().length()==0)
			{
			if(t%2==1)
			{
				b3.setLabel("*");
			}
			else
			{
				b3.setLabel("0");
			}
			t=t+1;
		}
		}
		if(e.getSource()==b4)
		{
			if(b4.getLabel().length()==0)
			{
			if(t%2==1)
			{
				b4.setLabel("*");
			}
			else
			{
				b4.setLabel("0");
			}
			t=t+1;
		}
		}
		if(e.getSource()==b5)
		{
			if(b5.getLabel().length()==0)
			{
			if(t%2==1)
			{
				b5.setLabel("*");
			}
			else
			{
				b5.setLabel("0");
			}
			t=t+1;
		}
		}
		if(e.getSource()==b6)
		{
			if(b6.getLabel().length()==0)
			{
			if(t%2==1)
			{
				b6.setLabel("*");
			}
			else
			{
				b6.setLabel("0");
			}
			t=t+1;
		}
		}
		if(e.getSource()==b7)
		{
			if(b7.getLabel().length()==0)
			{
			if(t%2==1)
			{
				b7.setLabel("*");
			}
			else
			{
				b7.setLabel("0");
			}
			t=t+1;
		    }
		}
		
		if(e.getSource()==b8)
		{
			if(b8.getLabel().length()==0)
			{
			if(t%2==1)
			{
				b8.setLabel("*");
			}
			else
			{
				b8.setLabel("0");
			}
			t=t+1;
		}
		}
		if(e.getSource()==b9)
		{
			if(b9.getLabel().length()==0)
			{
			if(t%2==1)
			{
				b9.setLabel("*");
			}
			else
			{
				b9.setLabel("0");
			}
			t=t+1;
		}
		}

		//Code for finding winner

		String a1=b1.getLabel();
		String a2=b2.getLabel();
		String a3=b3.getLabel();
		String a4=b4.getLabel();
		String a5=b5.getLabel();
		String a6=b6.getLabel();
		String a7=b7.getLabel();
		String a8=b8.getLabel();
		String a9=b9.getLabel();

		if(a1.length()!=0 && a2.length()!=0 && a3.length()!=0)
		{
			if(a1.equals(a2) && a1.equals(a3))
			{
				if(a1.equals("*"))
				{
					System.out.println("Player 1 is a winner");
					l1.setText("Player 1 is a winner");
					c1=c1+1;
					l2.setText("PLAYER 2 "+String.valueOf(c1)); //String.valueOf(c1) is to print score of player 1 (it will convert the int value of c1 to string)
				}
				else
				{
					System.out.println("Player 2 is a winner");
					l1.setText("Player 2 is a winner");
					c2=c2+1;
					l3.setText("PLAYER 1 "+String.valueOf(c2));
				}

				restart();
			}
		}

		l2.setText("PLAYER 1 "+String.valueOf(c1));

		l3.setText("PLAYER 2 "+String.valueOf(c2));
		
		if(a4.length()!=0 && a5.length()!=0 && a6.length()!=0)
		{
			if(a4.equals(a5) && a4.equals(a6))
			{
				if(a4.equals("*"))
				{
					System.out.println("Player 1 is a winner");
					l1.setText("Player 1 is a winner");

					c1=c1+1;
					l2.setText("PLAYER 1 "+String.valueOf(c1));
				}
				else
				{
					System.out.println("Player 2 is a winner");
					l1.setText("Player 2 is a winner");

					c2=c2+1;
					l3.setText("PLAYER 2 "+String.valueOf(c2));
				}
				restart();
			}
		}

		if(a7.length()!=0 && a8.length()!=0 && a9.length()!=0)
		{
			if(a7.equals(a8) && a7.equals(a9))
			{
				if(a7.equals("*"))
				{
					System.out.println("Player 1 is a winner");
					l1.setText("Player 1 is a winner");

					c1=c1+1;
					l3.setText("PLAYER 1 "+String.valueOf(c1));
				}
				else
				{
					System.out.println("Player 2 is a winner");
					l1.setText("Player 2 is a winner");

					c2=c2+1;
					l3.setText("PLAYER 2 "+String.valueOf(c2));
				}
				restart();
			}
		}

		if(a1.length()!=0 && a5.length()!=0 && a9.length()!=0)
		{
			if(a1.equals(a5) && a1.equals(a9))
			{
				if(a1.equals("*"))
				{
					System.out.println("Player 1 is a winner");
					l1.setText("Player 1 is a winner");

					c1=c1+1;
					l2.setText("PLAYER 1 "+String.valueOf(c1));
				}
				else
				{
					System.out.println("Player 2 is a winner");
					l1.setText("Player 2 is a winner");

					c2=c2+1;
					l3.setText("PLAYER 2 "+String.valueOf(c2));

				}
				restart();
			}
		}

		if(a3.length()!=0 && a5.length()!=0 && a7.length()!=0)
		{
			if(a3.equals(a5) && a3.equals(a7))
			{
				if(a3.equals("*"))
				{
					System.out.println("Player 1 is a winner");
					l1.setText("Player 1 is a winner");

					c1=c1+1;
					l2.setText("PLAYER 1 "+String.valueOf(c1));
				}
				else
				{
					System.out.println("Player 2 is a winner");
					l1.setText("Player 2 is a winner");

					c2=c2+1;
					l3.setText("PLAYER 2 "+String.valueOf(c2));
				}
			}
		}

		if(a1.length()!=0 && a4.length()!=0 && a7.length()!=0)
		{
			if(a1.equals(a4) && a1.equals(a7))
			{
				if(a1.equals("*"))
				{
					System.out.println("Player 1 is a winner");
					l1.setText("Player 1 is a winner");

					c1=c1+1;
					l2.setText("PLAYER 1 "+String.valueOf(c1));
				}
				else
				{
					System.out.println("Player 2 is a winner");
					l1.setText("Player 2 is a winner");

					c2=c2+1;
					l3.setText("PLAYER 2 "+String.valueOf(c2));
				}
				restart();
			}
		}

		if(a2.length()!=0 && a5.length()!=0 && a8.length()!=0)
		{
			if(a2.equals(a5) && a2.equals(a8))
			{
				if(a2.equals("*"))
				{
					System.out.println("Player 1 is a winner");
					l1.setText("Player 1 is a winner");

					c1=c1+1;
					l2.setText("PLAYER 1 "+String.valueOf(c1));
				}
				else
				{
					System.out.println("Player 2 is a winner");
					l1.setText("Player 2 is a winner");

					c2=c2+1;
					l3.setText("PLAYER 2 "+String.valueOf(c2));
				}
				restart();
			}
		}

	

	if(a3.length()!=0 && a6.length()!=0 && a9.length()!=0)
		{
			if(a3.equals(a6) && a3.equals(a9))
			{
				if(a3.equals("*"))
				{
					System.out.println("Player 1 is a winner");
					l1.setText("Player 1 is a winner");

					c1=c1+1;
					l2.setText("PLAYER 1 "+String.valueOf(c1));
				}
				else
				{
					System.out.println("Player 2 is a winner");
					l1.setText("Player 2 is a winner");

					c2=c2+1;
					l3.setText("PLAYER 2 "+String.valueOf(c2));
				}
				restart();

			}
		}

		if(t==10)
		{
			System.out.println("draw");
			restart();
		}

		if(c1==3)
		{
			System.out.println("Player 1 is a game winner");
					l4.setText("Player 1 is a game winner");
					c1=0;
					c2=0;

		}
		else if(c2==3)
		{
			System.out.println("Player 2 is a game winner");
					l4.setText("Player 2 is a game winner");

			
		c2=0;		
		c2=0;
		}
		
	}


	public static void main(String[] args) 
	{
		TicTacToe obj= new TicTacToe();
		obj.setSize(100,300);
		obj.setVisible(true);
	}
}