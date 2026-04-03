interface OnlinePayment{
    default void pay(){
        System.out.println("Payment done via Online method");
    }
}

interface CashPayment{
    default void pay(){
        System.out.println("Payment done via Cash method");
    }
}


class Invoice{
    void generateInvoice(){
        System.out.println("Invoice for order");
    }
}

public class Order implements OnlinePayment, CashPayment{

    Invoice invoice = new Invoice();


    public void processOrder(){
        System.out.println("ORDER IS BEING PROCEED");
    }

    @Override
    public void pay(){
        OnlinePayment.super.pay();
        CashPayment.super.pay();
        System.out.println("Order payment handled");
    }

    public void showInvoice(){
        invoice.generateInvoice();
    }

    public static void main(String[] args){
        Order order = new Order();

        order.processOrder();
        order.pay();
        order.showInvoice();
    }
}
