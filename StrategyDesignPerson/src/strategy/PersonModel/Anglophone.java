package strategy.PersonModel;

import strategy.Languages.English;
import strategy.abstractModel.Person;

public class Anglophone extends Person {
    public Anglophone(){
        language = new English();
      //  setLanguage(new English());
    }

}
