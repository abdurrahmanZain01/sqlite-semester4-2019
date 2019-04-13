package id.ac.polinema.notesapp.Repositories;

import android.os.AsyncTask;

import id.ac.polinema.notesapp.dao.UserDao;
import id.ac.polinema.notesapp.models.User;

public class InsertAsyncTask extends AsyncTask<User, Void, Void> {

    private UserDao asyncTaskDao;
    InsertAsyncTask(UserDao dao){
        asyncTaskDao = dao;
    }
    @Override
    protected Void doInBackground(User... user) {
        asyncTaskDao.insert(user);
        return null;


    public void insert(User user){
        new InsertAsyncTask(dao).execute(user);
        }


    }
}
