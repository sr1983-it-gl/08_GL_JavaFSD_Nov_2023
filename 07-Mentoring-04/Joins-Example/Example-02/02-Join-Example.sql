select * from A;
select * from B;

-- 3 * 4 = 12
select * from A, B;

select * from A inner join B;

select * from A inner join B;

select * from A inner join B ON (A.X = B.X);

select * from A inner join B ON 
(A.X = B.X AND A.Y = B.Y);


select A.X, sum(A.Y) from A inner join B
group by A.X;

