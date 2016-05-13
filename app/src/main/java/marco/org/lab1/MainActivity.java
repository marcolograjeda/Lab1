package marco.org.lab1;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import marco.org.*;

public class MainActivity extends AppCompatActivity {
    private EditText txtPedido=null;
    private Button btnPedir = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPedido = (EditText)findViewById(R.id.txtPedir);
        btnPedir = (Button)findViewById(R.id.btnPedir);
        btnPedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v,"Pedido realizado", Snackbar.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Factura.class);
                intent.putExtra("pedido", txtPedido.getText().toString());
                startActivity(intent);
            }
        });
    }
}
