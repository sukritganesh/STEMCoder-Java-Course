import java.util.Scanner;
public class DungeonsAndDragons {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		String decision = "stop";
		
		System.out.println("Welcome Dungeons And Dragons.\nPlease follow the directions.");
		
		System.out.println("You are stranded on an island, and you are dehydrated and hungry.\n Your phone ran out of battery, and your solar charger is in the shipwreck. The only provisions you have are a dead phone and a swiss army knife with and a pistol.\n The army knife and pistol can protect you from any hostiles you encounter.");
		System.out.println("Option 1: Go to the shipwreck to recover the charger. It will take at least a full day.");
		System.out.println("Option 2: Find a good food and water source.");
		
		decision = myInput.next();
		
		if (decision.equals("1")){
			System.out.println("The current is stronger than expected. You are stuck on the ship. \nThe charger is in the bottom deck which can only be accessed by swimming.");
			System.out.println("Option 1: Wait on the ship for the current to die down.");
			System.out.println("Option 2: Swim back in the strong current to land (where beaches and food await).");
			
			decision = myInput.next();
			
			if (decision.equals("1")){
				System.out.println("While you waited on the ship, a storm approaches.");
				System.out.println("Option 1: Continue to wait on the ship.");
				System.out.println("Option 2: Attempt to swim back as soon as possible.");
				
				decision = myInput.next();
				
				if(decision.equals("2")){
					System.out.println("The storm intensifies and batters the wreck, and you are swept off to sea. You lose.");
				}
				else if(decision.equals("2")){
					System.out.println("The current washes you out to sea. Before you drown, you see your phone charger.\n No use, huh? You lose!");
				}
				else {
					System.out.println("Hesitation is easy but never useful. You starve while thinking about what to do." );
				}
			}
			else if (decision.equals("2")){
				System.out.println("You somehow manage to survive the current, but you are washed to the other side of the island.\n It is full of rocks and barren wasteland, but there is firewood and magnesium with which you can make a flare. \nHowever, the nearby volcano is active.");
				System.out.println("Option 1: Make a flare with the materials (will take some time).");
				System.out.println("Option 2: Trek back to the other side through the misty mountains.");
				
				decision = myInput.next();
				
				if(decision.equals("1")){
					System.out.println("You make a flare, and you hear the nearby volcano rumbling. You jump into sea to avoid the lava, \nbut you are taken away by the current. You lose.");
				}
				else if(decision.equals("2")){
					System.out.println("After a long and tiring trek through the harsh mountains, you collapse on the other side.\n While unconcious, a coconut bonks you on the head. You lose.");
				}
				else {
					System.out.println("Hesitation is easy but never useful. You starve while thinking about that to do." );
				}
			}
			
		}
		else if (decision.equals("2")){
			System.out.println("You found some yellow berries while searching. \nThe yellow berries look suspicious, but you are very hungry and thirty.");
			System.out.println("Option 1: Eat the berries.");
			System.out.println("Option 2: Continue looking for food.");
			
			decision = myInput.next();
			
			if (decision.equals("1")){
				System.out.println("You find out that the berries are poisonous. You get a stomach ache.");
				System.out.println("Option 1: Go back to shore, where you can swim to the shipwreck. \nThere are medicines in the shipwreck.");
				System.out.println("Option 2: Look for a freshwater source. Freshwater will help you heal.");
				
				decision = myInput.next();
				
				if(decision.equals("1")){
					System.out.println("You are feeling incapacitated because of the berries. \nWhile you walk to the shipwreck, you mysteriously collapse. Next time, better safe than sorry. You lose.");
				}
				else if(decision.equals("2")){
					System.out.println("You find a great water source on the other side of a chasm. \nHowever, you have to cross that chasm. \nBecause you feel disoriented from eating the berries, you trip and fall 100 feet on to some obsidian (extremely hard).\n Better safe than sorry next time! You lose!");
				}
				else{
					System.out.println("Hesitation is easy but never useful. You starve while thinking about what to do." );
				}
			}
			else if (decision.equals("2")){
				System.out.println("You come across the long lost tribe of the island, the SOHCAHTOAS.\n They welcome you using hand signals and give you friuts you know are safe. They also offer you some herbal medicine. Remember you are armed with a gun.");
				System.out.println("Option 1: Make friends with the tribe and accept their hospitality.");
				System.out.println("Option 2: Run away as fast as you can because you believe this tribe is cannibalistic and wants to lure you into being their dinner.");
				
				decision = myInput.next();
				
				if(decision.equals("1")){
					System.out.println("The tribe nurses you back to health until a search party locates the ship.\n You are rescued, and the tribe is commemorated with gifts of food, weapons, and technology.");
				}
				else if(decision.equals("2")){
					System.out.println("Remember that even if the tribe were to attack you, you could have defended yourself with your weapons?\n You run away and starve, because no one is there to help you. The only thing the search party which arrives a week later finds is your dead phone and swiss army knife. Better take help if you get it next time. You lose.");
				}
				else {
					System.out.println("Hesitation is easy but never useful. You starve while thinking about what to do." );
				}
			}
			else {
				System.out.println("Hesitation is easy but never useful. You starve while thinking about what to do." );
			}
			
		}
		else{
			System.out.println("Hesitation is easy but never useful. While you were thinking about that to do, the sun set and it became dark. An island monster ate you. You lose.");
		}

	}

}
