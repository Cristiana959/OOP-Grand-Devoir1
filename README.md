# OOP-Grand-Devoir1
## Repo for Homework1 in OOP Course at FILS

## Exercise 1: Implement an adventure game
There are 3 types of elements in this game:
- Characters (heroes, enemies, monsters, etc.)
- Collectable ellements (characters' equipement, treasures, etc.)
- Decorations\
A level consists of:
- a map that contains the types of elements
- a title that describes the level
- the main character
## In all the classes it is mandatory to have a default constructor and you can use as many private attributes and method as you consider neccesary.
Details of the classes:
Class Element(abstract):
| Function name |                     
| --------------|
| `getDescription()`    | 
| `setDescription(String s)`   | 
| `getType()`   | 
| `setDescription(String s)`   | 

Classes Objet and Decor inherit class Element.
##### A character can wear Objects and stores them in an inventory.
Class Personnage(inherits class Element):
| Function name |
| ------------- | 
| `getName()`    |
| `setName(String s)`   | 
| `getVitalite()`   | 
| `setVitalite(int i)`   | 
| `getVitaliteMax()`   | 
| `setVitaliteMax(int i)`   | 
| `afficheInventaire()`   | 
| `ajouteObjet(Objet i)`   |
| `retireObjet(int numero)`   | 

Class Niveau:
| Function name |
| ------------- | 
| `void setElement(int i,int j, Element k)`    |
| `Element getElement(i,j)`   | 
| `String decritCarte(int i, int j)`   | 
| `Personnage getPersonnagePrincipal( ) `   | 
| `void setPersonnagePrincipal(Personnage p) `   | 
| `String getTitre( )`   | 
| `void setTitre(String t)`   | 

## Exercise 2: Implement an idle game.

### In all the classes it is mandatory to have a default constructor and you can use as many private attributes and method as you consider neccesary.
Details of the classes:

Class Profil:
| Function name |
| ------------- | 
| `getName()`    |
| `setName(String)`   | 
| `getRessources()`   | 
| `getRessourcesParSeconde()`   |  
| `setRessources(int i, int j, int o, int k)`   | 

Class Batiment(abstract):
| Function name |
| ------------- | 
| `getDescription( )`    |
| `-setDescription( String s )`   | 
| `incrémenterLeNombreDeBatiments(int i)`   | 
| `-String afficherLeNombreDeBatiments()`   |  
| `augmenterCoûtConstruction(double f)`   | 

Classes Ferme, Scierie, MineFer and MineArgent inherit class Batiment.

Class Ressource:
| Function name |
| ------------- | 
| `incrementerRevenuCereale()`    |
| `utiliserResource()`   | 

Class FileManagement:
| Function name |
| ------------- | 
| `sauvegarde() `    |
| `lecture(String chemin)`   | 


