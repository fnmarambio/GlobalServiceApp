package cl.inacap.globalservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GlobalService_CRUD extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_service__crud);


    }

    public void btnRegistrar(View view){
        Intent crud = new Intent(this,RegistrarUser.class);
        startActivity(crud);

    }

    public void btnSalirUser(View view){
        Intent crud = new Intent(this,MainActivity.class);
        startActivity(crud);

    }


}
