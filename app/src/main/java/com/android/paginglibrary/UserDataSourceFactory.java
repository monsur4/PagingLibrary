package com.android.paginglibrary;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
/**
 * Created by Morris on 03,June,2019
 */
public class UserDataSourceFactory extends DataSource.Factory<Long, User> {
    public MutableLiveData<UserDataSource> userLiveDataSource=new MutableLiveData<>();
    @Override public DataSource<Long, User> create() {
        UserDataSource userDataSource = new UserDataSource();
        userLiveDataSource.postValue(userDataSource);
        return userDataSource;
    }
}