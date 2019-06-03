package strategy.PersonModel;

import strategy.Languages.French;
import strategy.abstractModel.Person;

public class Francophone extends Person {
    public Francophone(){
        language = new French();
    }

}