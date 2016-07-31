package y29.mvpbase.mainmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import y29.mvpbase.R;
import y29.mvpbase.utils.ProgressBarHandler;

public class MainActivity extends AppCompatActivity implements MainMvpView {

    ProgressBarHandler mHandler;
    @Inject
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler = new ProgressBarHandler(this);

        // Create the presenter
        MainComponent mMainComponent = DaggerMainComponent.builder().mainModule(new MainModule(this)).build();

        mMainComponent.inject(this);

        mMainPresenter.attachView(this);
        mMainPresenter.Signup();
    }

    @Override
    public void showProgress() {
        mHandler.showProgress();
    }

    @Override
    public void hideProgress() {
        mHandler.hideProgress();
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onException(Exception e) {
        e.printStackTrace();
        Toast.makeText(this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
    }
}
