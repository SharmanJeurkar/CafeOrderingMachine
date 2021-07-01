package com.cafe.dao;

import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;

public class DeleteTableTimer {
	public void beverages() {
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				try {
					Connection con=Connector.connect();
					PreparedStatement pst=con.prepareStatement("drop table bev_order");
					
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
					PreparedStatement pst=con.prepareStatement("drop table snk_order");
					
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
					PreparedStatement pst=con.prepareStatement("drop table str_order");
					
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
					PreparedStatement pst=con.prepareStatement("drop table mm_order");
					
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
					PreparedStatement pst=con.prepareStatement("drop table rice_order");
					
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
					PreparedStatement pst=con.prepareStatement("drop table des_order");
					
					pst.executeUpdate();
				  }catch(Exception e){
					System.out.println(e);
				}
				
			}
		};
		timer.schedule(task, 3600000);
	}
	
}
