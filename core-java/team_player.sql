CREATE TABLE IF NOT EXISTS team_details(
	team_id SERIAL,
	name varchar(200),
	label varchar(5),
	CONSTRAINT pk_team_id PRIMARY KEY(team_id),
	CONSTRAINT un_name UNIQUE(name),
	CONSTRAINT un_label UNIQUE(label)
);

insert into team_details(label,name) values('RCB','Royal Challengers Bangalore');
insert into team_details(label,name) values('MI','Mumbai Indians');
insert into team_details(label,name) values('CSK','Chennai Super Kings');
insert into team_details(label,name) values('DC','Delhi Capitals');
insert into team_details(label,name) values('RR','Rajasthan Royals');
insert into team_details(label,name) values('SRH','Sunrisers Hyderbad');
insert into team_details(label,name) values('PBKS','Punjab Kings');
insert into team_details(label,name) values('KKR','Kolkata Knight Riders');
insert into team_details(label,name) values('GT','Gujarat Titans');
insert into team_details(label,name) values('LSG','Lucknow Super Giants');


select * from team_details;




CREATE TABLE IF NOT EXISTS player_details(
   id         SERIAL PRIMARY key,
   name       VARCHAR(22) NOT NULL
  ,role       VARCHAR(11) NOT NULL
  ,amount     INTEGER  NOT NULL
  ,country    VARCHAR(12) NOT NULL
  ,team_label VARCHAR(4),
  constraint fk_team_label foreign key(team_label) references team_details(label)
);
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shubman Gill','Batsman',80000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sai Sudarshan','Batsman',2000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Abhinav Sadarangani','Batsman',26000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jason Roy','Batsman',20000000,'England','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('David Miller','Batsman',30000000,'South Africa','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Matthew Wade','WK-Batsman',24000000,'Australia','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Wriddhiman Saha','WK-Batsman',19000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rashid Khan','Bowler',150000000,'Afghanistan','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Varun Aaron','Bowler',5000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Darshan Nalkande','Bowler',2000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Yash Dayal','Bowler',32000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Pradeep Sangwan','Bowler',2000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Alzarri Joseph','Bowler',24000000,'West Indies','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('R Sai Kishore','Bowler',30000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Noor Ahmad','Bowler',3000000,'Afghanistan','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Lockie Ferguson','Bowler',100000000,'New Zealand','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mohammed Shami','Bowler',62500000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Hardik Pandya','All-rounder',150000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Dominic Drakes','All-rounder',11000000,'West Indies','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Vijay Shankar','All-rounder',14000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jayant Yadav','All-rounder',17000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Gurkeerat Singh Mann','All-rounder',5000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rahul Tewatia','All-rounder',90000000,'India','GT');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('MS Dhoni','WK-Batsman',120000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ruturaj Gaikwad','Batsman',60000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Robin Uthappa','Batsman',20000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ambati Rayudu','WK-Batsman',67500000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Devon Conway','Batsman',10000000,'New Zealand','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Subhranshu Senapati','Batsman',2000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Hari Nishaanth','Batsman',2000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('N Jagadeesan','WK-Batsman',2000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Deepak Chahar','Bowler',140000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('KM Asif','Bowler',2000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Tushar Deshpande','Bowler',2000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Maheesh Theekshana','Bowler',7000000,'Sri Lanka','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Simranjeet Singh','Bowler',2000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Adam Milne','Bowler',19000000,'New Zealand','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mukesh Choudhary','Bowler',2000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Prashant Solanki','Bowler',12000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mitchell Santner','Bowler',19000000,'New Zealand','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rajvardhan Hangargekar','Bowler',15000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ravindra Jadeja','All-rounder',160000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Moeen Ali','All-rounder',80000000,'England','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Dwayne Bravo','All-rounder',44000000,'West Indies','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shivam Dube','All-rounder',40000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Dwaine Pretorius','All-rounder',5000000,'South Africa','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Bhagath Varma','All-rounder',2000000,'India','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Chris Jordan','All-rounder',36000000,'England','CSK');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rishabh Panty','WK-Batsman',160000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Prithvi Shaw','Batsman',75000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('David Warner','Batsman',62500000,'Australia','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ashwin Hebbar','Batsman',2000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sarfaraz Khan','Batsman',2000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('KS Bharat˜','WK-Batsman',20000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Yash Dhull','Batsman',5000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mandeep Singh','Batsman',11000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rovman Powell','Batsman',28000000,'West Indies','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Tim Seifert','WK-Batsman',5000000,'New Zealand','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Anrich Nortje','Bowler',65000000,'South Africa','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shardul Thakur','Bowler',107500000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Kamlesh Nagarkoti','Bowler',11000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mustafizur Rahman','Bowler',20000000,'Bangladesh','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Lungi Ngidi','Bowler',5000000,'South Africa','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Khaleel Ahmed','Bowler',52500000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Chetan Sakariya','Bowler',42000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Praveen Dubey','Bowler',5000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Kuldeep Yadav','Bowler',20000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Axar Patel','All-rounder',90000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mitchell Marsh','All-rounder',65000000,'Australia','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Lalit Yadav','All-rounder',6500000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ripal Patel','All-rounder',2000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Vicky Ostwal','All-rounder',2000000,'India','DC');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shreyas Iyer','Batsman',122500000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Nitish Rana','Batsman',80000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ajinkya Rahane','Batsman',10000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rinku Singh','Batsman',5500000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Abhijeet Tomar','Batsman',4000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Pratham Singh','Batsman',2000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Alex Hales','Batsman',15000000,'England','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ramesh Kumar','Batsman',2000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sheldon Jackson','WK-Batsman',6000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sam Billings','WK-Batsman',20000000,'England','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Baba Indrajith','Batsman',2000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Varun Chakravarty','Bowler',80000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Pat Cummins','Bowler',72500000,'Australia','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rasikh Dar','Bowler',2000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ashok Sharma','Bowler',5500000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Tim Southee','Bowler',15000000,'New Zealand','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Umesh Yadav','Bowler',20000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Chamika Karunaratne','Bowler',5000000,'Sri Lanka','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shivam Mavi','Bowler',72500000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Andre Russell','All-rounder',120000000,'West Indies','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Venkatesh Iyer','All-rounder',80000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sunil Narine','All-rounder',60000000,'West Indies','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Anukul Roy','All-rounder',2000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Nitish Rana','All-rounder',80000000,'India','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mohammad Nabi','All-rounder',10000000,'Afghanistan','KKR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Manan Vohra','Batsman',2000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Evin Lewis','Batsman',20000000,'West Indies','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Manish Pandey','Batsman',46000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('KL Rahul','WK-Batsman',170000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Quinton de Kock','WK-Batsman',67500000,'South Africa','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ravi Bishnoi','Bowler',40000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Dushmantha Chameera','Bowler',20000000,'Sri Lanka','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shahbaz Nadeem','Bowler',5000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mohsin Khan','Bowler',2000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mayank Yadav','Bowler',2000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ankit Rajpoot','Bowler',5000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Avesh Khan','Bowler',100000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mark Wood','Bowler',75000000,'England','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Marcus Stoinis','All-rounder',92000000,'Australia','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Kyle Mayers','All-rounder',5000000,'West Indies','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Karan Sharma','All-rounder',2000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('K Gowtham','All-rounder',9000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ayush Badoni','All-rounder',2000000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Deepak Hooda','All-rounder',57500000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Krunal Pandya','All-rounder',82500000,'India','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jason Holder','All-rounder',87500000,'West Indies','LSG');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rohit Sharma','Batsman',160000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Suryakumar Yadav','Batsman',80000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Tilak Varma','Batsman',17000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ramandeep Singh','Batsman',2000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rahul Buddhi','Batsman',2000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Anmolpreet Singh','Batsman',2000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Dewald Brevis','Batsman',30000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Aryan Juyal','WK-Batsman',2000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ishan Kishan','WK-Batsman',152500000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jasprit Bumrah','Bowler',120000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mohammad Arshad Khan','Bowler',2000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jaydev Unadkat','Bowler',13000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mayank Markande','Bowler',6500000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jofra Archer','Bowler',80000000,'England','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Tymal Mills','Bowler',15000000,'England','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Riley Meredith','Bowler',10000000,'Australia','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Murugan Ashwin','Bowler',16000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Basil Thampi','Bowler',3000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Kieron Pollard','All-rounder',60000000,'West Indies','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Hrithik Shokeen','All-rounder',2000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Arjun Tendulkar','All-rounder',3000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sanjay Yadav','All-rounder',5000000,'India','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Daniel Sams','All-rounder',26000000,'Australia','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Tim David','All-rounder',82500000,'Singapore','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Fabian Allen','All-rounder',7500000,'West Indies','MI');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mayank Agarwal','Batsman',120000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Prerak Mankad','Batsman',2000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Bhanuka Rajapaksa','Batsman',5000000,'Sri Lanka','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shahrukh Khan','Batsman',90000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shikhar Dhawan','Batsman',82500000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Prabhsimran Singh','WK-Batsman',6000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jitesh Sharma','WK-Batsman',2000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jonny Bairstow','WK-Batsman',67500000,'England','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Arshdeep Singh','Bowler',40000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Writtick Chatterjee','Bowler',2000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Odean Smith','Bowler',60000000,'West Indies','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sandeep Sharma','Bowler',5000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Raj Bawa','Bowler',20000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Nathan Ellis','Bowler',7500000,'Australia','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Vaibhav Arora','Bowler',20000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ishan Porel','Bowler',2500000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Harpreet Brar','Bowler',38000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rahul Chahar','Bowler',52500000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Kagiso Rabada','Bowler',92500000,'South Africa','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Benny Howell','All-rounder',4000000,'England','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Baltej Singh','All-rounder',2000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ansh Patel','All-rounder',2000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Liam Livingstone','All-rounder',115000000,'England','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rishi Dhawan','All-rounder',5500000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Atharva Taide','All-rounder',2000000,'India','PBKS');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Yashasvi Jaiswal','Batsman',40000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Karun Nair','Batsman',14000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rassie van der Dussen','Batsman',10000000,'South Africa','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Devdutt Padikkal','Batsman',77500000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shimron Hetmyer','Batsman',85000000,'West Indies','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sanju Samson','WK-Batsman',140000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jos Buttler','WK-Batsman',100000000,'England','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Dhruv Jurel','WK-Batsman',2000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shubham Garhwal','Bowler',2000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Kuldip Yadav','Bowler',2000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Nathan Coulter-Nile','Bowler',20000000,'Australia','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Navdeep Saini','Bowler',26000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Kuldeep Sen','Bowler',2000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Obed McCoy','Bowler',7500000,'West Indies','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Tejas Baroka','Bowler',2000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('KC Kariappa','Bowler',3000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Yuzvendra Chahal','Bowler',65000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Prasidh Krishna','Bowler',100000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Trent Boult','Bowler',80000000,'New Zealand','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Anunay Singh','All-rounder',2000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('James Neesham','All-rounder',15000000,'New Zealand','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Daryl Mitchell','All-rounder',7500000,'New Zealand','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Riyan Parag','All-rounder',38000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Ravichandran Ashwin','All-rounder',50000000,'India','RR');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Virat Kohli','Batsman',150000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Suyash Prabhudessai','Batsman',3000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Faf du Plessis','Batsman',70000000,'South Africa','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Dinesh Karthik','WK-Batsman',55000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Anuj Rawat','WK-Batsman',34000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Finn Allen','WK-Batsman',8000000,'New Zealand','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Luvnith Sisodia','WK-Batsman',2000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mohammed Siraj','Bowler',70000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Karn Sharma','Bowler',5000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Jason Behrendorff','Bowler',7500000,'Australia','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Siddarth Kaul','Bowler',7500000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Chama Milind','Bowler',2500000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Josh Hazlewood','Bowler',77500000,'Australia','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Harshal Patel','Bowler',107500000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Akash Deep','Bowler',2000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Glenn Maxwell','All-rounder',110000000,'Australia','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('David Willey','All-rounder',20000000,'England','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Mahipal Lomror','All-rounder',9500000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sherfane Rutherford','All-rounder',10000000,'West Indies','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Aneeshwar Gautam','All-rounder',2000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shahbaz Ahmed','All-rounder',24000000,'India','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Wanindu Hasaranga','All-rounder',107500000,'Sri Lanka','RCB');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Kane Williamson','Batsman',140000000,'New Zealand','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Aiden Markram','Batsman',26000000,'South Africa','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shashank Singh','Batsman',2000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('R Samarth','Batsman',2000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Rahul Tripathi','Batsman',85000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Priyam Garg','Batsman',2000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Glenn Phillips','WK-Batsman',15000000,'New Zealand','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Vishnu Vinod','WK-Batsman',5000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Nicholas Pooran','WK-Batsman',107500000,'West Indies','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Umran Malik','Bowler',40000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Saurabh Dubey','Bowler',2000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Romario Shepherd','Bowler',77500000,'West Indies','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Fazal Haq Farooqi','Bowler',5000000,'Afghanistan','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('J Suchith','Bowler',2000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Shreyas Gopal','Bowler',7500000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Kartik Tyagi','Bowler',40000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('T Natarajan','Bowler',40000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Bhuvneshwar Kumar','Bowler',42000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Abdul Samad','All-rounder',40000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Marco Jansen','All-rounder',42000000,'South Africa','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Sean Abbott','All-rounder',24000000,'Australia','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Abhishek Sharma','All-rounder',65000000,'India','SRH');
INSERT INTO player_details(name,role,amount,country,team_label) VALUES ('Washington Sundar','All-rounder',87500000,'India','SRH');

