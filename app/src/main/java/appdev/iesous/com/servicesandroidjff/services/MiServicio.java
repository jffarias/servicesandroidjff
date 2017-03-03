package appdev.iesous.com.servicesandroidjff.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by i5 on 03/03/2017.
 */

public class MiServicio extends Service {
    Context context;
    //
    public MiServicio(){
        super();
        this.context = this.getApplicationContext();
    }

    //obtenemos contexto
    public MiServicio(Context ctx){
        super();
        this.context = ctx;
    }

    public void makeHomeWork(String cadena){
        Toast.makeText(context, cadena, Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
