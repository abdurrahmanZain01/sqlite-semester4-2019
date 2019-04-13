package id.ac.polinema.notesapp.Repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
//import android.os.AsyncTask;

import id.ac.polinema.notesapp.dao.UserDao;
import id.ac.polinema.notesapp.db.AppDatabase;
import id.ac.polinema.notesapp.models.User;

public class UserRepository {
    private UserDao dao;

    public UserRepository (Application application){
        AppDatabase db = AppDatabase.getInstance(application);
        dao = db.userDao();

    }
//    abstraksi untuk mendapatkan user
    public LiveData<User> getUserByUsername(String username){
        return dao.getUserByUsername(username);
    }
    public void insert(User user){

    }


}
