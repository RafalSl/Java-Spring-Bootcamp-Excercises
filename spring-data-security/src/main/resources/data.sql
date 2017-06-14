insert into users(username, password, enabled)
values ('jan', 'kowalski', true);

insert into authorities (username, authority)
values ('jan', 'ROLE_USER');