create schema CafeOrderWeb;
Use CafeOrderWeb;

create table Beverages(Item_Name varchar(20), Cost int);
create table Snacks(Item_Name varchar(20), Cost int);
create table Staretrs(Item_Name varchar(20), Cost int);
create table Main_Menu(Item_Name varchar(20), Cost int);
create table Rice(Item_Name varchar(20), Cost int);

insert into Beverages values("Tea",  15);
insert into Beverages values("Coffee",  25);

insert into Snacks values("Dosa",  45);
insert into Snacks values("Idli",  30);

insert into Starters values("Tomato Soup",  60);
insert into Starters values("Manchow Soup",  80);

insert into Main_Menu values("Panner Butter Masala",  100);
insert into Main_Menu values("Butter Roti",  90);

insert into Rice values("Schezwan Rice",  100);
insert into Rice values("Jeera Rice",  70);

insert into Desserts values("Gulabjam",  120);
insert into Desserts values("Rasmali",  130);
