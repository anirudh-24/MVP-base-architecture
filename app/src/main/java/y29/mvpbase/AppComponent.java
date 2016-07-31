package y29.mvpbase;

import javax.inject.Singleton;

import dagger.Component;
import y29.mvpbase.utils.AppModule;

/**
 * Created by Anirudh on 31-07-2016.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
}
