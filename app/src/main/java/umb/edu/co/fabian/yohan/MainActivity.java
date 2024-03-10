package umb.edu.co.fabian.yohan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtTextoOperacion;
    private Button btnButton0;
    private Button btnButton1;
    private Button btnButton2;
    private Button btnButton3;
    private Button btnButton4;
    private Button btnButton5;
    private Button btnButton6;
    private Button btnButton7;
    private Button btnButton8;
    private Button btnButton9;
    private Button btnButtonC;
    private Button btnButtonNumMas;
    private Button btnButtonNumMenos;
    private Button btnButtonDivision;
    private Button btnButtonMultiplica;
    private Button btnButtonBorrar;
    private Button btnButtonPunto;
    private Button getBtnButtonNumIgual;

    private ExpresionRegular expresionRegular;

    private boolean clickSignoMas, clickSignoMenos, clickSignoMultiplica, clickSignoDivision, clickSeparadorDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expresionRegular = new ExpresionRegular();

        txtTextoOperacion = findViewById( R.id.txtOperacion );
        txtTextoOperacion.setFocusable( true );
        txtTextoOperacion.setFocusableInTouchMode( true );
        txtTextoOperacion.setInputType( InputType.TYPE_NULL );

        btnButton0 = findViewById(R.id.btnNum0 );
        btnButton0.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "0");
                accionesAdionales( R.id.btnNum0 );
            }
        });

        btnButton1 = findViewById( R.id.btnNum1 );
        btnButton1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "1");
                accionesAdionales( R.id.btnNum1 );
            }
        });

        btnButton2 = findViewById( R.id.btnNum2 );
        btnButton2.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "2");
                accionesAdionales( R.id.btnNum2 );
            }
        });

        btnButton3 = findViewById( R.id.btnNum3 );
        btnButton3.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "3");
                accionesAdionales( R.id.btnNum3 );
            }
        });

        btnButton4 = findViewById( R.id.btnNum4 );
        btnButton4.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "4");
                accionesAdionales( R.id.btnNum4 );
            }
        });

        btnButton5 = findViewById( R.id.btnNum5 );
        btnButton5.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "5");
                accionesAdionales( R.id.btnNum5 );
            }
        });

        btnButton6 = findViewById( R.id.btnNum6 );
        btnButton6.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "6");
                accionesAdionales( R.id.btnNum6 );
            }
        });

        btnButton7 = findViewById( R.id.btnNum7 );
        btnButton7.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "7");
                accionesAdionales( R.id.btnNum7 );
            }
        });

        btnButton8 = findViewById( R.id.btnNum8 );
        btnButton8.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "8");
                accionesAdionales( R.id.btnNum8 );
            }
        });

        btnButton9 = findViewById( R.id.btnNum9 );
        btnButton9.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                txtTextoOperacion.setText(textAnterior + "9");
                accionesAdionales( R.id.btnNum9 );
            }
        });

        btnButtonC = findViewById( R.id.btnC );
        btnButtonC.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                txtTextoOperacion.setText("");
                accionesAdionales( R.id.btnC );
            }
        });

        btnButtonNumMas = findViewById( R.id.btnNumMas );
        btnButtonNumMas.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                //Si anteriormente he escrito algo
                //Si existe alguna texto en mi componente EditText
                if( textAnterior.trim().length() > 0 && clickSignoMas == false){

                    if( textAnterior.endsWith("*")
                            || textAnterior.endsWith("/")
                            || textAnterior.endsWith("-")){

                        textAnterior = textAnterior.substring(0, textAnterior.length() - 1);
                        txtTextoOperacion.setText( textAnterior );
                    }

                    txtTextoOperacion.setText(textAnterior + "+");
                    clickSignoMas = true;
                    accionesAdionales( R.id.btnNumMas);
                }
            }
        });

        btnButtonNumMenos = findViewById( R.id.btnNumMenos );
        btnButtonNumMenos.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                if( clickSignoMenos == false ){

                    if( textAnterior.endsWith("*")
                            || textAnterior.endsWith("/")
                            || textAnterior.endsWith("+")){

                        textAnterior = textAnterior.substring(0, textAnterior.length() - 1);
                        txtTextoOperacion.setText( textAnterior );
                    }
                    txtTextoOperacion.setText(textAnterior + "-");
                    clickSignoMenos = true;
                    accionesAdionales( R.id.btnNumMenos );
                }
            }
        });

        btnButtonDivision = findViewById( R.id.btnDivision );
        btnButtonDivision.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                //Si anteriormente he escrito algo
                //Si existe alguna texto en mi componente EditText
                if( textAnterior.trim().length() > 0 && clickSignoDivision == false){

                    if( textAnterior.endsWith("*")
                            || textAnterior.endsWith("+")
                            || textAnterior.endsWith("-")){

                        textAnterior = textAnterior.substring(0, textAnterior.length() - 1);
                        txtTextoOperacion.setText( textAnterior );
                    }

                    txtTextoOperacion.setText(textAnterior + "/");
                    clickSignoDivision = true;
                    accionesAdionales( R.id.btnDivision );
                }
            }
        });
        btnButtonMultiplica = findViewById( R.id.btnMultiplica );
        btnButtonMultiplica.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();
                //Si anteriormente he escrito algo
                //Si existe alguna texto en mi componente EditText
                if( textAnterior.trim().length() > 0 && clickSignoMultiplica == false){

                    if( textAnterior.endsWith("+")
                            || textAnterior.endsWith("/")
                            || textAnterior.endsWith("-")){

                        textAnterior = textAnterior.substring(0, textAnterior.length() - 1);
                        txtTextoOperacion.setText( textAnterior );
                    }
                    txtTextoOperacion.setText(textAnterior + "*");
                    clickSignoMultiplica = true;
                    accionesAdionales( R.id.btnMultiplica );
                }
            }
        });

        btnButtonBorrar = findViewById( R.id.btnBorrar );
        btnButtonBorrar.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //123+5+8+4
                String textAnterior = txtTextoOperacion.getText().toString();
                if( textAnterior.length() > 0 ) {
                    String nuevaOperacion = textAnterior.substring(0, textAnterior.length() - 1);
                    txtTextoOperacion.setText( nuevaOperacion );
                }

                accionesAdionales( R.id.btnBorrar );
            }
        });

        btnButtonPunto = findViewById( R.id.btnNumPunto );
        btnButtonPunto.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();

                if( clickSeparadorDecimal == false){
                    txtTextoOperacion.setText(textAnterior + ".");
                    clickSeparadorDecimal = true;
                    accionesAdionales( R.id.btnNumPunto );
                }
            }
        });

        getBtnButtonNumIgual = findViewById( R.id.btnNumIgual );
        getBtnButtonNumIgual.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = txtTextoOperacion.getText().toString();

                if( textAnterior.trim().length() > 0 ){
                    String resultado = expresionRegular.resolverFormula( textAnterior.trim() );
                    txtTextoOperacion.setText( resultado );
                }
            }
        });

    }

    /**
     *
     * @param idBotonActual
     */
    private void accionesAdionales( int idBotonActual ){

        if( idBotonActual != R.id.btnNumMas ){
            clickSignoMas = false;
        }

        if( idBotonActual != R.id.btnNumMenos ){
            clickSignoMenos = false;
        }

        if( idBotonActual != R.id.btnMultiplica ){
            clickSignoMultiplica = false;
        }

        if( idBotonActual != R.id.btnDivision ){
            clickSignoDivision = false;
        }

        if( idBotonActual == R.id.btnNumMas
                || idBotonActual == R.id.btnNumMenos
                || idBotonActual == R.id.btnMultiplica
                || idBotonActual == R.id.btnDivision){
            clickSeparadorDecimal = false;
        }

    }
}
