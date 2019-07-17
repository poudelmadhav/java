Connecting Database MySQL

- Viewing/Querying/Selecting data from a table
    select <cols> from <table_name> <clauses...>;

    select id, name from students;

    courses

create table courses (
    id int primary key auto_increment,
    name varchar(255) not null,
    status smallint(4) default '1' not null
);

insert into courses(name) values("csit");
insert into courses(name) values("bca");

alter table students add column course_id int;
update table students set course_id=1;

alter table students modify column course_id int not null;

alter table students add foreign key(course_id) references courses(id);