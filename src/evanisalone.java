import java.util.Scanner;
public class evanisalone {

	private static Scanner sc;

	public static void main(String[] args) {
		Evan Evan= new Evan();
		sc = new Scanner(System.in);
		System.out.println("Welcome to Evan Is Alone. this game will explain itself as you go but first a tip. Pick up any object you run into, you never know if you might need it. Also, try to only visit the rooms once, and only pick things up once. GOOD LUCK!  \n\n");
		String answer="";
		System.out.println("Would you like to play? \n");
		answer = sc.next();

		if (answer.equalsIgnoreCase("No")){
			System.out.println("Ok...");
			return;
		} else if(answer.equalsIgnoreCase("Yes")){

			System.out.println(" Evan wakes up at his desk, unaware of what time it is. "
					+ "He is sitting at his desk in the Corporation, and notices all the"
					+ " lights are off. Evan is a code monkey and loves pushing buttons "
					+ "all day, but he knows he wants to get out. But first, he’s actually "
					+ "got to get out. It looks as if the all the lights are down and its "
					+ "too dark to do anything. Lets try and find a flashlight and he knows he needs "
					+ "his keycard if he's going to go anywhere off this floor via the elevator."
					+ " It's not on the desk, so where could he have left it?");
			answer="";
			System.out.println(" \n \n Evan can go to the Stairs, Elevator, Breakroom or Bathroom.  \n" );

			System.out.println("Which Room Would you like to investigate?");
			boolean condition = true;
			while(condition==true){

				String room = sc.next();
				try{
					switch (room) {

					case "Cubicle" :  
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						System.out.println("Evans Desk. Looks Like he could use a bit of spring cleaning.");
						System.out.println("\n \n Evan can go to the Stairs, Elevator, Breakroom or Bathroom.  \n");
						System.out.println("Which Room Would you like to investigate?");
						break;

					case "Breakroom":   
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						System.out.println(" Ah the smell of coffee and Donuts abound. This is Evans favorite spot to chill. They have a giant space here for the employees to enjoy with arm chairs and sofas, little tables, some outlets for your devices and of course, fridges and coffee makers. Evan moves around the room carefully and checks the drawers for the backup flashlight he knows he left here. Its right underneath the sink, and its got batteries in it.");
						System.out.println("\n Will you pick up the Flashlight?");
						answer= sc.next();
						if (answer.equalsIgnoreCase("Yes")){
							Evan.setflashlight(condition);
							System.out.println("\n He can move towards the Bathroom, Third Floor, Cubicle, Elevator or Stairs.");
						} else
							System.out.println(" Did not pick up \n\n He can move towards the Bathroom, Third Floor, Cubicle, Elevator or Stairs.");
						System.out.println("\n Which Room Would you like to investigate?");
						break;

					case "Third": 
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						System.out.println(" Back on the 3rd floor, Evan can see his tiny cubicle sitting over by the window. His little desk lamp shines just enough light from its battery powered body. \n\n He can move towards the Bathroom, Breakroom, Cubicle, Elevator or Stairs.");
						System.out.println("Which Room Would you like to investigate?");
						break;

					case "Elevator": 
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==true){
							System.out.println("He makes his way to the emergency freights elevator, swiping the card and hoping it works. It does. The elevator arrives shortly thereafter and the doors open. He steps into the elevator. \n\n He can go to The Basement, First, Third, Fifth or Seventh Floor.");
						}else if(Evan.getbadge()==false){
							System.out.println("Its Just Stairs");
						}else
							System.out.println("Go to the Stairs and Turn on the power on. Which Room Would you like to investigate, Bathroom, Breakroom, Stairs, or Cubicle");
						break;

					case "Bathroom":  
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						System.out.println("Ah, the company bathroom, a place few desire to remain in for more than a few minutes. Especially if larry, is in, because he can leave it feeling like a war zone. Trying to be quick and clean, Evan walks in and bumps into the hand dryer on the wall. He fumbles around looking for the light switch, flicks it and nothing happens. Evan walks over to the sink and feels around till he finds a credit card shaped piece of plastic, almost assuredly his ID. Once he’s got this, he’s able to go around the other floors, thanks to the offices new keyless upgrade.");
						System.out.println("\n Will you pick up the ID Badge?");
						answer= sc.next();
						if (answer.equalsIgnoreCase("Yes")){
							Evan.setbadge(condition);
							System.out.println("\n He can move towards the Breakroom, Third Floor, Cubicle, Elevator or Stairs.");
						} else
							System.out.println("\n He can move towards the Breakroom, Third Floor, Cubicle, Elevator or Stairs.");
						System.out.println("\n Which Room Would you like to investigate?");
						break;

					case "Stairs": 
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getflashlight() == true){
							System.out.println("Stairwells are scary, but Evan is Brave, now that hes got his flashlight");
							System.out.println("\n Which floor would you like to walk to, Basement, First, Third, Fifth, Seventh or Roof?");
						}else if(Evan.getpoweron()==true){
							System.out.println("Its Just Stairs");
							System.out.println("\n Which floor would you like to walk to, Basement, First, Third, Fifth, Seventh or Roof?");
						}else if(Evan.getflashlight()==false)
							System.out.println("Go get a Flashlight, It's probably in the Bathroom or Breakroom");
						break;

					case "Basement":
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						System.out.println(" The basement is cold and musty. The sound of water running through the pipes can be heard overhead. There are very dim emergency lights illuminating his path with a pale blue glow. The footsteps make a squishing sound as he walks through the basement.\n\n He can go to The Mail Room, Storage Room, Server Room, Elevator, or Stairs.");
						System.out.println("\n Which Room Would you like to investigate?");
						break;

					case "Storage":  
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						System.out.println("The only light in the room is coming from the emergency lights in the hallway of the basement. He starts to make his way to the back of the room, careful to walk slowly so he doesn't trip over anything laying around. Despite his caution, he trips a few times. Once he finally makes it to the back, he starts feeling around the shelves where he knows an extra set of janitorial keys are stored. In the process of feeling around for them, he knocks over a few boxes, luckily none of which fall on his feet. He fumbles and finds the Server Room Key.");
						System.out.println("\n Will you pick up the Server Key?");
						answer= sc.next();
						if (answer.equalsIgnoreCase("Yes")){
							Evan.setserverkey(condition);
							System.out.println("\n He can go to The Mailroom, Storage, Server, Elevator, or Stairs.");
							System.out.println("\n Which Room Would you like to investigate?");
						} else{
							System.out.println("\n\n He can go to The Mailroom, Storage, Server, Elevator, or Stairs.");
							System.out.println("\n Which Room Would you like to investigate?");}
						break;

					case "Server":   
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getserverkey()==true){
							System.out.println("After pushing open the heavy door, Evan bumps into the backup computers screen. On the keyboard, He finds the Mail Room Key and on the screen is a command line waiting to restore the power.");
							System.out.println("Will you pick up the Mail Key?");
							answer= sc.next();
							if (answer.equalsIgnoreCase("Yes")){
								Evan.setmailkey(condition);
								System.out.println("Will you turn on the power?");
							}else
								System.out.println("Will you turn on the power?");
							answer= sc.next();
							if (answer.equalsIgnoreCase("Yes")){
								Evan.setpoweron(condition);
								System.out.println("Which Room Would you like to investigate,The Mail Room, Storage Room, Basement, Elevator, or Stairs?");
							} else
								System.out.println("Which Room Would you like to investigate,The Mail Room, Storage Room, Basement, Elevator, or Stairs?");
						}else 
							System.out.println("You dont have the Server Key. Check the other rooms on this floor.");
						break;

					case "Mailroom":
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power");
							System.out.println("Which Room Would you like to investigate");
							break;
						}   
						if(Evan.getmailkey() == true){
							System.out.println("Ah memories. This is where Evan started his days working for the corporation. Paper cuts every day but he felt like he wasnt so alone when he was giving people thie deliveries. He reads A letter from Janet in HR. She said she thinks she left her key on the information desk on the first floor.");
						}else 
							System.out.println("Go Get the Mailroom Key. It's here somewhere");
						System.out.println("Would you like to go to Basement, Storage, Elevator, Stairs, or Server");
						break;

					case "First": 
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						System.out.println(" The door opened to the first floor and Evan stepped outside. He took a deep breath, noticing immediately how much cleaner the air was on the first floor than it was in the basement. \n\n He can move towards the Lobby, Info Desk, Elevator or Stairs");
						System.out.println("Which Room Would you like to investigate");
						break;

					case "Infodesk": 
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power");
							System.out.println("\n\n He can move towards the Lobby, Info Desk, Elevator or Stairs. Which Room Would you like to investigate");
							break;
						}
						System.out.println("Once at the desk, he holds the key card over the scanner, but it does nothing. Of course, it did not work, he muttered. He puts his hands on the gate and hauls himself over it so he could be behind the desk. He lands on a pile of papers and almost falls, but he catches his balance on flatter ground. There are papers strewn all over the floor behind the desk. While being behind the desk, he spotted a card that had a sticker that said HR on it.");
						System.out.println("\n Will you pick up the Hr Key?");
						answer= sc.next();
						if (answer.equalsIgnoreCase("Yes")){
							Evan.sethrkey(condition);
							System.out.println("\n\n He can move towards the Lobby, First, Elevator or Stairs \n Which Room Would you like to investigate");
						} else
							System.out.println("\n\n He can move towards the Lobby, First, Elevator or Stairs \n Which Room Would you like to investigate");
						break;

