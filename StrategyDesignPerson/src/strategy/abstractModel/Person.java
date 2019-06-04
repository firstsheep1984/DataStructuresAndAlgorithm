package strategy.abstractModel;

import strategy.LanguageInterface.ILanguage;

public class Person {
    public ILanguage language;

    public Person(){

    }
    public void setLanguage(ILanguage lang){
        language = lang;
    }

    public void speakThisLanguage(){
        language.speak();
    }

}