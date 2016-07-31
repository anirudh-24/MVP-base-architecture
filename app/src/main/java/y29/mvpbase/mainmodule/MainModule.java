package y29.mvpbase.mainmodule;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by krishan on 31-07-2016.
 */
@Module
public class MainModule {

    private final Context context;

    public MainModule(Context context) {
        this.context = context;
    }

    @Provides
    MainPresenter getPresenter() {
        return new MainPresenter(context);
    }
}
