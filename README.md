# spring-recipe-app

Spring Recipe Application

create table tasks (id int not null auto_increment, title varchar(20), description varchar(255), primary key (id));
create table user_task (user_id int not null, task_id int not null, primary key (user_id, task_id);
alter table user_task foreign key (user_id) references users (id);
alter table user_task foreign key (recipe_id) references tasks (id);

create user 'tm_user'@'localhost' identified by 'admin';
grant select on dbname.* to 'tm_user'@'localhost';
grant insert on dbname.* to 'tm_user'@'localhost';
grant delete on dbname.* to 'tm_user'@'localhost';
grant update on dbname.* to 'tm_user'@'localhost';
