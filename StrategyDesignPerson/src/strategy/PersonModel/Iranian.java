package strategy.PersonModel;

import strategy.Languages.Persian;
import strategy.abstractModel.Person;

public class Iranian extends Person {
    public Iranian(){
        language = new Persian();
    }
}
