package org.template.mvp.main;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainModule {

    @Binds
    abstract MainContract.View provideMainView(MainActivity mainActivity);

    @Binds
    abstract MainContract.Presenter provideMainPresenter(MainPresenterImpl mainPresenter);
}