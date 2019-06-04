package strategy;

import strategy.Languages.French;
import strategy.PersonModel.Anglophone;
import strategy.PersonModel.Chinese;
import strategy.PersonModel.Francophone;
import strategy.PersonModel.Iranian;
import strategy.abstractModel.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\n-------------------- Anglophone");
        Person anglophone = new Anglophone();
        anglophone.speakThisLanguage();
        anglophone.setLanguage(new French());
        anglophone.speakThisLanguage();

        System.out.println("\n-------------------- Francophone");
        Francophone francophone = new Francophone();
        francophone.speakThisLanguage();

        System.out.println("\n-------------------- Chinese");
        Chinese chinese = new Chinese();
        chinese.speakThisLanguage();

        System.out.println("\n-------------------- Iranian");
        Iranian iranian = new Iranian();

        Person p = new Person();
     //   p.setLanguage(English);
    }
}
