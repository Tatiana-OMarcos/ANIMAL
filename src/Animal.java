public class Animal {
    private String name;
    private String specie;
    private int age;
    private double weight;

    public Animal( String name, String specie, int age, double weight){
        this.name = name;
        this.specie = specie;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name){
        this.name = name;
    }
    public String getSpecie(){
        return specie;
    }
    public void setSpecies(){
        this.specie = specie;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight(){
        return weight;
    }
    public void growBigger(){
        weight +=0.3;
        age++;

    }
}
