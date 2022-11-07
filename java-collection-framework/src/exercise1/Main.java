/* Author 	 : Ariana Rahmawati
 * Date   	 : November 7th 2022
 * Lesson 	 : Java Collection Framework
 * Course 	 : Object Oriented Programming (OOP)
 * File Name : Main.java
 */

package exercise1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Family family = new Family();
        //Add niece
		//Daftar keponakana dibuat berdasarkan urutan ulang tahun
		family.addNiece("Emily", 1, 1);
		family.addNiece("Claire", 17, 8);
        family.addNiece("Amy", 9, 10);
        family.addNiece("Beatrice", 25, 12);
        
        
        //Mengecek apakah ada keponakan yang sama
//        if(!family.addNiece("Amy", 9, 10)) System.out.println("You add duplicate value");   
        
        //Add Uncle
        //Daftar paman dibuat berdasarkan abjad
        family.addUncle("Albert");
        family.addUncle("Bill");
        family.addUncle("Charlie");
        family.addUncle("David");
        
        //Find Uncle
        //Daftar paman dibuat berdasarkan abjad
        Uncle uncle1 = family.findUncle("Albert");
        Uncle uncle2 = family.findUncle("Bill");
        Uncle uncle3 = family.findUncle("Charlie");
        Uncle uncle4 = family.findUncle("David");
        
        
        //Mengecek ada atau tidaknya nama paman
//        if(family.findUncle("Om") == null) System.out.println("Uncle didn't found!");
        
        //Add Present
        //Kondisi Albert dan Bill memberikan hadiah yang sama kepada Amy
        uncle1.addPresent(family.findNiece("Amy"), "Book-The Wonder Of Computers");
        uncle2.addPresent(family.findNiece("Amy"), "Book-The Wonder Of Computers");
        
        //Kondisi Bill memberikan hadiah yang berbeda dengan yang diberikan oleh Albert kepada Amy
        uncle2.addPresent(family.findNiece("Amy"), "Apple Pencil");
        
        
        //Kondisi Charlie memberikan hadiah yang sama kepada Beatrice dan Claire
        uncle3.addPresent(family.findNiece("Beatrice"), "Rexus Chair");
        uncle3.addPresent(family.findNiece("Claire"), "Rexus Chair");
        
        //Kondisi Charlie memberikan hadiah berbeda untuk Claire dan Emily
        uncle3.addPresent(family.findNiece("Claire"), "Computer");
        uncle3.addPresent(family.findNiece("Emily"), "Lego Hary Potter");
        
        //Kondisi David memberikan hadiah kepada ketiga keponakannya, namun satu tidak mendapatkan hadiah
        uncle4.addPresent(family.findNiece("Amy"), "Apple Watch");
        uncle4.addPresent(family.findNiece("Beatrice"), "Laptop");
        uncle4.addPresent(family.findNiece("Claire"), "iPad");

        
        //Checking list Nieces, Uncles and Presents
        family.listNieces();
        family.listUncles();
        
        uncle1.listPresents();
        uncle2.listPresents();
        uncle3.listPresents();
        uncle4.listPresents();
        
        family.findNiece("Emily").listPresents();
        family.findNiece("Claire").listPresents();
        family.findNiece("Amy").listPresents();
        
      //Menghapus list hadiah, saya akan menghapus list hadiah yang dimiliki oleh Amy
        family.findNiece("Amy").clearPrensents();
        family.findNiece("Amy").listPresents();
        
        family.findNiece("Beatrice").listPresents();
      
	}

}
