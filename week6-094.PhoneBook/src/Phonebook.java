import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> PhoneBookLog = new ArrayList<Person>();
    public void add(String name, String phoneNumber){
        Person newperson = new Person(name, phoneNumber);
        this.PhoneBookLog.add(newperson);
    }

    public void printAll(){
        for (Person persons : PhoneBookLog) {
            System.out.println(persons);
        }
    }

    public String searchNumber(String name){
        for (Person personName : PhoneBookLog) {
            if(personName.getName().equals(name)){
                return personName.getNumber();
            }
        }
        return "number not known";
    }
}
