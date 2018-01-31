package ke.co.joslabs.pipa.javajust;

/*import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    //initial value of cofee here so all methods can see it
    int numberofcoffee=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //when number of cofee is in this method, other methods outside the braces cant see it
        display(numberofcoffee);
        displayPrice(numberofcoffee*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }/**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void addCoffee(View view) {
        numberofcoffee=numberofcoffee+1; //when you press + the number to increase
        display(numberofcoffee);//show new number
        //displayPrice(numberofcoffee*5);//to display price

    }

    public void reduceCoffee(View view) {
        numberofcoffee=numberofcoffee-1;//reduce the value
        display(numberofcoffee);//display the reduced value
        //displayPrice(numberofcoffee*5);//to display price
    }
}
