public class Invoice_S {
    private Marker marker;
    private int quantity;

    public Invoice_S(Marker marker,int quantity){
        this.marker=marker;
        this.quantity = quantity;

    }
    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }
}
