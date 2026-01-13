 public class Pet {
     // 1. Declare INSTANCE VARIABLES
     private String name;
     private int age;
     private Double weight;
     private String type;
     private boolean sterile;

     // 2. Define CONSTRUCTOR
    public Pet(String initName, int initAge, Double initWeight, String initType, boolean initSterile)
    {
        name = initName;
        age = initAge;
        weight = initWeight;
        type = initType;
        sterile = initSterile;
    }
    
     // 3. Define METHODS (getters, toString, setters)
     public String getName() {
        return name;
     }
     public int getAge() {
        return age;
     }
    public double getWeight() {
        return weight;
    }
    public String getType() {
        return type;
    }
    public boolean getSterile() {
        return sterile;
    }

    public String toString() {
        String state = "Pet{" + name+ "," + age + "," + weight + "," + type + "," + sterile + "}";
        return state;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setSterile(boolean newSterile) {
        this.sterile = newSterile;
    }

    
 }