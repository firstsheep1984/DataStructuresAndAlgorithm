package strategy.Languages;

import strategy.LanguageInterface.ILanguage;

public class Persian implements ILanguage {
    @Override
    public void speak() {
        System.out.println("I speak Persian");
    }
}
