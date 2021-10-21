package br.com.felipeaem_mobile_applicationbes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.labelMensagem);
        editText = findViewById(R.id.editNome);
        button = findViewById(R.id.btnCumprimentar);
        Log.d(tag: "Exercicio1", msg:"Exercicio onCreate");
        Toast toast = Toast.makeText(MainActivity.this,"Bem vindo", Toast.LENGTH_LONG);
        toast.show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(tag: "Exercicio1", msg:"Exercicio click Botao");
                acaoBotao(v);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag: "Exercicio1", msg:"Exercicio onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag: "Exercicio1", msg:"Exercicio onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag: "Exercicio1", msg:"Exercicio onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag: "Exercicio1", msg:"Exercicio onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag: "Exercicio1", msg:"Exercicio onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag: "Exercicio1", msg:"Exercicio onDestroy");
    }
    public void acaoBotao(View view) {
        TextView textView = findViewById(R.id.labelMensagem);
        EditText editText = findViewById(R.id.editNome);
        String texto = editText.getText().toString();

        view.setText("Alo !"+ texto + "!");
    }


}