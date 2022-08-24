package ClassesAndObjects.src;

public class Bank{

    private long accountNumber;
    private long phoneNumber;
    private int balance;
    private String customerName;
    private String email;

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    
    public void setBalance(int balance){
        this.balance=balance;
    }
    
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    
    public void setEmail(String email){
        this.email=email;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public int getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    
    public String getEmail(){
        return email;
    }

    public void withdraw(int amount){
        if(amount < balance){
            balance -= amount;
            System.out.println("hello "+customerName+". "+amount+" got withdrawn from your account a/c no."+accountNumber+". Balance remaining is \u20b9"+balance+". More details has been sent to yout email id "+'"'+email+'"'+'.'+" And on you phone number '"+phoneNumber+"'.");
        }
        else
        System.out.println("Insufficient balance.");
    }
    
    public void deposite(int amount){
        balance+=amount;
        System.out.println(amount+" got debited to your account a/c no. "+accountNumber+". Your balance is \u20b9" + balance+". More details has been sent to yout email id "+'"'+email+'"'+'.'+" And on you phone number '"+phoneNumber+"'.");
    }
    
}