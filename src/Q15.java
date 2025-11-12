class Payment{
    public void processPayment(){
        System.out.println("im processpayment method of payment class");
    }
}

class creditCardPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("overriden process payment method from cc payment");
    }
}

class payPalPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("overriden process payment method from paypal payment");
    }
}

class upiPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("overriden process payment method from upi payment");
    }
}



//public class Q15 {
//    public static void main(String[] args) {
//        Payment pay = new Payment();
//        Payment paycc = new creditCardPayment();
//        Payment paypal = new payPalPayment();
//        Payment payupi = new upiPayment();
//
//        pay.processPayment();
//        paycc.processPayment();
//        paypal.processPayment();
//        payupi.processPayment();
//
//
//    }
//}



//more advance version of calling

public class Q15 {
    public static void main(String[] args) {
        Payment[] payments = {
                new creditCardPayment(),
                new payPalPayment(),
                new upiPayment()
        };

        for (Payment p : payments) {
            p.processPayment(); // runtime polymorphism in action
        }
    }
}
