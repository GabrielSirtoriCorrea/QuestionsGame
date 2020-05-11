package com.gazeboindustries.questionsgame.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Vector;

import javax.annotation.Generated;

public class DataBaseConnection {
    private StringBuilder sql;
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Random GeneratedID;
    private String[] response = new String[5];
    private Vector<Integer> BlackListID = new Vector<Integer>();
    private int selectedID; 

    public DataBaseConnection(){
        try {
            //StringBuilder sql = new StringBuilder();
            this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/QuestionsGame?useTimezone=true&serverTimezone=UTC", "root",
                    "Gazao015");


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String[] getQuestion(){
        try{
            
            GeneratedID = new Random();

            while(true){
                selectedID = GeneratedID.nextInt(16) + 1;
                if(!BlackListID.contains(selectedID)){
                    BlackListID.add(selectedID);
                    break;
                }
            }

            System.out.println(selectedID);
            
            this.preparedStatement = connection.prepareStatement("SELECT * FROM Questions WHERE ID=?");
            this.preparedStatement.setInt(1, selectedID);

            this.resultSet= preparedStatement.executeQuery();
            resultSet.next();
            response[0] = Integer.toString(resultSet.getInt("ID"));
            response[1] = resultSet.getString("SchoolSubject");
            response[2] = resultSet.getString("ImagePath");
            response[3] = resultSet.getString("Response");
            response[4] = resultSet.getString("ResolvePath");
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }

        return response;

    }
}