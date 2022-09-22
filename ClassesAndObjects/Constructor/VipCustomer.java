/*multiple constructor*/
package ClassesAndObjects.Constructor;
public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAdress;

    public  VipCustomer(){
        this("Default Name",1000,"default@email.com");
        System.out.println("empty constructor called.");
    }

    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit,"unknown@email.com");
    }

    public VipCustomer(String name,int creditLimit, String emailAdress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName(){
        return name;
    }

    public int getCreditLimit(){
        return creditLimit;
    }

    public String getEmailAdress(){
        return emailAdress;
    }

}
