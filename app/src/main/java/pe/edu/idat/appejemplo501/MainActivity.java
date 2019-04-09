package pe.edu.idat.appejemplo501;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCalcular;
    EditText etDato1, etDato2, etDato3;
    TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        etDato1 = findViewById(R.id.etDato1);
        etDato2 = findViewById(R.id.etDato2);
        etDato3 = findViewById(R.id.etDato3);
        tvResultado = findViewById(R.id.tvResultado);

        //Creación del evento click del botón
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etDato1.getText().toString().equals("")){
                    etDato1.setError("Campo obligatorio!!!");
                }else if(etDato2.getText().toString().equals("")){
                    etDato2.setError("Campo obligatorio!!!");
                }else if(etDato3.getText().toString().equals("")){
                    etDato3.setError("Campo Obligatorio!!!");
                }else{
                    Integer numero1, numero2, numero3, resultado;
                    numero1 = Integer.parseInt(etDato1.getText().toString());
                    numero2 = Integer.parseInt(etDato2.getText().toString());
                    numero3 = Integer.parseInt(etDato3.getText().toString());
                    resultado = numero1 + numero2 + numero3;
                    tvResultado.setText("RESULTADO: "+ resultado.toString());

                    //Creando Alerta Toast
                    //Toast.makeText(getApplicationContext(),
                      //      "RESULTADO: "+ resultado.toString(),
                        //    Toast.LENGTH_SHORT).show();
                }
            }
        });






    }
}
