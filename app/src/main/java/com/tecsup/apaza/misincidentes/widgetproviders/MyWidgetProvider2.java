package com.tecsup.apaza.misincidentes.widgetproviders;

import android.appwidget.AppWidgetProvider;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.firebase.jobdispatcher.GooglePlayDriver;
import com.firebase.jobdispatcher.Trigger;
import com.tecsup.apaza.misincidentes.service.MyJobService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/**
 * Created by Julio Cesar on 3/12/2017.
 */

public class MyWidgetProvider2 extends AppWidgetProvider {
    private static final String TAG = MyWidgetProvider2.class.getSimpleName();
}
