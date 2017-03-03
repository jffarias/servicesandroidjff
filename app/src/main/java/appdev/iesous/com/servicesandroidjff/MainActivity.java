package appdev.iesous.com.servicesandroidjff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import appdev.iesous.com.servicesandroidjff.services.HelloService;
import appdev.iesous.com.servicesandroidjff.services.MiServicio;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMiServicio(View view){
        MiServicio miServicio = new MiServicio(getApplicationContext());
        miServicio.makeHomeWork("start Miservicio");
    }

    public void startHelloService(View view){
        Intent intentServices = new Intent(getApplicationContext(), HelloService.class);
        startService(intentServices);
    }
}
