use `employee_directory`;
create table if not exists `employee` (
    `id` bigint not null auto_increment,
    `first_name` varchar(50) not null,
    `last_name` varchar(100),
    `email` varchar(150) not null unique,
    primary key (`id`)
);