					case "Lobby": 
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power. Go back to the floor you were just on. ");
							//System.out.println("\n\n He can move towards the Lobby, Infodesk, First, Elevator or Stairs \n Which Room Would you like to investigate");
							break;
						}else
							System.out.println("The main lobby is expansive, with a ceiling at least three stories high with a large chandelier precariously dangling lopsided in the middle. His footsteps echo loudly as he walks. There is light streaming in through the windows, giving him enough vision to see the info desk. He approaches and finds a pamphlet labelled floor map.");
						System.out.println("\n Will you pick up the directory?");
						answer= sc.next();
						if (answer.equalsIgnoreCase("Yes")){
							Evan.setdirectory(condition);
							System.out.println("\n\n He can move towards the Infodesk, First, Elevator or Stairs \n Which Room Would you like to investigate");
						} else
							System.out.println("\n\n He can move towards the Infodesk, First, Elevator or Stairs \n Which Room Would you like to investigate");
						break;

					case "Fifth": 
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power");
							System.out.println("Which Room Would you like to investigate");
							break;
						}
						System.out.println(". . . As he entered the fifth floor, Evan noticed a cold breeze hitting him across the hallway. He noticed that someone left the window open. Baffled by the window, he walked to the window to close it but noticed it was stuck.  \n\n He can move towards the HR, Copyroom, Elevator or Stairs");
						System.out.println("Which Room Would you like to investigate");
						break;

					case "HR":   
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==false || Evan.gethrkey() == false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power or may be missing the HR Key");
							System.out.println("Which Room Would you like to investigate");
							break;
						}else
							System.out.println("When entering the HR room, Evan noticed the room was deserted and empty. He saw a mess in the desk full of papers. Evan wondered if the people in the HR ever clean over their mess. He walked up to the desk to see what he could find. He noticed a key under all the papers and realized it was the Boss Key so he thought it could come in handy later.");
						System.out.println("Will you pick up the Boss Key?");
						answer= sc.next();
						if (answer.equalsIgnoreCase("Yes")){
							Evan.setbosskey(condition);
							System.out.println("\n\n He can move towards the Fifth floor, Copyroom, Elevator or Stairs. \n  Which Room Would you like to investigate");
						} else
							System.out.println("\n\n He can move towards the Copyroom, Fifth floor, Elevator or Stairs. \n  Which Room Would you like to investigate");
						break;

					case "Copyroom":   
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power");
							System.out.println("Which Room Would you like to investigate");
							break;
						}else
							System.out.println("He decides to check out the copy room. He sees a memo pasted to the wall above one of the copiers that looks like it’s important. He walks over to get a closer look… \n ALL, \n STOP MESSING WITH YOUR PHONES. NEXT PHONE I SEE WILL BE CONFISCATED AND KEPT IN MY OFFICE UNTIL THE END OF THE DAY. THIS IS A SERIOUS MATTER. \n B----(The bosses name is scribbled out and next to it someone has scribbled an inappropriate slur.)");
						System.out.println("\n\n He can move towards the Hr Room, Fifth, Elevator or Stairs");
						break;

					case "Seventh":  
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power");
							System.out.println("\n\n He can move towards the Boss, Boardroom, Elevator or Stairs. \n Which Room Would you like to investigate");
							break;
						}else
							System.out.println("When he makes to the seventh floor he glances around. He had not stepped foot on most of the floors he explored today, but this one was the one he tried to avoid the most. He tried to deal with and be in the same room with executives as little as possible.");
						System.out.println("\n\n He can move towards the Boss, Boardroom, Elevator or Stairs");
						System.out.println("Which Room Would you like to investigate");
						break;

					case "Boss": 
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power");
							System.out.println("\n\n He can move towards the Seventh, Boardroom, Elevator or Stairs. \n Which Room Would you like to investigate");
							break;
						}else
							System.out.println("Evan walks to the CEO’s office hesitantly, afraid that the CEO would be there. He opens the door… and no one is there. He sighs in relief. He flips on the lights to reveal a very clean and orderly room, a stark contrast to the HR room and the info desk. He’s almost afraid to walk in, the tile floor is so clean. He does, however, heading to the desk in the middle of the office and going to the drawer. Evan jiggles it open and see’s several phones. He digs around and finally finds his own.");
						System.out.println("will you pick up the cellphone?");
						answer= sc.next();
						if (answer.equalsIgnoreCase("Yes")){
							Evan.setcellphone(condition);
							System.out.println("\n\n He can move towards the Seventh, Boardroom, Elevator or Stairs. \n Which Room Would you like to investigate");
						} else
							System.out.println("\n\n He can move towards the Seventh, Boardroom, Elevator or Stairs. \n Which Room Would you like to investigate");
						break;

					case "Boardroom": 
						if(Evan.getdirectory()==true){
							System.out.println("Would you like to view the directory");
							String direct=sc.next();
							if(direct.equalsIgnoreCase("Yes")){
								System.out.println("Basement: Storage, Mailroom, Server Room \n First Floor: Lobby, Info Desk \n Third Floor Bathroom, Breakroom, Evans Cubicle \n Fifth Floor: HR Room, Copy Room \n Seventh Floor Bosses Office, Boardroom \n Roof");
							}else{}
						}
						if(Evan.getpoweron()==false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power");
							System.out.println("\n\n He can move towards the Seventh, Breakroom, Elevator or Stairs. \n Which Room Would you like to investigate");
							break;
						}else
							System.out.println("Evan walks into the large board room, and is almost intimidated by the massive size of the circular table in the middle of the room. This is where all the “big dogs” make all the decisions about things that go way over Evan’s head. He has no desire to stay longer, until he notices a paper on the table. He approaches: \nNOTICE!!\nThe office will be closed on December 25th for the holiday. All employees must leave by 6pm on December 24 as the whole office will be locked down.\n Have a good holiday!");
						System.out.println("\n\n He can move towards the Seventh, Boss, Elevator or Stairs. \n Which Room Would you like to investigate");
						break;

					case "Roof": 
						if(Evan.getpoweron()==false|| Evan.getcellphone()==false){
							System.out.println("You Do not Have the necessary Item. You may not have turned on the power, or not grabbed your Cellphone");
							System.out.println("\n\n He can move towards the Seventh, Boss, Boardroom, Elevator or Stairs. \n Which Room Would you like to investigate");
							break;
						}
						System.out.println("As Evan enters the roof, he looks around and notices pitch blackness.However, he notices the building is shut in from all directions. He goes into his pocket to get his cell phone that he previously acquired from the Boss office. He turns on his phone to call his supervisor and the phone starts ringing. His supervisor picks up and Evan demands for an explanation on why he was left inside and nobody bothered to tell him. The supervisor told him that he thought everyone left the building and that they closed because it was the night before Christmas Day and everyone was getting ready to leave for the holidays. Evan forgot that Christmas Day was tomorrow and felt ashamed. He asked the supervisor to come pick him up because he didn't want to stay there any longer and the supervisor said okay I will be right there.");
						condition = false;
						break;
					default: System.out.println("\nThat is an invalid option. Please select a valid room.\n\n");
					}
				} catch (RuntimeException e) {
					System.out.print("RuntimeException: ");
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.print("Exception: ");
					System.out.println(e.getMessage());
					System.out.println("try-block entered.");
				} 
			}
			System.out.println( "Congratulations, You helped save Evan. Thanks for playing");
		}
	}
}







