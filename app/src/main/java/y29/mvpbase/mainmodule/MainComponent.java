package y29.mvpbase.mainmodule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Anirudh on 31-07-2016.
 */

@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
