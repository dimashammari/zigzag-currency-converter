import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputAmount;
    private TextView textResult;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputAmount = findViewById(R.id.input_amount);
        textResult = findViewById(R.id.text_result);
        convertButton = findViewById(R.id.button_convert);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCurrency();
            }
        });
    }

    private void convertCurrency() {
        
        if (!amountString.isEmpty()) {
       
            double amount = Double.parseDouble(amountString);

            double convertedAmount = amount * 0.85; // Example: converting to Euros

          
            String resultString = String.format("%.2f", convertedAmount);
            textResult.setText(resultString + " EUR"); // Example: displaying as Euros
        } else {
            textResult.setText("Enter an amount");
        }
    }
}
