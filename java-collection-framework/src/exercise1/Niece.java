/* Author 	 : Ariana Rahmawati
 * Date   	 : November 7th 2022
 * Lesson 	 : Java Collection Framework
 * Course 	 : Object Oriented Programming (OOP)
 * File Name : Niece.java
 */

package exercise1;
import java.util.*;

public class Niece implements Comparable<Niece>{
	
	private String name;
    private int birthDay;
    private int birthMonth;
    Map<Uncle, String> presents =  new HashMap<Uncle, String>();
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setBirthDay(int birthDay){
        this.birthDay= birthDay;
    }
    
    public void setBirthMonth(int birthMonth){
        this.birthMonth=birthMonth;
    }
    
    public String getName(){
        return name;
    }
    
    public int getBirthDay(){
        return birthDay;
    }
    
    public int getBirthMonth(){
        return birthMonth;
    }
    
    public Map<Uncle, String> getPresents(){
        return this.presents;
    }
    
    public int clearPrensents(){
        int totalPresent =0;
        for(String present : presents.values()){
            if(present != null) totalPresent++;
        }
        presents.clear();
        return totalPresent;
    }
    
    public void listPresents(){
        System.out.println("\n========================================");
        System.out.println("List of presents for "+this.name +":");
        for(Map.Entry<Uncle, String> entry : presents.entrySet()){
            System.out.print("- ");
            System.out.print(entry.getKey().getName());
            System.out.println((entry.getValue()==null ? " hasn't given present" :" give "+ entry.getValue()));
        }
    }
    
    @Override
    public String toString(){
        return "Niece Name: "+name + " |Birth Day "+birthDay+ "-"+ birthMonth + "\n";
    }
    
    @Override
    public boolean equals(Object other){
        if(other == this) return true;
        if(other == null)return false;
        if(getClass() != other.getClass()) return false;
        return name.equals(((Niece)other).name);
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
    
    @Override
    public  int compareTo(Niece other){
        if(this.birthMonth > other.birthMonth) return 1;
        if(this.birthMonth == other.birthMonth){
            return (this.birthDay > other.birthDay ? 1:-1);
        }
        return -1;
    }
}
