public class genetic { 
private T nama;
 public Genetic(T nama) {
 this.nama = nama;
 }
 public T getNama() { 
return nama; 
} 
public void setNama(T nama) 
{ 
this.nama = nama; 
}
 }
public class Klien {
public static void main(String[] args) {

geneticGen = new Orang("Rulia");
geneticGen = new Orang<>("Rulia"); 
geneticGen.setNama("Lia");
System.out.println(geneticGen.getNama());
} 
}
