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
					System.out.println("table dropped.....");
					pst.executeUpdate();
				  }catch(Exception e){
					System.out.println(e);
				}
				
			}
		};
		timer.schedule(task, 120000);
	}
	
	public void Snacks() {
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				try {
					Connection con=Connector.connect();
					PreparedStatement pst=con.prepareStatement("drop table snk_order");
					System.out.println("table dropped.....");
					pst.executeUpdate();
				  }catch(Exception e){
					System.out.println(e);
				}
				
			}
		};
		timer.schedule(task, 120000);
	}
	
	public void Stareters() {
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				try {
					Connection con=Connector.connect();
					PreparedStatement pst=con.prepareStatement("drop table str_order");
					System.out.println("table dropped.....");
					pst.executeUpdate();
				  }catch(Exception e){
					System.out.println(e);
				}
				
			}
		};
		timer.schedule(task, 120000);
	}
	
	public void MainMenu() {
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				try {
					Connection con=Connector.connect();
					PreparedStatement pst=con.prepareStatement("drop table mm_order");
					System.out.println("table dropped.....");
					pst.executeUpdate();
				  }catch(Exception e){
					System.out.println(e);
				}
				
			}
		};
		timer.schedule(task, 120000);
	}
	
	public void Rice() {
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				try {
					Connection con=Connector.connect();
					PreparedStatement pst=con.prepareStatement("drop table rice_order");
					System.out.println("table dropped.....");
					pst.executeUpdate();
				  }catch(Exception e){
					System.out.println(e);
				}
				
			}
		};
		timer.schedule(task, 120000);
	}
	
	public void desserts() {
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				try {
					Connection con=Connector.connect();
					PreparedStatement pst=con.prepareStatement("drop table des_order");
					System.out.println("table dropped.....");
					pst.executeUpdate();
				  }catch(Exception e){
					System.out.println(e);
				}
				
			}
		};
		timer.schedule(task, 120000);
	}
	
}
