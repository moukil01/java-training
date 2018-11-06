package exercices;

public class Person {







    // TODO 1. Ajoutez les attributs privés suivants:
    // - nom (chaîne)
    // - age (int)
    // - plus sauvage (booléen)
private String name;
private int age;
private boolean wilder;


    // TODO 2. Ajouter un constructeur avec les arguments name et age (dans cet ordre)
    // Ce constructeur doit initialiser les attributs name et age

public Person (String name, int age){
	this.name = name;
	this.age = age;
}
    // TODO 3. Ajout de la méthode getter pour l'attribut name
public String getName() {
	return this.name;
}

    // TODO 4. Ajouter une méthode de définition pour l'attribut name
public void setName(String name) {
	this.name = name;
}

    // TODO 5. Ajouter une méthode de lecture pour l'attribut age
public int getAge() {
	return this.age;
}

    // TODO 6. Ajouter une méthode de définition pour l'attribut age
public void setAge(int age) {
	this.age = age;
}

    // TODO 7. Ajouter une méthode getter pour l'attribut wilder
public boolean isWilder() {
	return this.wilder;
}

    // TODO 8. Ajouter une méthode de définition pour l'attribut wilder
public void setWilder(boolean wilder) {
	this.wilder = wilder;
}

    // TODO 9. Créez une méthode 'whoAmI' qui renvoie "Mon nom est {name} et j'ai {age}"
    // où vous remplacez {name} et {age} par des valeurs d'attributs
public String whoAmI() {
	return "My name is "  +  this.getName() + " and I'm " + this.getAge();
}



    // Do not remove this empty constructor !
    public Person() {
    }
}
