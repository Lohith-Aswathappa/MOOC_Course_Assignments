public class Reformatory {
    private int count = 0;

    public int weight(Person person) {
        this.count++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured(){
        return this.count;
    }

}
