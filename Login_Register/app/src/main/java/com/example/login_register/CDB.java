package com.example.login_register;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class CDB extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="DMS";
    CDB(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table login(name text,username varchar2(30) primary key,password varchar2(30))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists login");
        onCreate(db);
    }
    public void Insert(CLogin cl){
        try{
            SQLiteDatabase db=this.getWritableDatabase();
            ContentValues cv=new ContentValues();
            cv.put("name",cl.name);
            cv.put("username",cl.username);
            cv.put("password",cl.password);
            db.insert("login",null,cv);
            db.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public List<CLogin> getAllvalues(String un,String pw){
        List<CLogin> recList = new ArrayList<CLogin>();
        String selectQuery="select * from login where username='"+un+"' and password='"+pw+"'";
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery(selectQuery,null);
        if(cursor.moveToFirst()){
            do{
                CLogin rec=new CLogin();
                rec.name=cursor.getString(0);
                rec.username=cursor.getString(1);
                rec.password=cursor.getString(2);
                recList.add(rec);

            }while(cursor.moveToNext());
        }
        return recList;
    }

    public List<CLogin> getvalues(String un){
        List<CLogin> recList = new ArrayList<CLogin>();
        String selectQuery="select * from login where username='"+un+"'";
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery(selectQuery,null);
        if(cursor.moveToFirst()){
            do{
                CLogin rec=new CLogin();
                rec.name=cursor.getString(0);
                rec.username=cursor.getString(1);
                rec.password=cursor.getString(2);
                recList.add(rec);

            }while(cursor.moveToNext());
        }
        return recList;
    }


    public List<CLogin> Search(){
        List<CLogin> recList = new ArrayList<CLogin>();
        String selectQuery="select * from login";
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery(selectQuery,null);
        if(cursor.moveToFirst()){
            do{
                CLogin rec=new CLogin();

                rec.username=cursor.getString(1);

                recList.add(rec);

            }while(cursor.moveToNext());
        }
        return recList;
    }

    public int deleteuser(String username)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete("login","username=?",new String[] {String.valueOf(username)});
    }

    public void update(String np,String un){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values =  new ContentValues();
        values.put("password",np);
        db.update("login",values,"username=?",new String[]{String.valueOf(un)});
        db.close();
    }
}
