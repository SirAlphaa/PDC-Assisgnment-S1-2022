PDC-Assisgnment-S1-2022

Authors: Salman Ali, Nathan D. Flanagan

Goal: Create a Simple Role Playing Game using technics learnt our Program Design & Construction class

===================================================================================================

PLEASE RUN THIS PROJECT IN VSCODE, we could not convert the project to work in Netbeans 

We can also provide a GItHub link for this project if requested 

===================================================================================================

Folder Details
- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
- `bin`: Compiled output files will be generated in here

Storyboard
    1) Starts Up
    2) Existing or new character
    3) Make or load character
    4) Run the dungeon 
    5) Game starts

Classes
- Main (Has the main flow of the program)
- FancyPrint (Allows us to print to console how we would like and make it easier to do so)
- Cave (master)
- UserCharacter (Master)
- Enemies (Master)

===================================================================================================
Hashmap for characters set up 
Key         value
Name        Attributes
"Salman"	"122" => “Male,Mage,Staff” 

===================================================================================================
Attributes
1st digit 	= Gender 		{Male , Female}
2nd digit 	= Role 			{Mage, knight, Assassin, Soldier}
3rd digit	= Weapon 		{Staff, Sword, Dagger, Gun} 
===================================================================================================
sudo code for battles?
Character 
	String name, role, weapon, 	

	- int Attack()
		"type of attack" malee or majic

			if weapon is sword 
		 		damage = 10
			if weapon is staff
				damage = 5
		magic
			if knight with sword
				damage = 0 - 2
			if mage with staff
				damage = 8 - 12 
				say: FOR DEMACIA!!!


		return damage; 

battle

	- int 1v1 (usercharc, enemy)
		while both > 0 hp
			enemy.hp = usercharac.attack()
			if enem.hp = 0 
			userchar = enemy.attack()
===================================================================================================
