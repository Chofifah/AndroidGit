package id.sch.smktelkom_mlg.appatm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Transfer extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnok, btndel;
    EditText edittrk, edittransfer;
    String transfer = "";
    int temp;
    int tab = 100000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btndel = (Button) findViewById(R.id.btndel);
        btnok = (Button) findViewById(R.id.btnok);
        edittrk = (EditText) findViewById(R.id.edittrk);
        edittransfer = (EditText) findViewById(R.id.edittransfer);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "0";
                edittrk.setText(transfer);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "1";
                edittrk.setText(transfer);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "2";
                edittrk.setText(transfer);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "3";
                edittrk.setText(transfer);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "4";
                edittrk.setText(transfer);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "5";
                edittrk.setText(transfer);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "6";
                edittrk.setText(transfer);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "7";
                edittrk.setText(transfer);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "8";
                edittrk.setText(transfer);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "9";
                edittrk.setText(transfer);
            }
        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer = "";
                edittrk.setText(transfer);
            }
        });

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid;
                if (edittrk.equals("")) {
                    edittrk.setError("Masukkan Jumlah Transfer Dengan Benar!");
                    valid = (false);
                } else {
                    int e = Integer.parseInt(transfer);
                    if (e > tab) {
                        edittrk.setError("Saldo Anda tidak mencukupi");
                        valid = (false);
                    } else {
                        isi(e);
                    }
                }
            }
        });
    }

    private void isi(int uang) {
        int tab = 100000;
        int h1 = Integer.parseInt(String.valueOf(edittrk.getText()));
        int x = tab - h1;
        edittransfer.setText(String.valueOf(x));
    }
}

