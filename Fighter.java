package java101;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int sans;

    Fighter(String name, int damage, int health, int weight, int dodge,int sans ) {
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
        if (sans >= 0 && sans <= 100) {
            this.sans = sans;
        } else {
            this.sans = 0;
        }


    }

    int hit(Fighter foe) {
        System.out.println(this.name + "=>" + foe.name + " " + this.damage + "hasar vurdu.");
        if (foe.issDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            System.out.println("----------------------");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean issDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean issPass() {
        double randomNumberr = Math.random() * 100;
        return randomNumberr <= this.sans;

    }



}
