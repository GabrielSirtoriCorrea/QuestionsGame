package com.gazeboindustries.questionsgame.com;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
    private StringBuilder sql;
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;



    public DataBaseConnection(){
        try {
            //StringBuilder sql = new StringBuilder();
            this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/QuestionsGame?useTimezone=true&serverTimezone=UTC", "root",
                    "Gazao015");

            this.statement = connection.createStatement();
            

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void getQuestion(){
        try{
            this.preparedStatement = connection.prepareStatement("SELECT * FROM Questions;");

            this.resultSet= preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getString("ID"));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}