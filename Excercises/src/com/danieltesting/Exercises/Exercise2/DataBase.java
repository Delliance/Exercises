package com.danieltesting.Exercises.Exercise2;

import java.util.ArrayList;

public class DataBase {

    private int userID;
    private String name;


    public DataBase(int userID, String name){

        this.userID = userID;
        this.name = name;

    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public static DataBase dataBase (int id){

        int searchedID = id;
        String searchedName = null;

        ArrayList<String> dataBaseName = new ArrayList<>();
        dataBaseName.add("Calvin Frazier");
        dataBaseName.add("Haven Madden");
        dataBaseName.add("Freddy Crawford");
        dataBaseName.add("Carleigh Barnes");
        dataBaseName.add("Rocco Savage");
        dataBaseName.add("Misael Gross");
        dataBaseName.add("Pierce Mathis");
        dataBaseName.add("Mckinley Schultz");
        dataBaseName.add("Danica Dorsey");
        dataBaseName.add("Caitlin Stanton");
        dataBaseName.add("Walter Shea");
        dataBaseName.add("Harley Fry");

        ArrayList<Integer> dataBaseID = new ArrayList<Integer>();

        dataBaseID.add(2950);
        dataBaseID.add(156);
        dataBaseID.add(5684);
        dataBaseID.add(882);
        dataBaseID.add(3699);
        dataBaseID.add(1778);
        dataBaseID.add(8359);
        dataBaseID.add(4375);
        dataBaseID.add(605);
        dataBaseID.add(6452);
        dataBaseID.add(1445);
        dataBaseID.add(4045);

        for (int i = 0; i < dataBaseID.size(); i++) {

            if (dataBaseID.get(i)==id){

                searchedID = dataBaseID.get(i);
                searchedName = dataBaseName.get(i);
                break;

            }

        }

        return new DataBase(searchedID,searchedName);

    }





}
