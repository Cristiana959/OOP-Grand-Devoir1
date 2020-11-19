# River Valley

## Game made for the OOP Course at FILS

## Authors:
- Andrei Cristiana/ @Cristiana959
- Nae Sebastian/ @sebastian2000

## General Rules:
- You can collect resources 4 times/session.
- The buildings can be built only by using money, except for the house.
- You must use rocks and glass to build the house.
- Cereals, wood, iron and silver can be transformed into money or rocks or glass.
## THE COMMANDS WORK WITH LOWERCASE LETTERS!
## Controls:
 - D-display buildings/resources/type of user
 - T-transform your resources
 - B-build a new type of building
 - C-collect the resources provided by the buildings
 - S-save the progress
 - X-exit
 
 ## How to install the game:
  Simply download the correct folder for your OS Run the run file\
   For Windows:\
   Check if pyhton3 is installed\
   Double click the run file\
   Enjoy the game\
 ## Modifications from the original task:
 Class Profil:
| Function name | Description                    |
| ------------- | ------------------------------ |
| `displayBuildings()`      |  displays the current number of each type of building      |
| `displayResources()`   | display the current number of each type of resource     |
| `TypeUtilisateur()`   | returns the type of user you are by the largest number of buildings from all the type of buildings    |

Class Batiment:
| Function name | Description                    |
| ------------- | ------------------------------ |
| `fournitLaRessource()`      |  adds the revenue/second to the total number of resource given by each building   |
| `augumenterRevenu()`   | increments the revenu/second each time you build a new building   |
| `incrementerLeNombreDeBatiments(int i) `   | is not used, instead each class that inherits the class Batiment has an attribut (ex:nombreDeFermes) that is incremented in the constructor each time the class    |

Classes Ferme, Scierie, MineFer, MineArgent, Maison:
| Function name | Description                    |
| ------------- | ------------------------------ |
| `augumenterCoutConstruction(double f)`      |  called in the constructor so thateach time you build a new building of a certain type the next one will be more expensive, but the revenue for all the other buildingsof this type will increase   |
| `augumenterRevenu()`   | called in the constructor so thateach time you build a new building of a certain type the next one will be more expensive, but the revenue for all the other buildingsof this type will increase     |

Class Ressource(abstract):
| Function name | Description                    |
| ------------- | ------------------------------ |
| `incrementerRevenueCereale()`      |  isn't used, as it was moved in class Batiment     |

Classes Cereale, Bois, Fer, Argent(new classes that inherit Ressource):
| Function name | Description                    |
| ------------- | ------------------------------ |
| `utiliserRessource()`      |  transforms the resource into money     |
| `convertirRoche()`   | transforms the resource into rocks    |
| `convertirVerre()`   | transforms the resource into glass    |

Classes Roche, Verre(new classes that inherit Ressource):
| Function name | Description                    |
| ------------- | ------------------------------ |
| `utiliserRessource()`      |  used to build the house     |

Class Money: new class that stores the total balance of the user


