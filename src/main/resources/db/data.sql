insert into user_tb(username, password, created_at) values('ssar', '1234', now());

insert into board_tb(title, user_id, created_at) values('게시글', '1', now());


commit;