select * from player_details;



select count(1) from player_details;

select country,count(1) from player_details group by country;

select team_label,count(*) from player_details group by team_label;

/*
 * Get team_label, count, max, min, avg, total amount of all the teams
 */

select team_label as label,count(*) as count, max(amount) as max_amount,min(amount) as min_amount, avg(amount) as avg_amount, sum(amount) as total_amount 
from player_details group by team_label;


select * from player_details where amount between 100000000 and 200000000;


select * from player_details  where name like 'R%' and name like '%n';

/*
 * Get players who are geeting amount 
 */

select * from player_details where amount in(100000000,150000000,170000000);



/*
 * Joins: (inner joins, outer joins)
 */

/*
 * Get team_name,team_label,total_amount of the all the teams
 */

select * from team_details;
select * from player_details;


select 
  t.name,
  p.team_label,
  sum(p.amount) 
from team_details t 
  inner join player_details p 
  on t.label=p.team_label 
  group by t.name,p.team_label;

/*
 * Get team_name,label,role, max amount of given team_label
 */
 
select t.name,p.team_label,p.role,max(p.amount) as max from player_details p inner join team_details t on t.label=p.team_label
where team_label='GT' group by team_label,role,t.name order by max desc ;



select * from player_details where amount = 2500000;

update player_details set amount = 2500000 where amount = 2000000;

select * from player_details where amount >= 150000000

delete from player_details where amount >= 150000000;


truncate table team_details cascade;

select * from player_details;




