 public class Main {
     public static void main(String[] args) {
         // CREATE 2 Pet objects with different initial values

          Pet puppy = new Pet("James", 2, 90.0, "Labrador", false);
        System.out.println(puppy);

        Pet kitty = new Pet("Lily", 1, 8.7, "Cat", true);
        System.out.println(kitty);
    
         // TEST all Pet methods (getters, toString, setters)
         System.out.println(puppy.getType());
         System.out.println(kitty.getType());
         
         puppy.setName("James");
         puppy.setAge(2);
         puppy.setWeight(90.0);
         puppy.setType("Labrador");
         puppy.setSterile(false);

         kitty.setName("Lily");
         kitty.setAge(1);
         kitty.setWeight(8.7);
         kitty.setType("Cat");
         kitty.setSterile(true);
    
     }
 }