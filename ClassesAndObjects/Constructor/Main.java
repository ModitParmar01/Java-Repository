package ClassesAndObjects.Constructor;

public class Main {
    public static void main(String[] args) {

        VipCustomer fakir = new VipCustomer();
        System.out.println(fakir.getCreditLimit()+" name "+fakir.getName()+' '+fakir.getEmailAdress());

        VipCustomer niraj = new VipCustomer("Niraj chopra",100000);
        System.out.println(niraj.getCreditLimit()+" name "+niraj.getName()+' '+niraj.getEmailAdress());

        VipCustomer mukesh = new VipCustomer("Mukesh Ambani",1000000,"yourdaddy69@reliance.com");
        System.out.println(mukesh.getCreditLimit()+" name "+mukesh.getName()+' '+mukesh.getEmailAdress());
        
    }
}
