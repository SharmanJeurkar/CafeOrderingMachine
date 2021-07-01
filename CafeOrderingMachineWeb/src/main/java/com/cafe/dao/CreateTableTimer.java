package com.cafe.dao;
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;

public class CreateTableTimer {
	
	
	
	public void beverages() {
			
			Timer timer=new Timer();
			TimerTask task=new TimerTask() {
				
				@Override
				public void run() {
					try {
						Connection con=Connector.connect();
						PreparedStatement pst=con.prepareStatement("create table bev_order(Item1 varchar(20), Item2 varchar(20), Item3 varchar(20), Item4 varchar(20), Item5 varchar(20))");
						
						pst.executeUpdate();
					  }catch(Exception e){
						System.out.println(e);
					}
					
				}
			};
			timer.schedule(task, 3600000);
		}
		
		public void snacks() {
			
			Timer timer=new Timer();
			TimerTask task=new TimerTask() {
				
				@Override
				public void run() {
					try {
						Connection con=Connector.connect();
						PreparedStatement pst=con.prepareStatement("create table snk_order(Item1 varchar(20), Item2 varchar(20), Item3 varchar(20), Item4 varchar(20), Item5 varchar(20))");
						
						pst.executeUpdate();
					  }catch(Exception e){
						System.out.println(e);
					}
					
				}
			};
			timer.schedule(task, 3600000);
		}
		
		public void stareters() {
			
			Timer timer=new Timer();
			TimerTask task=new TimerTask() {
				
				@Override
				public void run() {
					try {
						Connection con=Connector.connect();
						PreparedStatement pst=con.prepareStatement("create table str_order(Item1 varchar(20), Item2 varchar(20), Item3 varchar(20), Item4 varchar(20), Item5 varchar(20))");
						
						pst.executeUpdate();
					  }catch(Exception e){
						System.out.println(e);
					}
					
				}
			};
			timer.schedule(task, 3600000);
		}
		
		public void mainMenu() {
			
			Timer timer=new Timer();
			TimerTask task=new TimerTask() {
				
				@Override
				public void run() {
					try {
						Connection con=Connector.connect();
						PreparedStatement pst=con.prepareStatement("create table mm_order (Item1 varchar(20), Item2 varchar(20), Item3 varchar(20), Item4 varchar(20), Item5 varchar(20))");
						
						pst.executeUpdate();
					  }catch(Exception e){
						System.out.println(e);
					}
					
				}
			};
			timer.schedule(task, 3600000);
		}
		
		public void rice() {
			
			Timer timer=new Timer();
			TimerTask task=new TimerTask() {
				
				@Override
				public void run() {
					try {
						Connection con=Connector.connect();
						PreparedStatement pst=con.prepareStatement("create table rice_order (Item1 varchar(20), Item2 varchar(20), Item3 varchar(20), Item4 varchar(20), Item5 varchar(20))");
						
						pst.executeUpdate();
					  }catch(Exception e){
						System.out.println(e);
					}
					
				}
			};
			timer.schedule(task, 3600000);
		}
		
		public void desserts() {
			
			Timer timer=new Timer();
			TimerTask task=new TimerTask() {
				
				@Override
				public void run() {
					try {
						Connection con=Connector.connect();
						PreparedStatement pst=con.prepareStatement("create table des_order (Item1 varchar(20), Item2 varchar(20), Item3 varchar(20), Item4 varchar(20), Item5 varchar(20))");
						
						pst.executeUpdate();
					  }catch(Exception e){
						System.out.println(e);
					}
					
				}
			};
			timer.schedule(task, 3600000);
		}
		
	}

	

