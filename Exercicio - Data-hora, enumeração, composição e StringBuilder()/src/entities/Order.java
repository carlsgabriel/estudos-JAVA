package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(){
    }
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public Double total(){
        double sum = 0;
        for(OrderItem oI : items){
            sum += oI.subTotal();
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("ORDER SUMARY \n");
        sb.append("Order moment: " + sdf2.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + getClient().getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + getClient().getEmail() + "\n");
        sb.append("Order items: \n");
        for(OrderItem oI : items){
            sb.append(oI.getProduct().getName() + ", $" + String.format("%.2f", oI.getProduct().getPrice()) + ", Quantity: " + oI.getQuantity() + ", Subtotal: $" + String.format("%.2f", oI.subTotal()) + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}
