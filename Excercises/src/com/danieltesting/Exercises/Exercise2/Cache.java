package com.danieltesting.Exercises.Exercise2;

import java.util.HashMap;

import static com.danieltesting.Exercises.Exercise2.DataBase.dataBase;

public class Cache {

    // The idea is to have a cache that has some users that already exist in the database
    //but not all of them, then when you search a user in the cache and this does not exist
    // in it, but exist in the database, it should be loaded automatically to the cache

    //options: create new user, Name, ID is automatic , it is saved in both the cache and the database
    //Clear cache option, empty the HashMap

   static HashMap<Integer,String> cache = new HashMap<Integer,String>();


    public static void searchUser(int userID){

        DataBase result = dataBase(userID);

        if (cache.containsKey(userID)){
            System.out.println("The name of the user with ID "+userID+" is "+cache.get(userID)+"\n");
        }
        else if(result.getName()!=null){

            System.out.println("The value is not in the cache, it will be loaded from database");
            cache.put(result.getUserID(), result.getName());
            System.out.println("The user loaded with ID "+userID+" is "+cache.get(userID)+"\n");

        }
        else {

            System.out.println("The ID you introduced does not exist\n");

        }



    }

}
