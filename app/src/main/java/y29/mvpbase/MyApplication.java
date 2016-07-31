package y29.mvpbase;

import android.app.Application;

import y29.mvpbase.utils.AppModule;

/**
 * Created by Anirudh on 31-07-2016.
 */
public class MyApplication extends Application{

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(getApplicationContext())).build();
    }

    public AppComponent getTasksRepositoryComponent() {
        return mAppComponent;
    }
}
