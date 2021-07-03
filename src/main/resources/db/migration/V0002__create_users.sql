create table users
(
    id uuid not null
        constraint users_pkey
            primary key,
    name varchar(255) not null
        constraint uc_users__name
            unique
);
