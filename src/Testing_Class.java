public class Testing_Class {
    public static void main(String[] args) {
        Personnage main_character_boy = new Personnage("MemeMaster Alex", 100, 150);
        Object sword = new Object();
        sword.setDescription("Sword");
        Object potion = new Object();
        potion.setDescription("Potion Health");
        Object magic_clock = new Object();
        magic_clock.setDescription("Magic Clock");
        main_character_boy.ajouterObject(sword);
        main_character_boy.ajouterObject(sword);
        main_character_boy.ajouterObject(sword);
        main_character_boy.ajouterObject(potion);
        main_character_boy.ajouterObject(potion);
        main_character_boy.ajouterObject(potion);
        System.out.println(main_character_boy.afficheInventarie());
        System.out.println(main_character_boy.objList.size());
    }
}
