

CREATE TABLE player_details (
  id serial primary key,
  name varchar(100),
  team_label varchar(10),
  role varchar(50),
  country varchar(100),
  amount float
);