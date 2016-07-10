package y29.mvpbase;


import y29.mvpbase.mvpbase.BasePresenter;

/**
 * Created by Anirudh on 10/07/16.
 */
public class MainPresenter extends BasePresenter<MainMvpView> {


    @Override
    public void attachView(MainMvpView mvpView) {
        super.attachView(mvpView);
    }

    public void Signup() {
        getMvpView().showProgress();
        // your business logic or rest service implementation
    }

}
