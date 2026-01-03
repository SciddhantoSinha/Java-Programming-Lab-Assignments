import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class MyStationery extends JFrame implements ActionListener {

    HashMap<String, Integer> productAndPrice;

    DefaultListModel<String> productNameBill;
    DefaultListModel<String> productQuantityBill;
    DefaultListModel<String> productPriceBill;

    JLabel productName, pricePerUnit, quantityLabel, pricePerUnitLabel;
    JLabel billProduct, billQuantity, billPrice, total, totalAmount;

    JComboBox<String> productList, quantityList;

    JList<String> productBill, productQuantity, productPrice;

    JButton addProduct;

    public MyStationery() {

        setTitle("My Stationery");
        setLayout(null);

        // ---------------- Data ----------------
        productAndPrice = new HashMap<>();
        productAndPrice.put("Book", 80);
        productAndPrice.put("Pen", 10);
        productAndPrice.put("Pencil", 5);
        productAndPrice.put("Marker", 40);
        productAndPrice.put("Eraser", 3);

        productNameBill = new DefaultListModel<>();
        productQuantityBill = new DefaultListModel<>();
        productPriceBill = new DefaultListModel<>();

        // ---------------- Labels ----------------
        productName = new JLabel("Product Name");
        pricePerUnit = new JLabel("Price Per Unit (₹)");
        quantityLabel = new JLabel("Quantity");
        pricePerUnitLabel = new JLabel("0");

        billProduct = new JLabel("Item");
        billQuantity = new JLabel("Quantity");
        billPrice = new JLabel("Cost");

        total = new JLabel("Total Amount : ");
        totalAmount = new JLabel("0");

        // ---------------- Combo Boxes ----------------
        productList = new JComboBox<>();
        for (String key : productAndPrice.keySet()) {
            productList.addItem(key);
        }

        quantityList = new JComboBox<>();
        for (int i = 1; i <= 10; i++) {
            quantityList.addItem(String.valueOf(i));
        }

        // ---------------- Lists ----------------
        productBill = new JList<>(productNameBill);
        productQuantity = new JList<>(productQuantityBill);
        productPrice = new JList<>(productPriceBill);

        // ---------------- Button ----------------
        addProduct = new JButton("Add Product");

        // ---------------- Bounds ----------------
        productName.setBounds(10, 30, 100, 20);
        pricePerUnit.setBounds(160, 30, 120, 20);
        quantityLabel.setBounds(310, 30, 100, 20);

        productList.setBounds(10, 60, 130, 25);
        pricePerUnitLabel.setBounds(160, 60, 100, 25);
        quantityList.setBounds(310, 60, 80, 25);

        addProduct.setBounds(10, 100, 380, 30);

        billProduct.setBounds(10, 150, 100, 20);
        billQuantity.setBounds(160, 150, 80, 20);
        billPrice.setBounds(280, 150, 80, 20);

        productBill.setBounds(10, 180, 120, 250);
        productQuantity.setBounds(160, 180, 80, 250);
        productPrice.setBounds(280, 180, 80, 250);

        total.setBounds(150, 450, 120, 20);
        totalAmount.setBounds(280, 450, 80, 20);

        // ---------------- Add Components ----------------
        add(productName);
        add(pricePerUnit);
        add(quantityLabel);
        add(pricePerUnitLabel);

        add(productList);
        add(quantityList);
        add(addProduct);

        add(billProduct);
        add(billQuantity);
        add(billPrice);

        add(productBill);
        add(productQuantity);
        add(productPrice);

        add(total);
        add(totalAmount);

        // ---------------- Events ----------------
        productList.addActionListener(this);
        addProduct.addActionListener(this);

        // ---------------- Frame Settings ----------------
        setSize(420, 550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == productList) {
            String selected = (String) productList.getSelectedItem();
            pricePerUnitLabel.setText(String.valueOf(productAndPrice.get(selected)));
        }

        if (e.getSource() == addProduct) {

            String product = (String) productList.getSelectedItem();
            String qtyStr = (String) quantityList.getSelectedItem();

            int unitPrice = productAndPrice.get(product);
            int qty = Integer.parseInt(qtyStr);
            int cost = unitPrice * qty;

            productNameBill.addElement(product);
            productQuantityBill.addElement(qtyStr);
            productPriceBill.addElement(String.valueOf(cost));

            int totalCost = 0;
            for (int i = 0; i < productPriceBill.size(); i++) {
                totalCost += Integer.parseInt(productPriceBill.getElementAt(i));
            }
            totalAmount.setText(String.valueOf(totalCost));
        }
    }

    public static void main(String[] args) {
        new MyStationery();
    }
}
