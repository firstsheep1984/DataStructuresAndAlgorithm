package strategy.PersonModel;

import strategy.LanguageInterface.ILanguage;
import strategy.Languages.Mandarin;
import strategy.abstractModel.Person;

public class Chinese extends Person {
   public Chinese(){
        language = new Mandarin();
   }
}
