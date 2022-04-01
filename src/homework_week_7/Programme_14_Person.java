package homework_week_7;

public class Programme_14_Person {
    //instance veriable
    String firstName,lastName;
    int age;

    public static void main(String[] args) {
        Programme_14_Person person = new Programme_14_Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("full name ="+ person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");//first name set as a john
        person.setAge(18);
        System.out.println("full name =" +person.getFullName());
        System.out.println("teen =" + person.isTeen());
        person.setLastName("Smith");//lastname is set as a smith
        System.out.println("full name = " + person.getFullName());
         }
         //get first name method
    public String getFirstName(){
        return firstName;
    }
    //get lastname method
    public String getLastName(){
        return lastName;
    }
    //get the age method
    public int getAge(){
        return age;
    }
    //set Firstname method
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    //set lastname method
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    //set the age method
    public void setAge(int age){
        if (age>0 && age <=100){
            this.age =age;
        }else {
            this.age=0;
        }
    }
    //check is it Teen or not Method
    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }

    //get full name method
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }else if(firstName.isEmpty()){
            return getLastName();
        }else if (lastName.isEmpty()){
            return getFirstName();
        }else {
            return getFirstName() + " " + getLastName();
        }
    }
}
