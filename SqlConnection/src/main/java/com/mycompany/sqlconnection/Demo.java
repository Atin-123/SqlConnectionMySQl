/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sqlconnection;

import java.lang.*;
import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

/**
 *
 * @author User
 */
public class Demo {
    public static final String QUERY = "show databases;";
    
    public static void connectToDatabase() throws Exception{
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passowrd = "iamAtin@root";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, passowrd);
        System.out.println("Connection Successfull");
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery(QUERY);
        
        while(rs.next()){
            System.out.println(rs.getString("Database"));
        }
        
    }
}

// Table for STAFF_DETAILS
/*
create table IF NOT EXISTS staff (
  staff_id int not null,
  password int not null,
  staff_fname varchar(25),
  staff_lname varchar(25),
  address varchar(50),
  contact varchar(12) not null,
  gender varchar(5),
  dob date,
  post varchar(10),
  salary int,
  primary key(staff_id)
);

insert into staff values( 
123, 
234, 
'Mohit', 
'Sharma', 
'Tiruchirapalli, Madras, pin-713130', 
'6297641648', 
'M', 
'1989-12-04', 
'Manager', 
20000
);

select * from staff;


*/



//Table for GUEST_DETAILS
/*
create table guest(
  user_name varchar(20) not null,
  password varchar(20) not null,
  fname varchar(25),
  lname varchar(25),
  dob date,
  address varchar(50),
  gender varchar(2),
  email varchar(50),
  contact varchar(12),
  primary key(user_name)
);

insert into guest values
(
  'atin2021',
  '123@root',
  'Atin',
  'Pal',
  '2002-07-16',
  'BringBros, Manshi, Delhi, India',
  'm',
  'atin@gmail.com',
  '6738492712'
);

select * from guest;




*/

/*
create table room(
  room_no int not null auto_increment,
  room_type varchar(10),
  no_of_bed int,
  cost_per_night int,
  primary key(room_no)
);

insert into room (room_type,no_of_bed, cost_per_night) values 
(

  'Single',
  1,
  500
);


select * from room;

*/

//Table for PAYMENT_DETAILS
/*
create table IF NOT EXISTS payment_details(
  payment_id int not null auto_increment,
  payment_amount int,
  payment_status varchar(10),
  primary key(payment_id)
);

insert into payment_details(payment_amount, payment_status) values
(
  2000,
  'success'
);

*/

//Table for BOOKING_DETAILS
/*
create table IF NOT EXISTS booking_details(
  booking_id int not null auto_increment,
  user_name varchar(20),
  room_no int,
  check_in_date date,
  check_out_data date,
  fooding varchar(5),
  payment_id int,
  primary key(booking_id),
  foreign key(user_name) references guest(user_name),
  foreign key(room_no) references room(room_no),
  foreign key(payment_id) references payment_details(payment_id)
);

insert into booking_details(user_name, room_no, check_in_date, check_out_data, fooding, payment_id) values
(
  'atin2021',
  1,
  '2023-03-09',
  '2023-03-12',
  'y',
  1
);

*/