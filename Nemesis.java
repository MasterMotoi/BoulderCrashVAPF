import java.util.concurrent.TimeUnit;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Nemesis extends Character {
	
		//suivre les murs et lorsqu'un choix de plusieurs chemin se pose, il faut aller à gauche.
		// Créer la méthode LeftWall
	
	void LeftWall(){
		/*
		 Suivre le tunnel
		 Poulpe --> 2 (2 = tunnel)
		 */
		int timer;
		
		getX();
		getY();
		
		int S = x;
		int T = y;
		
		int i = S-1;
		int j = T-1;
		int k = T+1;
		
		/* 
		 Pause 500
		 */
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 500){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/.png");//Choisir l'image qui correspond en fonction du montre.
				return ic.getImage();
			}
				
		}
		
		if (i == 2){
			x = x-1;
			
			getX();
			getY();
			
			LeftWall();
			
		}
		
		else if (j == 2){
			y = y-1;
			
			getX();
			getY();
			
			LeftWall();
		}
		
		else if (k == 2){
			y = y+1;
			
			getX();
			getY();
			
			LeftWall();
		}
		
		else {
			x = x+1;
			
			getX();
			getY();
			
			LeftWall();
		}
		

		
		
		
		

		 
		/*
		 Analyse du terrain :
		 	Si la case à gauche est vide (tunnel) on y va.
		 	Si la case du bas est libre on y va.
		 	Si la case du haut est libre on y va.
		 	Sinon retourner sur la case précédente.
		 	
		 */
	}
	
		/*
		  
		 bom
		 */
	
	void movingOctopus() {
		
		int i = 0;
		int j = 0;
		
		int timer;
		
		while(i != 2 || j != 2){ // 2 est le cas du tunnel.
		
		/*Il va falloir déplacer (Exemple) l'ennemi pingoin. Il va falloir avoir un espace de 9 carrés vides.
		Il est sur la case départ.
		Wait 1s
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		
		
		/*
		Analyse si la case de gauche ou du dessous est vide. 
			Si oui : LeftWall()
			Si non : Aller sur la case au dessus de celle_ci (Verti +1)
		*/	
		int A = x; //Def de la position initiale du pingoin
		int B = y; // Def de la position initiale du pingoin
		
		i = A-1;
		j = B-1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else if (j == 2){
			LeftWall();
		}
		
		else {
			A = A+1;
		}
		
		x = A;
		y = B;
		
		/*	
		Case gauche
		Wait 50 mili sec
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 500){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		
		/*
		
		Analyse si la case de gauche est vide.
			Si oui : LeftWall()
			Si non aller sur la case du milieu (Horiz +1)
			
		*/
		
		int C = x; //Def de la position du pingoin
		int D = y; // Def de la position du pingoin
		
		i = C-1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else {
			C = C+1;
		}
		
		x = C;
		y = D;
		
		/*
		Case milieu
		Wait 1 sec
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		/*
		Case droite
		Wait 50 mili sec
		*/
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 500){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		/*
		Analyse si la case de droite est vide.
			Si oui : LeftWall()
			Si non : Verti -1
		*/
		
		int E = x; //Def de la position du pingoin
		int F = y; // Def de la position du pingoin
		
		i = E+1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else {
			F = F-1;
		}
		
		x = E;
		y = F;
		
		/*	
		Case bas
		Wait 1s
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		/*
		Analyse droite bas
			oui : -
			non : Verti +1
		*/
		
		int G = x; //Def de la position initiale du pingoin
		int H = y; // Def de la position initiale du pingoin
		
		i = G+1;
		i = H-1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else if (j == 2){
			LeftWall();
		}
		
		else {
			H = H+1;
		}
		
		x = G;
		y = H;
		
		/*	
		Case IntermDroite
		Wait 50 mili sec
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 500){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		/*
		Anlyse : droite
			oui : -
			non : vert +1
		*/
		
		int I = x; //Def de la position du pingoin
		int J = y; // Def de la position du pingoin
		
		i = I+1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else {
			J = J+1;
		}
		
		x = I;
		y = J;
		
		/*
		Case HautDroite
		Wait 1s
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		/*
		Analyse : droite haut
			oui : -
			non horiz -1
		*/
		
		int K = x; //Def de la position initiale du pingoin
		int L = y; // Def de la position initiale du pingoin
		
		i = K+1;
		j = L+1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else if (j == 2){
			LeftWall();
		}
		
		else {
			L = L-1;
		}
		
		x = K;
		y = L;
		
		
		/*	
		Case milieuHaut
		Wait50 mili sec
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 500){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		/*
		Analyse : haut
			oui : -
			non : horiz -1
		*/
		
		int M = x; //Def de la position du pingoin
		int N = y; // Def de la position du pingoin
		
		i = M+1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else {
			M = M-1;
		}
		
		x = M;
		y = N;
		
		/*	
		Case HautGauche
		Wait 1s
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		/*
		Analyse : haut gauche
			oui : -
			non : vert -1
		*/
		
		int O = x; //Def de la position initiale du pingoin
		int P = y; // Def de la position initiale du pingoin
		
		i = O+1;
		j = P-1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else if (j == 2){
			LeftWall();
		}
		
		else {
			O = O-1;
		}
		
		x = O;
		y = P;
		
		/*	
		Case Mileu Gauche
		Wait 50 mili sec
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Pouple.png");
				return ic.getImage();
			}
				
		}
		
		/*
		Analyse : gauche
			oui : -
			non : verti -1
		*/
		
		int Q = x; //Def de la position du pingoin
		int R = y; // Def de la position du pingoin
		
		i = Q-1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else {
			R = R-1;
		}
		
		x = Q;
		y = R;
		
		/*
			
		Boucle 
		
		
		
		
		*/
		}
		
	}
	
	
	void movingButterfly(){
		int i = 0;
		int j = 0;
		
		int timer;
		
		while(i != 2 || j != 2){ // 2 est le cas du tunnel.
		
		/*Il va falloir déplacer l'ennemi papillon. Il va falloir avoir un espace de 4 carrés vides.
		Il est sur la case départ.
		Wait 1s
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Papillon.png");
				return ic.getImage();
			}
				
		}
		
		
		
		/*
		Analyse si la case de gauche ou du dessous est vide. 
			Si oui : LeftWall()
			Si non : Aller sur la case à droite de celle_ci (Horiz +1)
		*/	
		int A = x; //Def de la position initiale du papillon
		int B = y; // Def de la position initiale du papillon
		
		i = A-1;
		j = B-1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else if (j == 2){
			LeftWall();
		}
		
		else {
			B = B+1;
		}
		
		x = A;
		y = B;
		
		/*	
		Case droite
		Wait 1 sec
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/Papillon.png");
				return ic.getImage();
			}
		}
		
			int C = x; //Def de la position initiale du papillon
			int D = y; // Def de la position initiale du papillon
			
			i = C+1;
			j = D-1;
			
			if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
				LeftWall();	
			}
			
			else if (j == 2){
				LeftWall();
			}
			
			else {
				D = D+1;
			}
			
			x = C;
			y = D;
			
			getX();
			getY();
			
			timer = 0;
			
			while (true){
				timer ++;
				
				if (timer < 1000){
					ImageIcon ic = new ImageIcon("C:/Img/Monstres/Papillon.png");
					return ic.getImage();
				}
			}
				int E = x; //Def de la position initiale du papillon
				int F = y; // Def de la position initiale du papillon
				
				i = E+1;
				j = F+1;
				
				if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
					LeftWall();	
				}
				
				else if (j == 2){
					LeftWall();
				}
				
				else {
					E = E-1;
				}
				
				x = E;
				y = F;
				
				getX();
				getY();
				
				timer = 0;
				
				while (true){
					timer ++;
					
					if (timer < 1000){
						ImageIcon ic = new ImageIcon("C:/Img/Monstres/Papillon.png");
						return ic.getImage();
					}
				}
				
					int G = x; //Def de la position initiale du papillon
					int H = y; // Def de la position initiale du papillon
					
					i = G-1;
					j = H+1;
					
					if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
						LeftWall();	
					}
					
					else if (j == 2){
						LeftWall();
					}
					
					else {
						H = H-1;
					}
					
					x = G;
					y = H;
				
			
				
			
		}
	}
	
	void movingBat(){
		int i = 0;
		int j = 0;
		int k = 0;
		
		int timer;
		
		while(i != 2 || j != 2 || k!= 2){ // 2 est le cas du tunnel.
		
		/*Il va falloir déplacer l'ennemi papillon. Il va falloir avoir un espace de 4 carrés vides.
		Il est sur la case départ.
		Wait 1s
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/ChauveSouris.png");
				return ic.getImage();
			}
				
		}
		
		int A = x; 
		int B = y;
		
		i = A-1;
		j = B-1;
		k = B +1;
		
		if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
			LeftWall();	
		}
		
		else if (j == 2){
			LeftWall();
		}
		
		else if (k ==2){
			LeftWall();
		}
		
		else {
			A = A+1;
		}
		
		x = A;
		y = B;
		
		/*	
		Case droite
		Wait 1 sec
		*/
		
		getX();
		getY();
		
		timer = 0;
		
		while (true){
			timer ++;
			
			if (timer < 1000){
				ImageIcon ic = new ImageIcon("C:/Img/Monstres/ChauveSouris.png");
				return ic.getImage();
			}
		}
		
			int C = x; //Def de la position initiale du papillon
			int D = y; // Def de la position initiale du papillon
			
			i = D+1;
			j = D-1;
			
			if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
				LeftWall();	
			}
			
			else if (j == 2){
				LeftWall();
			}
			
			else {
				C = C+1;
			}
			
			x = C;
			y = D;
			
			getX();
			getY();
			
			timer = 0;
			
			while (true){
				timer ++;
				
				if (timer < 1000){
					ImageIcon ic = new ImageIcon("C:/Img/Monstres/ChauveSouris.png");
					return ic.getImage();
				}
			}
				int E = x; //Def de la position initiale du papillon
				int F = y; // Def de la position initiale du papillon
				
				i = F+1;
				j = F-1;
				
				if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
					LeftWall();	
				}
				
				else if (j == 2){
					LeftWall();
				}
				
				else {
					E = E+1;
				}
				
				x = E;
				y = F;
				
				getX();
				getY();
				
				timer = 0;
				
				while (true){
					timer ++;
					
					if (timer < 1000){
						ImageIcon ic = new ImageIcon("C:/Img/Monstres/ChauveSouris.png");
						return ic.getImage();
					}
				}
				
					int G = x; //Def de la position initiale du papillon
					int H = y; // Def de la position initiale du papillon
					
					i = G+1;
					j = H+1;
					k = H-1;
					
					if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
						LeftWall();	
					}
					
					else if (j == 2){
						LeftWall();
					}
					
					else if (k == 2){
						LeftWall();
					}
					
					else {
						G = G-1;
					}
					
					x = G;
					y = H;
					
					getX();
					getY();
					
					timer = 0;
					
					while (true){
						timer ++;
						
						if (timer < 1000){
							ImageIcon ic = new ImageIcon("C:/Img/Monstres/ChauveSouris.png");
							return ic.getImage();
						}
							
					}
					
					
					
					/*
					Analyse si la case de gauche ou du dessous est vide. 
						Si oui : LeftWall()
						Si non : Aller sur la case à droite de celle_ci (Horiz +1)
					*/	
					int I = x; //Def de la position initiale du papillon
					int J = y; // Def de la position initiale du papillon
					
					i = J+1;
					j = J-1;
					
					if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
						LeftWall();	
					}
					
					else if (j == 2){
						LeftWall();
					}
					
					else {
						I = I-1;
					}
					
					x = I;
					y = J;
					
					/*	
					Case droite
					Wait 1 sec
					*/
					
					getX();
					getY();
					
					timer = 0;
					
					while (true){
						timer ++;
						
						if (timer < 1000){
							ImageIcon ic = new ImageIcon("C:/Img/Monstres/ChauveSouris.png");
							return ic.getImage();
						}
					}
					
						int K = x; //Def de la position initiale du papillon
						int L = y; // Def de la position initiale du papillon
						
						i = L+1;
						j = L-1;
						
						if (i == 2){ //Le 2 correspond à l'état de l'image == tunnel
							LeftWall();	
						}
						
						else if (j == 2){
							LeftWall();
						}
						
						else {
							K = K-1;
						}
						
						x = K;
						y = L;
				
			
		}
	}
	
	
	void nemesisBim(){
		
	}
	
	void explosion(){
		
	}
	
}
