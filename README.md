# swamp-wars-game
Small game project which I have been working on [WIP]. 
The game is currently just text based but will later have graphics added into it.

Some important rules about this game are:

DIET

1. The ogre, who is called HEK, is a fussy eater and he only eats three types of food; Knights in Shining Armour, Very Big Macs and “ogre enemies”. HEK’s default diet is Knights in Shining Armour. I need to be able to change HEK’s diet dynamically.

MOVING

2. When the game starts the ogre is randomly allocated to a square in the swamp, with the exception of the top left square.  When the ogre moves, it can move to any of the neighbouring squares. The ogre cannot move out of the swamp. The square that the Ogre moves to is chosen at random from all the possible squares that it can move to.

ENEMIES

3. There are three types of ogre enemies that can inhabit HEk’s swamp; an ogre loathing snake, an ogre despising parrot and an ogre hating donkey. To keep the ogre on his toes I shall need to be able to generate Ogre enemies dynamically and add them in to the swamp.

4. There is a hole in the fence around the swamp in the top left corner and it is through this hole that all enemies enter the swamp (enemies can enter the swamp but nobody ever leaves the swamp alive).  Once in the swamp the enemies move in exactly the same way as the ogre; i.e. they move randomly to any of the neighbouring squares.

5. Every time the Ogre moves there is a one in three chance of an enemy entering the swamp, the type of enemy is completely random.

CONFLICT

6. If the Ogre moves into the same square as an enemy, the Ogre kills the enemy and the enemy is removed from the swamp.   
  
  6.1 If the Ogre moves into the same square as two or more enemies, what happens depends on the Ogre’s diet.  If his diet is “ogre enemies” he kills the enemies. If the Ogre’s diet is anything other than “ogre enemies” then the ogre enemies kill the Ogre and the game is over.
  
  6.2 If the Ogre’s diet is “ogre enemies” it takes three or more enemies in the same square to kill the ogre. 
