public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker,int quantity){
        this.marker = marker;
        this.quantity = quantity;

    }
//    there is region to change this class because suppose we need to add GST Reason(1)
    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }
//    suppose now we are printing Invoice, some time latter no need to print Reason(2)
    public void printInvoice(){
        //print the Invoice
    }
//    Now we are one DB but some time latter need two DB Region(3)
    public void saveToDB(){
        //save the data into DB
    }
}

// in this class there are three reason to change But in Single Responsibility says that :- A class should have only 1 reason to change
//that mens this class not following one region to change

