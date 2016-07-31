package y29.mvpbase.mainmodule;


import android.content.Context;
import android.os.Handler;

import javax.inject.Inject;

import y29.mvpbase.mvpbase.BasePresenter;

/**
 * Created by Anirudh on 10/07/16.
 */
public class MainPresenter extends BasePresenter<MainMvpView> {

    private Context context;

    @Inject
    public MainPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void attachView(MainMvpView mvpView) {
        super.attachView(mvpView);
    }

    public void Signup() {
        getMvpView().showProgress();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getMvpView().hideProgress();
                getMvpView().onSuccess();
            }
        }, 3000);
    }

}
