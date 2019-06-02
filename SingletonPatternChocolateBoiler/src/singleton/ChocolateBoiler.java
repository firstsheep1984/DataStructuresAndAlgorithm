package singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private  static  ChocolateBoiler uniqueChocolateBoiler;
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getChocolateBoiler(){
        if(uniqueChocolateBoiler == null){
            uniqueChocolateBoiler = new ChocolateBoiler();
            System.out.println("create a new chocolate boiler");
        }
        return uniqueChocolateBoiler;

    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    public boolean isEmpty(){
        return empty;
    }
}
