package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayPlayground {

    private ArrayList<String> nameList = new ArrayList<>();

    public ArrayList<String> getNameList() {
        return nameList;
    }

    public void setNameList(ArrayList<String> nameList) {
        this.nameList = nameList;
    }

    public void removeElement(int index) {
        nameList.remove(index);
    }


    public void feedNameList(){
        nameList.addAll(Arrays.asList("Masoud","Yang","Leo"));
        nameList.add("Lian");
    }
    public int findName(String name){
        if(nameList.contains(name)){
            return nameList.indexOf(name);
        }
        return -1;
    }

    public void removeSpecificElements(){
        Iterator<String> itr = nameList.iterator();
        while(itr.hasNext()){
            for (int i = 0; i < nameList.size(); i++) {
                if(itr.next().contains("a")){
                    itr.remove();
                }
            }


        }
        printName();
    }
    public void printName(){
       /*( for(int i = 0; i < nameList.size();i++){
            System.out.print(nameList.get(i) + " ");
        }
*/
        for(String element : nameList){
            System.out.println(element);
        }
        System.out.println(nameList);
    }
//read and change .get().toLowerCase();
    // update: .set(index, "");
    public ArrayPlayground(){
        feedNameList();
        printName();
        removeSpecificElements();

    }
    public static void main(String[] args) {
	// write your code here
        new ArrayPlayground();
    }
}
